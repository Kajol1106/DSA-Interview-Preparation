class Vehicle {
    String make;
    String model;
    
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    
    public void startEngine() {
        System.out.println("Engine started.");
    }
}

class Car extends Vehicle {
    int year;
    
    public Car(String make, String model, int year) {
        super(make, model);
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }
    
    public void startEngine() {
        super.startEngine();
        System.out.println("Car engine started.");
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    
    public ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }
    
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    
    public void startEngine() {
        super.startEngine();
        System.out.println("Electric car engine started.");
    }
    
    public void elctricCarDetails() {
        System.out.println("Make: "+getMake());
        System.out.println("Model: "+getModel());
        System.out.println("Battery Capacity: "+getBatteryCapacity()+" kWh");
        System.out.println("Year of Manufacture: "+getYear());
    }
}
