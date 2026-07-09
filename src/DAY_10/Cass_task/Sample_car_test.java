package DAY_10.Class_task;

public class SampleCarTest {
    public static void main(String[] args) {

        Car07 cc = new Car07();
        cc.brand = "BMW";
        cc.model = "SUV";
        cc.colour = "Red";

        cc.accelerate();
        cc.accelerate();

        Car07 c2 = new Car07();
        c2.brand = "Benz";
        c2.model = "Vintage";
        c2.colour = "Black";

        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();

        c2.brake();
        c2.brake();
        c2.brake();
        c2.brake();
        c2.brake();
    }
}

class Car07 {
    String brand;
    String model;
    String colour;

    int speed = 0;
    int maxSpeed = 40;

    public void drive() {
        System.out.println("The car is driving.");
    }

    public void details() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Colour: " + colour);
    }

    public void accelerate() {
        if (speed >= maxSpeed) {
            System.out.println(brand + " reached maximum speed.");
        } else {
            speed = speed + 5;
            System.out.println(brand + " car speed is " + speed + " km/h");
        }
    }

    public void brake() {
        if (speed == 0) {
            System.out.println("The car is not moving.");
        } else {
            speed = speed - 5;
            System.out.println("Brake applied. Speed is " + speed + " km/h");
        }
    }
}