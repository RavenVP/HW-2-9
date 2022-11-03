package Market;

import Market.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    public static Set<Product> productsList = new HashSet();

    public static void addProductToList(Product addedProduct) {
        if (!productsList.contains(addedProduct)) {
            productsList.add(addedProduct);
        } else {
            throw new RuntimeException("Продукт уже имеется в корзине");
        }
    }

    public static void removeProductFromList(Product removedProduct) {
        if (productsList.contains(removedProduct)) {
            productsList.remove(removedProduct);
        }
    }

    public static void checkProductInList(Product checkedProduct) {
        if (productsList.contains(checkedProduct)) {
            System.out.println(checkedProduct + " уже куплен");
        } else {
            System.out.println(checkedProduct + " ещё не куплен");
        }
    }

    public static void printProductList() {
        for (Product products : productsList) {
            System.out.println(products.getName() + " || " + products.getPrice() + "₽ || " + products.getWeight() + "Кг");
        }
    }
}




