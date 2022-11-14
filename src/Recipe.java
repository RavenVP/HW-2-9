import Market.Product;

import java.util.*;

public class Recipe {
    private final String recipeName;
    private final HashMap<Product, Integer> products = new HashMap<Product, Integer>();

    public Recipe(String name) {
        this.recipeName = name;
    }

     public void addProductInRecipe(Product product, int quantityOfProducts) {
        if (!products.containsKey(product)) {
            products.put(product,quantityOfProducts);
        } else {
            throw new RuntimeException("Уже есть");
        }
    }

    public int totalRecipeCost() {
        int sum = 0;
        for (Product product : products.keySet()) {
            sum += products.get(product) * product.getPrice();
        }
        return sum;
    }




    public String getRecipeName() {return recipeName;}
    public int getTotalCost() {return totalRecipeCost();}
    public HashMap<Product,Integer> getProducts() {return products;}

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeName='" + getRecipeName() + '\'' +
                ", totalCost=" + getTotalCost() +
                ", products=" + getProducts() +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }
}
