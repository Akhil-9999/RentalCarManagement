import java.io.*;

// Class representing a Customer
class Customer {
    private String name;
    private int age;

    // Constructor
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to get customer details from user
    public static Customer getCustomerDetailsFromUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter customer name:");
        String name = reader.readLine();

        System.out.println("Enter customer age:");
        int age = Integer.parseInt(reader.readLine());

        return new Customer(name, age);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to save customer details to a file
    public void saveToFile(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(name + "," + age);
        writer.close();
    }
}
