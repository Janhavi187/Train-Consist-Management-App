import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("====================================\n");

        // Create array (unsorted input allowed)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure sorting (precondition for binary search)
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG309";

        // Display sorted bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // ---- BINARY SEARCH ----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = key.compareTo(bogieIds[mid]);

            if (compare == 0) {
                found = true;
                break;
            } else if (compare < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        // ---- RESULT ----
        System.out.println("\n\nSearching for Bogie ID: " + key);

        if (found) {
            System.out.println("Result: Bogie Found ✅");
        } else {
            System.out.println("Result: Bogie NOT Found ❌");
        }

        System.out.println("\nUC19 binary search completed...");
    }
}