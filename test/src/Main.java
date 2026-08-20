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
//        // 1. Declare and initialize a standard string literal.
//        // Simple terms: Creates a text string variable containing "Hello".
//        String myString = "Hello";
//
//        // 2. Instantiate a new String object using string concatenation via the constructor.
//        // Simple terms: Combines "Hello" with "try" to make a brand new string "Hellotry".
//        String myNew = new String(myString + "try");
//
//        // 3. Print out the newly generated string to the console output.
//        // Simple terms: Displays "Hellotry" on the screen.
//        System.out.println(myNew);
//    }
//}

// --- INDIVIDUAL PROJECT EXAMPLE FOR STRING SNIPPET ---
//class StringProjectExample {
//    public static void main(String[] args) {
//        // 1. Declare a greeting base string.
//        // Simple terms: Stores "Welcome" in memory.
//        String greeting = "Welcome";
//        // 2. Create a new string by explicitly combining it with user identity text.
//        // Simple terms: Uses the 'new String()' constructor to create "WelcomeUser".
//        String customMessage = new String(greeting + "User");
//        // 3. Print the final custom string outcome.
//        // Simple terms: Outputs "WelcomeUser" onto the console log.
//        System.out.println(customMessage);
//    }
//}

// =================================================================================== //
// STRING & CONCATENATION
//class Main {
//    public static void main(String[] args) {
//        // 1. Declare first string variable x.
//        // Simple terms: Stores "Hello".
//        String x = "Hello";
//
//        // 2. Declare second string variable y.
//        // Simple terms: Stores "World".
//        String y = "World";
//
//        // 3. Extract a substring from index 2 up to index 4 (exclusive).
//        // Simple terms: Takes characters from position 2 to 3 ("ll") out of "Hello".
//        String foo = x.substring(2,4); // (left, right)
//
//        // 4. Concatenate space and string y to foo.
//        // Simple terms: Combines "ll" with a space and "World" to get "ll World".
//        String z = foo.concat(" " + y);
//
//        // 5. Print substring foo.
//        // Simple terms: Outputs "ll".
//        System.out.println(foo);
//
//        // 6. Print combined string z.
//        // Simple terms: Outputs "ll World".
//        System.out.println(z);
//    }
//}

// --- INDIVIDUAL PROJECT EXAMPLE FOR STRING & CONCATENATION ---
//class ConcatenationProjectExample {
//    public static void main(String[] args) {
//        // 1. Declare first name component string.
//        // Simple terms: Stores "Java".
//        String part1 = "Java";
//        // 2. Declare second name component string.
//        // Simple terms: Stores "Programming".
//        String part2 = "Programming";
//        // 3. Extract a slice from part2 (indices 3 to 7 -> "gram").
//        // Simple terms: Grabs letters from position 3 up to 6.
//        String slice = part2.substring(3, 7);
//        // 4. Combine part1, a hyphen separator, and the slice together.
//        // Simple terms: Joins "Java", "-", and "gram" to form "Java-gram".
//        String result = part1.concat("-" + slice);
//        // 5. Print out the final concatenated result.
//        // Simple terms: Outputs "Java-gram" to the console screen.
//        System.out.println(result);
//    }
//}

// =================================================================================== //
// STRING BUILDER
//class Main {
//    public static void main(String[] args) {
//        //StringBuilder
//
//        // 1. Initialize a mutable StringBuilder object with initial text.
//        // Simple terms: Creates a modifiable text container holding "Hello".
//        StringBuilder x = new StringBuilder("Hello");
//
//        // 2. Append string content to the StringBuilder sequence.
//        // Simple terms: Adds " World" to the end of the text.
//        x.append(" World");
//
//        // 3. Append another string content block.
//        // Simple terms: Adds " There" to the end of the text sequence.
//        x.append(" There");
//
//        // 4. Output the final assembled mutable string builder value.
//        // Simple terms: Prints "Hello World There" onto the console screen.
//        System.out.println(x);
//    }
//}

// --- INDIVIDUAL PROJECT EXAMPLE FOR STRING BUILDER ---
//class StringBuilderProjectExample {
//    public static void main(String[] args) {
//        // 1. Initialize a mutable StringBuilder with initial sequence title.
//        // Simple terms: Creates a dynamic text builder holding "Item".
//        StringBuilder sb = new StringBuilder("Item");
//        // 2. Append numeric identifier block.
//        // Simple terms: Adds "#999" to the mutable sequence.
//        sb.append("#999");
//        // 3. Append status descriptor block.
//        // Simple terms: Adds " - Active" status tag to the end.
//        sb.append(" - Active");
//        // 4. Print the final assembled string builder value.
//        // Simple terms: Outputs "Item#999 - Active" on screen.
//        System.out.println(sb);
//    }
//}

// =================================================================================== //
// STRING SPLIT
//class Main {
//    public static void main(String[] args) {
//        // 1. Define long target string sentence.
//        // Simple terms: Stores a full sentence text to be split apart.
//        String myString = "The quick brown fox jump over a lazy dog";
//
//        // 2. Split string into an array of words using space as the splitting boundary.
//        // Simple terms: Cuts the sentence at every space character.
//        String toGet[] = myString.split(" ");
//
//        // 3. Loop through the resulting string array and print each word individually.
//        // Simple terms: Prints every split word on its own new line.
//        for(String x:toGet){
//            System.out.println(x);
//        }
//    }
//}

// --- INDIVIDUAL PROJECT EXAMPLE FOR STRING SPLIT ---
//class StringSplitProjectExample {
//    public static void main(String[] args) {
//        // 1. Define a comma-separated data string.
//        // Simple terms: Stores CSV-style text containing names.
//        String csvData = "Alice,Bob,Charlie,David";
//        // 2. Split the string into tokens wherever a comma appears.
//        // Simple terms: Chops the text at every comma into an array of names.
//        String namesArray[] = csvData.split(",");
//        // 3. Iterate through the array and print each name on a new line.
//        // Simple terms: Loops through namesArray and outputs each name individually.
//        for(String name : namesArray) {
//            System.out.println("Parsed Name: " + name);
//        }
//    }
//}

// =================================================================================== //
// SUBSTRING
//class Main {
//    public static void main(String[] args) {
//        // 1. Declare base strings x and y.
//        // Simple terms: Stores "Hello" and "World".
//        String x = "Hello";
//        String y = "World";
//
//        // 2. Extract a slice of string x using start index 0 and end index 2.
//        // Simple terms: Grabs the first two characters of "Hello", which is "He".
//        String foo = x.substring(0,2); //(left, right)
//
//        // 3. Print extracted substring result.
//        // Simple terms: Outputs "He" to the console.
//        System.out.println(foo);
//    }
//}

// --- INDIVIDUAL PROJECT EXAMPLE FOR SUBSTRING ---
//class SubstringProjectExample {
//    public static void main(String[] args) {
//        // 1. Declare a file name string with an extension.
//        // Simple terms: Stores "document.pdf".
//        String filename = "document.pdf";
//        // 2. Extract the file extension slice using substring starting from index 9.
//        // Simple terms: Grabs characters from position 9 to the end ("pdf").
//        String extension = filename.substring(9);
//        // 3. Print the extracted file extension.
//        // Simple terms: Outputs "pdf" onto the console screen.
//        System.out.println("File Extension: " + extension);
//    }
//}

// =================================================================================== //
// MIX OF SUBSTRING AND CONCATENATION

//class Main {
//    public static void main(String[] args) {
//         // 1. Display text containing variables x and y.
//         // Simple terms: Prints a formatted log message.
//         String x="Hello";
//         String y="World";
//         System.out.println("The value of x is " + x + " " + "and the value of y is "+ y);
//
//         // 2. Concatenate strings x and y with a space.
//         // Simple terms: Joins "Hello" and "World" with a space separator.
//         String x="Hello";
//         String y="World";
//         String z=x.concat(" " + y);
//         System.out.println(z);
//
//        // 3. Substring extraction (index 2 to 4) concatenated with y.
//        // Simple terms: Takes "ll" from "Hello" and combines it with "World" to form "llWorld".
//        String x="Hello";
//        String y="World";
//        String foo=x.substring(2,4); // (left, right)
//        String z=foo.concat(y);
//        System.out.println(foo);
//        System.out.println(z);
//
//    }
//}

// --- INDIVIDUAL PROJECT EXAMPLE FOR MIX OF SUBSTRING & CONCATENATION ---
//class MixSubConcatProjectExample {
//    public static void main(String[] args) {
//        // 1. Declare base authorization code string.
//        // Simple terms: Stores "ADMIN-KEY".
//        String code = "ADMIN-KEY";
//        // 2. Extract the prefix word ("ADMIN") via substring indices 0 to 5.
//        // Simple terms: Slices out the first 5 characters.
//        String prefix = code.substring(0, 5);
//        // 3. Concatenate prefix with a custom suffix string.
//        // Simple terms: Joins "ADMIN" with "-SECURE" to form "ADMIN-SECURE".
//        String secureCode = prefix.concat("-SECURE");
//        // 4. Print the newly generated security code.
//        // Simple terms: Outputs "ADMIN-SECURE" on screen.
//        System.out.println(secureCode);
//    }
//}

// =================================================================================== //
// ARRAY LIST SNIPPETS

//public class Main{
//    public static void main (String[] std){
//        // 1. Initialize a 2D (two-dimensional) String array containing rows and columns of data.
//        // Simple terms: A table-like structure holding names and numbers.
//        String myList[][] = {
//                {"Alpha", "0915", "Haha"},
//                {"Bravo", "0916"},
//                {"Charlie", "0917"},
//        };
//
//        // 2. Iterate through each row of the 2D array using a for loop.
//        // Simple terms: Loops row by row from index 0 to the end of the array.
//        for (int x=0;x<myList.length;x++){
//            // 3. Convert the current row array into a readable string format and print it.
//            // Simple terms: Prints out all elements inside the current row.
//            System.out.println(Arrays.toString(myList[x]));
//
//            // 4. Access and print a specific hardcoded element coordinate from row 0, column 2.
//            // Simple terms: Grabs the item at row 0, column 2 ("Haha") and prints it.
//            System.out.println("Location: " + myList[0][2]);
//        }
//    }
//}

// --- INDIVIDUAL PROJECT EXAMPLE FOR 2D ARRAY LIST ---
//class TwoDArrayProjectExample {
//    public static void main(String[] args) {
//        // 1. Initialize a 2D grid matrix of inventory stock values.
//        // Simple terms: A table holding product name, price, and stock count.
//        String inventory[][] = {
//            {"Keyboard", "45.00", "12"},
//            {"Mouse", "25.50", "30"},
//            {"Monitor", "150.00", "5"}
//        };
//        // 2. Loop through each row of the inventory table.
//        // Simple terms: Scans through every product entry row-by-row.
//        for(int i = 0; i < inventory.length; i++) {
//            // 3. Print the formatted row data.
//            // Simple terms: Outputs the full row elements using Arrays.toString().
//            System.out.println("Stock Item Row: " + Arrays.toString(inventory[i]));
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
//        // 2. Define the regex pattern string. Here, '\s+' searches for one or more consecutive whitespace characters (spaces, tabs).
//        // Simple terms: This is our search rule. '\s+' looks for spaces between words.
//        String patt = "\s+";
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
//        // Because '\s+' matches each group of spaces, match.find() successfully matches 3 separate times,
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

// --- INDIVIDUAL PROJECT EXAMPLE FOR REGEX PATTERNS ---
public class Main {
    public static void main(String[] args) {
        // 1. Define target text containing phone numbers or codes.
        // Simple terms: Stores a string sentence with digits.
        String text = "Order ID 4567 is ready";
        // 2. Define regex rule to match any digit from 0 to 9.
        // Simple terms: Pattern "[0-9]+" looks for one or more consecutive digits.
        String regex = "[0-9]+";
        // 3. Compile pattern and create matcher.
        // Simple terms: Prepares the regex search engine.
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        // 4. Find and print matched numbers.
        // Simple terms: Loops through and prints any numbers found in the text.
        while(m.find()) {
            System.out.println("Found Number: " + m.group());
        }
    }
}

// =================================================================================== //
// REGULAR EXPRESSIONS: TREE MAP SNIPPETS

//public class Main {
//    public static void main(String[] args) {
//        // 1. Initialize a generic ArrayList list collection of String elements.
//        // Simple terms: Creates a dynamic list that can store text items.
//        List myList = new ArrayList<>();
//
//        // 2. Add elements into the list collection.
//        // Simple terms: Inserts "Apple" and "Banana" into the list.
//        myList.add("Apple");
//        myList.add("Banana");
//
//        // 3. Retrieve and print an element from the list by its index position.
//        // Simple terms: Fetches the item at index 0 ("Apple") and prints it.
//        System.out.println(myList.get(0)); // Outputs: Apple
//    }
//}

//public class Main{
//    public static void main(String[] xyz){
//        // 1. Initialize a TreeMap collection storing Integer keys mapped to String values.
//        // Simple terms: Creates an automatically sorted key-value dictionary map.
//        TreeMap<Integer, String> myList = new TreeMap <Integer, String>();
//        // OR
//        // Map <Integer, String> myList = new TreeMap <Integer, String>();
//
//        // 2. Insert key-value pairs into the TreeMap map collection.
//        // Simple terms: Assigns text values "a", "b", "c" to numerical keys 123, 456, 789.
//        myList.put(123, "a");
//        myList.put(456, "b");
//        myList.put(789, "c");
//
//        // 3. Attempt to retrieve a value associated with a specific key.
//        // Simple terms: Looks up key 1. Note: since key 1 does not exist in our map, this returns null.
//        System.out.println(myList.get(1));
//    }
//}

// --- INDIVIDUAL PROJECT EXAMPLE FOR TREEMAP ---
//class TreeMapProjectExample {
//    public static void main(String[] args) {
//        // 1. Initialize a TreeMap mapping student ID numbers to student names.
//        // Simple terms: Creates a sorted key-value map.
//        TreeMap<Integer, String> studentMap = new TreeMap<>();
//        // 2. Add elements in random key order.
//        // Simple terms: Inserts entries for IDs 300, 100, and 200.
//        studentMap.put(300, "Charlie");
//        studentMap.put(100, "Alice");
//        studentMap.put(200, "Bob");
//        // 3. Print out the map contents.
//        // Simple terms: TreeMap automatically sorts entries by key in ascending order.
//        System.out.println("Sorted Student Map: " + studentMap);
//    }
//}

// =================================================================================== //
// REGULAR EXPRESSIONS: HASHMAP SNIPPETS
//public class Main {
//    public static void main(String[] xyz){
//        // 1. Initialize a HashMap collection mapping String keys to Integer values.
//        // Simple terms: Creates a hash-based dictionary table to hold item names and counts.
//        HashMap<String, Integer> items = new HashMap<>();
//        // OR
//        // Map<String, Integer> items = new HashMap<>();
//
//        // 2. Populate the HashMap with key-value item data pairs.
//        // Simple terms: Adds items "A", "B", "C", etc., paired with numerical integer counts.
//        items.put("A ", 10);
//        items.put("B ", 20);
//        items.put("C ", 30);
//        items.put("D ", 40);
//        items.put("E ", 50);
//        items.put("F ", 60);
//
//        // 3. Iterate through all map entries using a for-each loop and Map.Entry.
//        // Simple terms: Loops through every item in the map, extracting both the item name key and its count value.
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

// --- INDIVIDUAL PROJECT EXAMPLE FOR HASHMAP ---
//class HashMapProjectExample {
//    public static void main(String[] args) {
//        // 1. Initialize a HashMap mapping fruit names to inventory quantities.
//        // Simple terms: Creates a key-value dictionary table.
//        HashMap<String, Integer> stock = new HashMap<>();
//        // 2. Put key-value pairs into the hash map.
//        // Simple terms: Assigns quantities to "Apple" and "Banana".
//        stock.put("Apple", 50);
//        stock.put("Banana", 80);
//        // 3. Iterate over the hash map entries and print them.
//        // Simple terms: Loops through entrySet() to display each fruit and stock count.
//        for(Map.Entry<String, Integer> entry : stock.entrySet()) {
//            System.out.println("Fruit: " + entry.getKey() + " | Stock: " + entry.getValue());
//        }
//    }
//}

// =================================================================================== //
// =================================================================================== //
//         COMBINED COMPREHENSIVE EXAMPLES & COMPLETE EXAM PROJECT SNIPPETS
// =================================================================================== //
// =================================================================================== //

// ----------------------------------------------------------------------------------- //
// COMBINED EXAMPLE 1: FULL AWT FOUR-FUNCTION CALCULATOR APPLICATION (+, -, , /)
// -----------------------------------------------------------------------------------
//import java.awt.;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class CompleteCalculatorExamApp {
//    public static void main(String[] args) {
//        // 1. Create main window application frame container.
//        Frame frame = new Frame("Comprehensive AWT Calculator");
//
//        // 2. Create input text fields for numerical inputs.
//        TextField tf1 = new TextField();
//        TextField tf2 = new TextField();
//
//        // 3. Create arithmetic operation buttons (+, -, , /).
//        Button addBtn = new Button("+");
//        Button subBtn = new Button("-");
//        Button mulBtn = new Button("");
//        Button divBtn = new Button("/");
//
//        // 4. Create outcome result display label.
//        Label resultLabel = new Label("Result: ");
//
//        // 5. Establish layout boundaries via setBounds.
//        tf1.setBounds(50, 80, 120, 30);
//        tf2.setBounds(190, 80, 120, 30);
//        addBtn.setBounds(50, 130, 50, 40);
//        subBtn.setBounds(110, 130, 50, 40);
//        mulBtn.setBounds(170, 130, 50, 40);
//        divBtn.setBounds(230, 130, 50, 40);
//        resultLabel.setBounds(50, 195, 320, 30);
//
//        // 6. Define shared action listener using e.getSource() to handle all four math buttons.
//        ActionListener calcListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    // 7. Parse string inputs into double values for precise decimal calculations.
//                    double num1 = Double.parseDouble(tf1.getText());
//                    double num2 = Double.parseDouble(tf2.getText());
//                    double total = 0;
//
//                    // 8. Isolate exact button component source that triggered the event.
//                    Object source = e.getSource();
//
//                    // 9. Execute corresponding math arithmetic based on which button was clicked.
//                    if (source == addBtn) {
//                        total = num1 + num2;
//                        resultLabel.setText("Result: " + num1 + " + " + num2 + " = " + total);
//                    } else if (source == subBtn) {
//                        total = num1 - num2;
//                        resultLabel.setText("Result: " + num1 + " - " + num2 + " = " + total);
//                    } else if (source == mulBtn) {
//                        total = num1 * num2;
//                        resultLabel.setText("Result: " + num1 + " * " + num2 + " = " + total);
//                    } else if (source == divBtn) {
//                        // 10. Safeguard against divide-by-zero runtime exceptions.
//                        if (num2 == 0) {
//                            resultLabel.setText("Error: Cannot divide by zero!");
//                        } else {
//                            total = num1 / num2;
//                            resultLabel.setText("Result: " + num1 + " / " + num2 + " = " + total);
//                        }
//                    }
//                } catch (NumberFormatException ex) {
//                    // 11. Handle blank or invalid letter formatting input errors safely.
//                    resultLabel.setText("Error: Enter valid numbers!");
//                }
//            }
//        };
//
//        // 12. Register the calculator listener to all four operational buttons.
//        addBtn.addActionListener(calcListener);
//        subBtn.addActionListener(calcListener);
//        mulBtn.addActionListener(calcListener);
//        divBtn.addActionListener(calcListener);
//
//        // 13. Add all components into the master frame container.
//        frame.add(tf1);
//        frame.add(tf2);
//        frame.add(addBtn);
//        frame.add(subBtn);
//        frame.add(mulBtn);
//        frame.add(divBtn);
//        frame.add(resultLabel);
//
//        // 14. Configure frame window sizing, null layout manager, and display property.
//        frame.setSize(400, 300);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}

// ----------------------------------------------------------------------------------- //
// COMBINED EXAMPLE 2: DATA REGISTRATION & MAP LOOKUP EXAM APP
// -----------------------------------------------------------------------------------
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.HashMap;
//
//public class CompleteRegistrationExamApp {
//    public static void main(String[] args) {
//        // 1. Initialize frame container window.
//        Frame frame = new Frame("Registration & Lookup App");
//
//        // 2. Initialize underlying HashMap database storage structure.
//        HashMap<String, String> db = new HashMap<>();
//
//        // 3. Create input fields, registration buttons, and status labels.
//        TextField nameField = new TextField();
//        TextField phoneField = new TextField();
//        Button registerBtn = new Button("Register");
//        Button lookupBtn = new Button("Lookup");
//        Label statusLabel = new Label("Status: Ready");
//
//        // 4. Set component layout coordinate boundaries.
//        nameField.setBounds(120, 60, 180, 25);
//        phoneField.setBounds(120, 100, 180, 25);
//        registerBtn.setBounds(50, 150, 100, 30);
//        lookupBtn.setBounds(160, 150, 100, 30);
//        statusLabel.setBounds(50, 200, 280, 30);
//
//        // 5. Add action listener for registering user records into the HashMap.
//        registerBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String name = nameField.getText().trim();
//                String phone = phoneField.getText().trim();
//                if (!name.isEmpty() && !phone.isEmpty()) {
//                    db.put(name, phone);
//                    statusLabel.setText("Registered: " + name);
//                    nameField.setText("");
//                    phoneField.setText("");
//                } else {
//                    statusLabel.setText("Error: Fields cannot be empty!");
//                }
//            }
//        });
//
//        // 6. Add action listener for searching records inside the HashMap database.
//        lookupBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String searchName = nameField.getText().trim();
//                if (db.containsKey(searchName)) {
//                    phoneField.setText(db.get(searchName));
//                    statusLabel.setText("Found record for: " + searchName);
//                } else {
//                    statusLabel.setText("Record not found!");
//                }
//            }
//        });
//
//        // 7. Append UI descriptor labels, text fields, and buttons into frame container.
//        frame.add(new Label("Name:") {{ setBounds(50, 60, 60, 25); }});
//        frame.add(new Label("Phone:") {{ setBounds(50, 100, 60, 25); }});
//        frame.add(nameField);
//        frame.add(phoneField);
//        frame.add(registerBtn);
//        frame.add(lookupBtn);
//        frame.add(statusLabel);
//
//        // 8. Finalize window settings and visibility properties.
//        frame.setSize(380, 280);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}

// ----------------------------------------------------------------------------------- //
// COMBINED EXAMPLE 3: USER LOGIN AUTHENTICATION APP
// -----------------------------------------------------------------------------------
//import java.awt.;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class LoginAuthApp {
//    public static void main(String[] args) {
//        Frame frame = new Frame("Login Authentication");
//        TextField userField = new TextField();
//        TextField passField = new TextField();
//        passField.setEchoChar('');
//        Button loginBtn = new Button("Login");
//        Label msgLabel = new Label("Status: Please Login");
//
//        userField.setBounds(130, 70, 180, 25);
//        passField.setBounds(130, 110, 180, 25);
//        loginBtn.setBounds(130, 150, 90, 35);
//        msgLabel.setBounds(50, 200, 260, 30);
//
//        loginBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String u = userField.getText().trim();
//                String p = passField.getText().trim();
//                if (u.equals("student") && p.equals("pass123")) {
//                    msgLabel.setText("Login Successful! Welcome " + u);
//                } else {
//                    msgLabel.setText("Access Denied: Invalid Credentials");
//                }
//            }
//        });
//
//        frame.add(new Label("Username:") {{ setBounds(50, 70, 70, 25); }});
//        frame.add(new Label("Password:") {{ setBounds(50, 110, 70, 25); }});
//        frame.add(userField);
//        frame.add(passField);
//        frame.add(loginBtn);
//        frame.add(msgLabel);
//        frame.setSize(360, 270);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}

// ----------------------------------------------------------------------------------- //
// COMBINED EXAMPLE 4: TEXT FORMATTER & CASING CONVERTER APP
// -----------------------------------------------------------------------------------
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class TextFormatterApp {
//    public static void main(String[] args) {
//        Frame frame = new Frame("Text Formatter Tool");
//        TextField inputField = new TextField();
//        Button upperBtn = new Button("UPPERCASE");
//        Button lowerBtn = new Button("lowercase");
//        Label outputLabel = new Label("Result: ");
//
//        inputField.setBounds(50, 60, 280, 30);
//        upperBtn.setBounds(50, 110, 130, 35);
//        lowerBtn.setBounds(200, 110, 130, 35);
//        outputLabel.setBounds(50, 170, 280, 30);
//
//        ActionListener formatListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String text = inputField.getText();
//                Object src = e.getSource();
//                if (src == upperBtn) {
//                    outputLabel.setText("Result: " + text.toUpperCase());
//                } else if (src == lowerBtn) {
//                    outputLabel.setText("Result: " + text.toLowerCase());
//                }
//            }
//        };
//
//        upperBtn.addActionListener(formatListener);
//        lowerBtn.addActionListener(formatListener);
//
//        frame.add(inputField);
//        frame.add(upperBtn);
//        frame.add(lowerBtn);
//        frame.add(outputLabel);
//        frame.setSize(390, 240);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}

// ----------------------------------------------------------------------------------- //
// COMBINED EXAMPLE 5: MULTI-ITEM CHECKBOX PREFERENCE SURVEY APP
// -----------------------------------------------------------------------------------
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class SurveyApp {
//    public static void main(String[] args) {
//        Frame frame = new Frame("Survey Preferences");
//        Checkbox cb1 = new Checkbox("Java Developer");
//        Checkbox cb2 = new Checkbox("UI Designer");
//        Button submitBtn = new Button("Submit Survey");
//        Label resultLabel = new Label("Selections: None");
//
//        cb1.setBounds(50, 70, 200, 30);
//        cb2.setBounds(50, 110, 200, 30);
//        submitBtn.setBounds(50, 160, 120, 35);
//        resultLabel.setBounds(50, 215, 320, 30);
//
//        submitBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String summary = "Roles -> Java: " + cb1.getState() + ", UI: " + cb2.getState();
//                resultLabel.setText(summary);
//            }
//        });
//
//        frame.add(cb1);
//        frame.add(cb2);
//        frame.add(submitBtn);
//        frame.add(resultLabel);
//        frame.setSize(400, 300);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}

// =================================================================================== //
// =================================================================================== //
//                         REGEX CHEAT SHEET REFERENCE BLOCK
// =================================================================================== //
// =================================================================================== //
//
// ┌───────────────────────────────────────────────────────────────────────────────────┐
// │                              REGEX CHEAT SHEET                                    │
// └───────────────────────────────────────────────────────────────────────────────────┘
//
// --- QUANTIFIERS ---
// a | b              : Match either "a" or "b"
// ?                  : Match either "a" or "b" (optional / zero or one)
// +                  : One or more occurrences
// *                  : Zero or more occurrences
// *?                 : Zero or more, but stop after first match (lazy quantifier)
// {N}                : Exactly N number of times (Where N is a number)
// {N, M}             : From N to M number of times (Where N and M are numbers)
//
// --- GENERAL TOKENS ---
// .                  : Any character
// \n                 : Newline character
// \t                 : Tab character
// \s                 : Any whitespace character (Including \t, \n, etc.)
// \S                 : Any non-whitespace character
// \w                 : Any word character (Upper/lowercase letters, 0-9, _)
// \W                 : Any non-word character
// \b                 : Word boundary (Matches between characters)
// \B                 : Non-word boundary
// ^                  : The start of a line
// $                  : The end of a line
// \                 : The literal character ""
//
// --- PATTERN COLLECTIONS ---
// [A-Z]              : Match any uppercase character from "A" to "Z"
// [a-z]              : Match any lowercase character from "a" to "z"
// [0-9]              : Match any number digit
// [asdf]             : Match any character that's either "a", "s", "d", or "f"
// [^asdf]            : Match any character that's NOT any of the following: "a", "s", "d", or "f"
//
// --- FLAGS ---
// g                  : Global, match more than once
// m                  : Force $ and ^ to match each newline individually
// i                  : Make the regex case-insensitive
//
// --- GROUPS ---
// (...)              : Capture group (Matches specific enclosed pattern blocks)
// (?: ... )          : Non-capture group
// (? ... )     : Named capture group (Group is called "name")
//
// --- NAMED BACK REFERENCE ---
// \k           : Reference named capture group "name" in query
//
// --- LOOKAHEAD AND LOOKBEHIND ---
// (?!)               : Negative lookahead
// (?=)               : Positive lookahead
// (?<! )             : Negative lookbehind
// (?<=)              : Positive lookbehind
// =================================================================================== //