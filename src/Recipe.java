import Market.Product;

import java.util.*;

public class Recipe {
    private final String recipeName;
    private int totalCost;
    private final HashMap<Product, Integer> products = new HashMap<Product, Integer>();

    public Recipe(String name) {
        this.recipeName = name;
        this.totalCost = 0;

    }

     public void addProductInRecipe(Product product, int quantityOfProducts) {
        if (!products.containsKey(product)) {
            products.put(product,quantityOfProducts);
        } else {
            throw new RuntimeException("Уже есть");
        }
        totalCost += quantityOfProducts * product.getPrice();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return totalCost == recipe.totalCost && Objects.equals(recipeName, recipe.recipeName) && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName, totalCost, products);
    }

    public String getRecipeName() {return recipeName;}
    public int getTotalCost() {return totalCost;}
    public HashMap<Product,Integer> getProducts() {return products;}

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeName='" + recipeName + '\'' +
                ", totalCost=" + totalCost +
                ", products=" + products +
                ", quantityOfProducts=" +
                '}';
    }
}
