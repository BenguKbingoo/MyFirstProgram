import java.util.ArrayList;

public class V021_ForEachLoop {

    public static void main(String[] args) {

        // for-each = traversing technique to iterate through the elements in an array/collection
        //            Less steps, more readable
        //            Less flexible

        //String[] animals = {"cat", "dog", "rat", "bird"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i : animals) {
            System.out.println(i);
        }

    }
}
