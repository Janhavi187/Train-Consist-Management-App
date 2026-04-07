public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("====================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search
        String searchId = "BG309";

        // ---- DISPLAY ALL ----
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // ---- LINEAR SEARCH ----
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // stop early
            }
        }

        // ---- RESULT ----
        System.out.println("\n\nSearching for Bogie ID: " + searchId);

        if (found) {
            System.out.println("Result: Bogie Found ✅");
        } else {
            System.out.println("Result: Bogie NOT Found ❌");
        }

        System.out.println("\nUC18 search completed...");
    }
}