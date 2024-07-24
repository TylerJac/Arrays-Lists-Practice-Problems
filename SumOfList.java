import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter a  number (or 0 to stop): ");
        int input = scanner.nextInt();
        while (input != 0) {
            numbers.add(input);
            System.out.println("Enter a number (or 0 to stop): ");
            input = scanner.nextInt();
        }
        int sum = 0;
        for (int number : numbers) {

            sum += number;
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print("and " + numbers.get(i));
            } else {
                System.out.print(numbers.get(i));
                if (i != numbers.size() - 2) {
                    System.out.print(", ");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println(" were the items in the list. The sum of that list is: " + sum);
    }
}
