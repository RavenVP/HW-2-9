import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tasks {

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
            for (int i = 0; i < 20; i++) {
                int random = (int) (Math.random() * 1000);
                numbers.add(random);
            }
            numbers.removeIf(integer -> integer %2 != 0);
            System.out.println(numbers);

        }

    }



