import java.util.Scanner;

public class V012_WhileLoop {

    public static void main(String[] args) {

        // while loop = executes a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        //do{                                                Do loop works pretty much the same, it's a variation of
        //    System.out.print("Enter your name: ");         while loop. It will execute the loop at the end
        //    name = scanner.nextLine();
        //}while(name.isBlank());

        System.out.println("Hello "+ name);

    }
}
