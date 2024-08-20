package Challenges;

public class Challenge4 {

    public static void main(String[] args) {

        for(int i = 1; i<= 5; i++) {

            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }




    }
}

/*
                              *
                             ***
                            *****
                           *******
      *****               *********
     ******                *******
     *                      *****
    *******                  ***
   ********                   *
  *********
  **********
 ***********
 **********
 *********
 ********
 *******
 ******
 *****
 ****
 ***
 **
 *

 */