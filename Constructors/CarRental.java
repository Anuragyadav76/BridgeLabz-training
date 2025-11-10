package Constructors;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000;

    CarRental() {
        customerName = "Unknown";
        carModel = "Basic";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * dailyRate;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total Cost: ₹" + calculateCost());
    }

    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Anurag", "Swift", 5);

        cr1.display();
        cr2.display();
    }
}

