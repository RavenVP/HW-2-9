import java.util.HashSet;
import java.util.Set;

public class Tasks {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        int r;
        for (int i = 0; i < 20; i++) {
            numbers.add((int)Math.round(Math.random()*1000));
        }
        numbers.removeIf(integer -> integer % 2 != 0);
        System.out.println(numbers);
    }
}
