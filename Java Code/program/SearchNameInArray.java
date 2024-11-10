import java.util.Scanner;

public class SearchNameInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Prompt user to enter the name to search
        System.out.print("Enter the name to search: ");
        String searchName = scanner.nextLine();

        // Search for the name in the array
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (searchName == names[i]) {
                System.out.println("Name found at index: " + i);
                found = true;
                break;
            }
        }

        // If name is not found
        if (!found) {
            System.out.println("Name not found in the array.");
        }

        scanner.close();
    }
}
