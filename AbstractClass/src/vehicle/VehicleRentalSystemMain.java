package vehicle;

public class VehicleRentalSystemMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("UP80CA1234", 2000, "CARINS123"),
            new Bike("UP80BK5678", 800, "BIKEINS456"),
            new Truck("UP80TR9012", 5000, "TRUCKINS789")
        };

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: ₹" + v.calculateRentalCost(rentalDays));

            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance Cost: ₹" + i.calculateInsurance());
                System.out.println(i.getInsuranceDetails());
            }

            System.out.println("------------------------------------");
        }
    }
}
