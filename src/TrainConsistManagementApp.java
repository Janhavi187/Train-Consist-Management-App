public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("====================================\n");

        // Create bogie array (EMPTY case)
        String[] bogieIds = {};

        // Search key
        String searchId = "BG101";

        try {
            // ---- FAIL-FAST VALIDATION ----
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available in train. Cannot perform search.");
            }

            // ---- SEARCH LOGIC ----
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // ---- RESULT ----
            if (found) {
                System.out.println("Result: Bogie Found ✅");
            } else {
                System.out.println("Result: Bogie NOT Found ❌");
            }

        } catch (IllegalStateException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}