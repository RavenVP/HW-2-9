import Market.Product;
import Market.ProductList;

public class Main {
    public static void main(String[] args) {
        Product cucumber = new Product("Огрурец", 15, 1);
        Product tomato = new Product("Томат", 10, 1);
        Product grape = new Product("Виноград", 20, 1);

//        ProductList.addProductToList(cucumber);
//        ProductList.addProductToList(tomato);
//        ProductList.addProductToList(grape);
//        ProductList.removeProductFromList(tomato);
//        ProductList.checkProductInList(tomato);
//        ProductList.printProductList();

        Recipe cake = new Recipe("Торт");
        cake.addProductInRecipe(grape,10);

        Recipe salad = new Recipe("Салат");
        salad.addProductInRecipe(cucumber, 10);
        salad.addProductInRecipe(tomato,10);

        BookOfRecipe.addRecipe(salad);
        BookOfRecipe.addRecipe(cake);

        System.out.println(salad);
        System.out.println(cake);

        BookOfRecipe.printBookOfRecipe();
    }
}