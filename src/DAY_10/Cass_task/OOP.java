package DAY_10.Cass_task;

public class OOP{
    public static void main(String[] args) {

        car car1 = new car();
        System.out.println(car1.brand);
        car1.colour="red";
        System.out.println(car1.colour);
        car car2=new car();
        System.out.println(car2.brand);
        System.out.println(car2.model);
        car2.colour=car1.colour;
        System.out.println(car2.colour);
        System.out.print(car1.brand+" car is ");
                car1.drive();



    }


}


 class car {
        String brand="TATA";
        String model;
        String colour="white";

    public void drive () {
        System.out.print("Driving");
    }

    }






