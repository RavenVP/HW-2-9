import java.util.HashSet;
import java.util.Set;

public class BookOfRecipe {
    public static Set<Recipe> recipes = new HashSet<>();


    public static void addRecipe(Recipe recipe) {
        for (var alreadyUsed : recipes) {
            if (alreadyUsed.getRecipeName().equals(recipe.getRecipeName())) {
                throw new RuntimeException(" Такой рецепт уже есть");
            }
        }
        recipes.add(recipe);
    }


    public static void printBookOfRecipe() {
        System.out.println("|| Книга рецептов ||");
        for (Recipe recipe : recipes) {
            System.out.println("Имя рецепта -> " + recipe.getRecipeName());
            System.out.println(recipe.getProducts() +" Общая цена продуктов -> "+ recipe.getTotalCost());
            System.out.println("");
        }
    }
}
