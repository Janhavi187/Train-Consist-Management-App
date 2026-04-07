public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
        System.out.println("====================================\n");

        // Create array of capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // ---- DISPLAY ORIGINAL ----
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // ---- BUBBLE SORT ----
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // ---- DISPLAY SORTED ----
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}