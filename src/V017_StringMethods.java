public class V017_StringMethods {

    public static void main(String[] args) {

        // String = a reference data type that can store  one or more characters
        //          reference data types have access to useful methods

        String name = "Bengu";

        // boolean result = name.equals("Bengu"); // it is case sensitive. If it was lowercase, it would be false
                                                  // if you use name.equalsIgnoreCase, it won't be case sensitive
        // int result = name.length();               it will return the length of the variable

        // char result = name.charAt(0);             it will print the character at given index (0 is first letter)

        // int result = name.indexOf("e");           it will print the index of the given character

        // boolean result = name.isEmpty();          it will return True/False based on if something is assigned in name variable

        // String result = name.toUpperCase();       it will make everything uppercase

        // String result = name.toLowerCase();       it will make everything lowercase

        // String result = name.trim();              it will remove all the empty spaces in the variable

        // String result = name.replace('e', 'u');   it will replace all "e" with "u"

        //System.out.println(result);

    }
}
