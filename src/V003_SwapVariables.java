public class V003_SwapVariables {

    public static void main(String[] args) {

        String x = "water";
        String y = "Kool-Aid";
        String temp;  // use a third variable to help with switching process

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
    }
}
