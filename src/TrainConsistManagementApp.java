public class TrainConsistManagementApp {

    // ===== CUSTOM RUNTIME EXCEPTION =====
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ===== GOODS BOGIE CLASS =====
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety validation
        void assignCargo(String cargo) {

            try {
                // RULE: Rectangular bogie cannot carry Petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                    );
                }

                // Safe assignment
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Exception Caught: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed.\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("====================================\n");

        // ---- SAFE CASE ----
        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum"); // valid

        // ---- UNSAFE CASE ----
        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum"); // invalid

        // ---- CONTINUE PROGRAM ----
        GoodsBogie g3 = new GoodsBogie("Rectangular");
        g3.assignCargo("Grain"); // valid

        System.out.println("UC15 execution completed...");
    }
}