import java.util.Scanner;
import java.util.ArrayList;
public class HowLarge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string into the list (Starts at zero): ");
        ArrayList<String> array = new ArrayList<>();
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            System.out.print("Enter a string into the list (Starts at zero): ");
            if (input.isEmpty()) {
                System.out.println("The total amount of items in the list was: " + array.size());

                break;
            }
            array.add(input);
        }
        scan.close();
    }
}
