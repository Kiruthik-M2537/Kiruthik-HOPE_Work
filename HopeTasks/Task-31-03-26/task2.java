public class task2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Innova");
        car1.setSpeed(120);
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Speed: " + car1.getSpeed());
        car1.displayCar();
    }
}
class Car {
    private String brand;
    private String model;
    private int speed;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setSpeed(int speed) {
        if (speed >= 0) {   // validation
            this.speed = speed;
        } else {
            System.out.println("Invalid speed!");
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getSpeed() {
        return speed;
    }
    public void displayCar() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
    }
}
