import java.util.*;

public class App {
    // Write code that will:
    // 1. Store the following values in an ArrayList: 6, 3, 1, 2
    // The name of the ArrayList is up to you.
    // 2. Print the contents of your ArrayList using loops. This should work even if
    // I add more elements to your ArrayList. For example, I might add 7 to the
    // ArrayList and this should still work.
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }

        numbers.add(6);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        int index = 0;

        while (index < numbers.size()) {

            System.out.println(numbers.get(index));
            index++;
        }
    }
}
