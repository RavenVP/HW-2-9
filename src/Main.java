import Market.Product;
import Market.ProductList;

public class Main {
    public static void main(String[] args) {
        Product cucumber = new Product("Огрурец", 13, 1.5);
        Product tomato = new Product("Томат", 10, 1);
        Product grape = new Product("Виноград", 20, 2);

        ProductList.addProductToList(cucumber);
        ProductList.addProductToList(tomato);
        ProductList.addProductToList(grape);
        ProductList.removeProductFromList(tomato);
        ProductList.checkProductInList(tomato);
        ProductList.printProductList();

        Recipe cake = new Recipe("Торт");
        cake.addProductInRecipe(grape, 4);
        cake.addProductInRecipe(cucumber, 6);

        Recipe salad = new Recipe("Салат");
        salad.addProductInRecipe(tomato, 4);
        salad.addProductInRecipe(cucumber, 6);

        BookOfRecipe.addRecipe(salad);
        BookOfRecipe.addRecipe(cake);

        BookOfRecipe.printBookOfRecipe();


    }
}