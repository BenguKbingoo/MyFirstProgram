public class V005_ArithmeticExpressions {

    public static void main(String[] args) {

        // expression =  operands & operators
        // operands  =   values, variables, numbers, quantity
        // operators =   + - * / %

        double friends = 10;

        // friends = friends % 2; --> this is the long way

        // friends--; or friends++; --> shortcut

        friends = (double) friends / 3;   //it won't be 3.33 unless we use double or float

        System.out.println(friends);


    }
}
