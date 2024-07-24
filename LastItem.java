import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string into the list (Starts at zero): ");
        ArrayList<String> items = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String user = scanner.nextLine();
            System.out.print("Enter a string into the list (Starts at zero): ");
            if (user.isEmpty()) {
                System.out.println("The last item in the list is: " + items.get(items.size() - 1));
                break;
            }
            items.add(user);
        }

        scanner.close();
    }
}
