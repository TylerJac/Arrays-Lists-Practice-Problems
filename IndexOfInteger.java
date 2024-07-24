import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers, 0 to stop:");
        int input = scanner.nextInt();

        while (input != 0) {
            numbers.add(input);
            input = scanner.nextInt();
        }

        System.out.println("Enter the integer you want to find:");
        int target = scanner.nextInt();

        for(Integer i : numbers) {
            if (i == target) {
                int index = numbers.indexOf(target);
                System.out.println("The index of " + target + " is " + index);
                numbers.set(index, 0);
            }
        }
        scanner.close();
    }
}