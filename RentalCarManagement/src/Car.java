// Parent class representing a Car
class Car {
    private final double totalCostPerDay; // Add total cost per day attribute
    private String make;
    private String model;
    private int year;
    private double mileage;
    private boolean availability;

    // Constructors
    public Car(String make, String model, int year, double mileage, boolean availability, double totalCostPerDay) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.availability = availability;
        this.totalCostPerDay = totalCostPerDay;
    }

    // Getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getTotalCostPerDay() { // Add method to retrieve total cost per day
        return totalCostPerDay;
    }


}

