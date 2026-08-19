import java.util.Map;
import java.util.HashMap;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;

public class Main {
    public static void main(String[] xyz){
        HashMap<String, Integer> items = new HashMap<>();
        // OR
        // Map<String, Integer> items = new HashMap<>();
        items.put("A ", 10);
        items.put("B ", 20);
        items.put("C ", 30);
        items.put("D ", 40);
        items.put("E ", 50);
        items.put("F ", 60);

        for (Map.Entry<String, Integer> entry : items.entrySet()){
            System.out.println("Item: " + entry.getKey() + "Count: " + entry.getValue());
        }

        // OR
        // for (HashMap.Entry<String, Integer> entry : items.entrySet()){ // Map.Entry can also be written as HashMap.Entry, since Map is just the general interface.
            // System.out.println("Item: " + entry.getKey() + "Count: " + entry.getValue());
        // }
    }
}