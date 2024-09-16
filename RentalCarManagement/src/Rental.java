import java.io.*;

// Class representing a Rental
class Rental {
    private final Car car;
    private final int rentalDuration;
    private final Customer customer;

    // Constructor
    public Rental(Car car, int rentalDuration, Customer customer) {
        this.car = car;
        this.rentalDuration = rentalDuration;
        this.customer = customer;
    }

    // Method to get rental details from user with rental duration
    public static Rental getRentalDetailsFromUser(Car car, Customer customer, int rentalDuration) {
        return new Rental(car, rentalDuration, customer);
    }

    // Method to calculate total cost based on rental duration
    public double getTotalCost() {
        return car.getTotalCostPerDay() * rentalDuration;
    }

    // Method to save rental details to a file
    public void saveToFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.format("%s,%d,%s,%d,%.2f", customer.getName(), customer.getAge(), car.getMake(), car.getYear(), getTotalCost()));
        }
    }
}
