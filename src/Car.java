public class Car {
        private String model;
        private String manufacturer;

        // Constructor
        public Car(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }

        // hashCode method override
        @Override
        public int hashCode() {
            return 31 * model.hashCode() + manufacturer.hashCode();
        }

        public static void main(String[] args) {
            // Create two Car objects with the same model and manufacturer
            Car car1 = new Car("Civic", "Honda");
            Car car2 = new Car("Civic", "Honda");

            // Check if the hash codes are the same
            System.out.println("Hash code for car1: " + car1.hashCode());
            System.out.println("Hash code for car2: " + car2.hashCode());
            System.out.println("Are the objects equal? " + car1.equals(car2)); // Note: equals method should also be overridden
        }
    }