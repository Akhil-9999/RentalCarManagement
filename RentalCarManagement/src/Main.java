import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Get customer details from user
        Customer customer = Customer.getCustomerDetailsFromUser();

        // Save customer details to a file
        customer.saveToFile("customer.txt");
        System.out.println("Customer details saved successfully.");

        // Load car details from file
        Car availableCar = loadCarFromFile("car.txt");

        // Get rental duration from user
        System.out.println("Enter rental duration (in days):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rentalDuration = Integer.parseInt(reader.readLine());

        // Get rental details from the user with rental duration
        Rental rental = Rental.getRentalDetailsFromUser(availableCar, customer, rentalDuration);

        // Save rental details to a file
        rental.saveToFile("rental.txt");
        System.out.println("Rental details saved successfully.");

        // Display loaded car details and total cost
        System.out.println("Available Car Details:");
        System.out.println("Make: " + availableCar.getMake());
        System.out.println("Model: " + availableCar.getModel());
        System.out.println("Year: " + availableCar.getYear());
        System.out.println("Mileage: " + availableCar.getMileage());
        System.out.println("Availability: " + availableCar.isAvailability());
        System.out.println("Total Cost: $" + rental.getTotalCost());
    }

    // Method to load car details from a file
    public static Car loadCarFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String[] data = reader.readLine().split(",");
        reader.close();
        return new Car(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]), Boolean.parseBoolean(data[4]), Integer.parseInt(data[5]));
    }
}
