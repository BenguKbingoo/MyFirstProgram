import java.util.Scanner;

public class V011_LogicalOperators {

    public static void main(String[] args) {

        // logical operators = used to connect two or more expressions
        //
        //                && = (AND) both conditions must be true
        //                || = (OR) either condition must be true
        //                 ! = (NOT) reverses boolean value of a condition



        // Example of &&
        //
        //int temp = 25;
        //if(temp>30){
        //   System.out.println("It is hot outside");
        //}
        //else if(temp>=20 && temp<=30){   // both of these conditions need to be true
        //    System.out.println("It is warm outside");
        //}
        //else {
        //    System.out.println("It is cold outside");
        //}



        // Example of ||
        //
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("You are playing a game! Press q or Q to quit");
        //String response = scanner.next();
        //if(response.equals("q") || response.equals("Q")){
        //    System.out.println("You quit the game");
        //}
        //else {
        //    System.out.println("You are still playing the game *pew pew*");
        //}



        // Example of !

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")){   // if our response is NOT equal to "q" and NOT equal to "Q"
            System.out.println("You are still playing the game *pew pew*");
        }
        else {
            System.out.println("You quit the game");
        }

    }
}
