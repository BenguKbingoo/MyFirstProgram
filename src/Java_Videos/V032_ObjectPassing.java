package Java_Videos;

public class V032_ObjectPassing {

    public static void main(String[] args){

        Garage_32 garage = new Garage_32();
        Car_32 car1 = new Car_32("BMW");
        Car_32 car2 = new Car_32("Tesla");


        garage.park(car1);
        garage.park(car2);

    }

}
