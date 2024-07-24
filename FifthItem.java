import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string into the list (Starts at zero): ");
        ArrayList<String> array = new ArrayList<>();
        while (s.hasNextLine()) {
            String input = s.nextLine();
            System.out.print("Enter a string into the list (Starts at zero): ");
            if (input.isEmpty()) {
                System.out.println("The fifth item in the list is: " + array.get(4));
                break;
            }
            array.add(input);
        }
        s.close();
    }
}
