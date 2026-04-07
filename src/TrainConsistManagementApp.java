public class TrainConsistManagementApp {

    // ===== CUSTOM EXCEPTION =====
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ===== PASSENGER BOGIE CLASS =====
    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {

            // VALIDATION (fail-fast)
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("====================================\n");

        try {
            // ---- VALID BOGIES ----
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 56);

            System.out.println("Valid Bogies Created:");
            System.out.println(b1.name + " -> " + b1.capacity);
            System.out.println(b2.name + " -> " + b2.capacity);

            // ---- INVALID BOGIE ----
            System.out.println("\nCreating Invalid Bogie...");
            PassengerBogie b3 = new PassengerBogie("First Class", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("\nUC14 validation completed...");
    }
}