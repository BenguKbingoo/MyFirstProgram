public class V015_Arrays {

    public static void main(String[] args) {

        // array = used to store multiple values in a single variable

        //String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};  // this is a String array so you can only add Strings
        //cars[0] = "Mustang";
        //System.out.println(cars[3]);

        String[] cars = new String[3]; // we can say how many things will be in  the array and then assign each one

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for(int i = 0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }


    }
}
