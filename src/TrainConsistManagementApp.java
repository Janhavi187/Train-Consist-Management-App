import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("====================================\n");

        // Create LinkedHashSet (order + uniqueness)
        Set<String> trainFormation = new LinkedHashSet<>();

        // ---- ADD BOGIES (with duplicate) ----
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Duplicate entry (should be ignored)
        trainFormation.add("Sleeper");

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        // Note
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}