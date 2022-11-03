import Market.Product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String recipeName;
    private int totalCost = 0;
    private Set<Product> products = new HashSet<Product>();
    private int quantityOfProducts;

    public Recipe(String name) {
        this.recipeName = name;
    }

    public void addProductInRecipe(Product product, int quantityOfProducts) {
        if (!products.contains(product)) {
            products.add(product);
        } else {
            throw new RuntimeException("Уже есть");
        }
        totalCost += quantityOfProducts * product.getPrice();
    }




    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipes = (Recipe) o;
        return totalCost == recipes.totalCost && quantityOfProducts == recipes.quantityOfProducts && Objects.equals(recipeName, recipes.recipeName) && Objects.equals(products, recipes.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    public String getRecipeName() {return recipeName;}
    public int getTotalCost() {return totalCost;}
    public Set<Product> getProducts() {return products;}
    public int getQuantityOfProducts() {return quantityOfProducts;}

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeName='" + recipeName + '\'' +
                ", totalCost=" + totalCost +
                ", products=" + products +
                ", quantityOfProducts=" + quantityOfProducts +
                '}';
    }
}
