import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


// =================================================================================== //
// STRING SNIPPET
//class Main {
//    public static void main(String[] args) {
//        //New String
//
//        String myString = "Hello";
//        String myNew = new String(myString + "try");
//        System.out.println(myNew);
//    }
//}

// =================================================================================== //
// STRING & CONCATENATION
//class Main {
//    public static void main(String[] args) {
//        String x = "Hello";
//        String y = "World";
//        String foo = x.substring(2,4); // (left, right)
//        String z = foo.concat(" " + y);
//        System.out.println(foo);
//        System.out.println(z);
//    }
//}

// =================================================================================== //
// STRING BUILDER
//class Main {
//    public static void main(String[] args) {
//        //StringBuilder
//
//        StringBuilder x = new StringBuilder("Hello");
//        x.append(" World");
//        x.append(" There");
//        System.out.println(x);
//    }
//}

// =================================================================================== //
// STRING SPLIT
//class Main {
//    public static void main(String[] args) {
//        String myString = "The quick brown fox jump over a lazy dog";
//        String toGet[] = myString.split(" ");
//        for(String x:toGet){
//            System.out.println(x);
//        }
//    }
//}


// =================================================================================== //
// SUBSTRING
//class Main {
//    public static void main(String[] args) {
//        String x = "Hello";
//        String y = "World";
//        String foo = x.substring(0,2); //(left, right)
//        System.out.println(foo);
//    }
//}

// =================================================================================== //
// ARRAY LIST SNIPPETS

//public class Main{
//    public static void main (String[] std){
//        String myList[][] = {
//                {"Alpha", "0915", "Haha"},
//                {"Bravo", "0916"},
//                {"Charlie", "0917"},
//        };
//        for (int x=0;x<myList.length;x++){
//            System.out.println(Arrays.toString(myList[x]));
//            System.out.println("Location: " + myList[0][2]);
//        }
//    }
//}

// =================================================================================== //
// REGULAR EXPRESSIONS: PATTERNS SNIPPETS

//public class Main {
//    public static void main(String[] args){
//        // 1. Declare and initialize the input text string that will be evaluated against the regular expression.
//        // Simple terms: This is the sentence or text we want to check or search through.
//        String names = "Today is the day";
//
//        // 2. Define the regex pattern string. Here, '\\s+' searches for one or more consecutive whitespace characters (spaces, tabs).
//        // Simple terms: This is our search rule. '\\s+' looks for spaces between words.
//        String patt = "\\s+";
//
//        // 3. Compile the regular expression string into a reusable compiled representation using Pattern.compile().
//        // Simple terms: We convert our search rule from a plain text string into a formal search tool that Java can use.
//        Pattern pattern = Pattern.compile(patt);
//
//        // 4. Create a Matcher object by invoking matcher() on the pattern, binding it to the target input string for search operations.
//        // Simple terms: We load our sentence into the search tool so it knows what text to look at.
//        Matcher match = pattern.matcher(names);
//
//        // 5. Execute a while loop using match.find() to scan the input string sequentially and process every matched whitespace instance found.
//        // Simple terms: We keep checking the text step-by-step. Every time we find a space, we print out our pattern rule.
//        // Output Explanation: "Today is the day" has 3 spaces between the 4 words.
//        // Because '\\s+' matches each group of spaces, match.find() successfully matches 3 separate times,
//        // causing the loop to run 3 times and print the pattern string 3 times.
//        while(match.find()) System.out.println(patt);
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        // 1. Declare and initialize the target input string containing letters, symbols, or numbers to be checked.
//        // Simple terms: This is the text message we want to inspect character by character.
//        String names = "Hello World!";
//
//        // 2. Define the regex pattern string. The caret (^) inside square brackets acts as a negation, meaning this matches any single character that is NOT a digit from 0 to 9.
//        // Simple terms: This rule looks for anything that is NOT a number (it matches letters and symbols like H, e, l, o, space, !, etc.).
//        String patt = "[^0-9]";
//
//        // 3. Compile the regex syntax into a Pattern object for high-efficiency evaluation.
//        // Simple terms: We turn our non-digit search rule into a ready-to-use search engine object.
//        Pattern pattern = Pattern.compile(patt);
//
//        // 4. Instantiate the Matcher object linked to the target text to evaluate the non-digit pattern across the entire string.
//        // Simple terms: We connect our "Hello World!" text to the search engine so it can start scanning.
//        Matcher match = pattern.matcher(names);
//
//        // 5. Iterate through every character match found using match.find() and print the expression pattern for each valid occurrence.
//        // Simple terms: We loop through the text, find every non-number character one by one, and print out our rule for each match.
//        // Output Explanation: "Hello World!" has a total length of 12 characters, and NONE of them are numbers (0-9).
//        // Since every single character matches the rule "[^0-9]", match.find() succeeds for every character.
//        // Therefore, the loop runs exactly 12 times (once for each character), printing the pattern 12 times.
//        while(match.find()) System.out.println(patt);
//    }
//}

// =================================================================================== //
// REGULAR EXPRESSIONS: TREE MAP SNIPPETS

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

//public class Main{
//    public static void main(String[] xyz){
//        TreeMap<Integer, String> myList = new TreeMap <Integer, String>();
//        // OR
//        // Map <Integer, String> myList = new TreeMap <Integer, String>();
//        myList.put(123, "a");
//        myList.put(456, "b");
//        myList.put(789, "c");
//        System.out.println(myList.get(1));
//    }
//}

// =================================================================================== //
// REGULAR EXPRESSIONS: HASHMAP SNIPPETS
//public class Main {
//    public static void main(String[] xyz){
//        HashMap<String, Integer> items = new HashMap<>();
//        // OR
//        // Map<String, Integer> items = new HashMap<>();
//        items.put("A ", 10);
//        items.put("B ", 20);
//        items.put("C ", 30);
//        items.put("D ", 40);
//        items.put("E ", 50);
//        items.put("F ", 60);
//
//        for (Map.Entry<String, Integer> entry : items.entrySet()){
//            System.out.println("Item: " + entry.getKey() + "Count: " + entry.getValue());
//        }
//
//        // OR
//        // for (HashMap.Entry<String, Integer> entry : items.entrySet()){ // Map.Entry can also be written as HashMap.Entry, since Map is just the general interface.
//        // System.out.println("Item: " + entry.getKey() + "Count: " + entry.getValue());
//        // }
//    }
//}