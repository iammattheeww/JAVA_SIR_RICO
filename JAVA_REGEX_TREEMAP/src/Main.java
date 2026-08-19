import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.TreeMap;
//import java.util.List;
//import java.util.ArrayList;
//
//
//public class Main {
//    public static void main(String[] args) {
//        // Initializing a list named myList
//        List<String> myList = new ArrayList<>();
//
//        // Calling methods on myList
//        myList.add("Apple");
//        myList.add("Banana");
//
//        System.out.println(myList.get(0)); // Outputs: Apple
//    }
//}

public class Main{
    public static void main(String[] xyz){
        TreeMap <Integer, String> myList = new TreeMap <Integer, String>();
        myList.put(123, "a");
        myList.put(456, "b");
        myList.put(789, "c");
        System.out.println(myList.get(1));
    }
}

