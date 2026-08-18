import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        // 1. Declare and initialize the input text string that will be evaluated against the regular expression.
        // Simple terms: This is the sentence or text we want to check or search through.
        String names = "Today is the day";

        // 2. Define the regex pattern string. Here, '\\s+' searches for one or more consecutive whitespace characters (spaces, tabs).
        // Simple terms: This is our search rule. '\\s+' looks for spaces between words.
        String patt = "\\s+";

        // 3. Compile the regular expression string into a reusable compiled representation using Pattern.compile().
        // Simple terms: We convert our search rule from a plain text string into a formal search tool that Java can use.
        Pattern pattern = Pattern.compile(patt);

        // 4. Create a Matcher object by invoking matcher() on the pattern, binding it to the target input string for search operations.
        // Simple terms: We load our sentence into the search tool so it knows what text to look at.
        Matcher match = pattern.matcher(names);

        // 5. Execute a while loop using match.find() to scan the input string sequentially and process every matched whitespace instance found.
        // Simple terms: We keep checking the text step-by-step. Every time we find a space, we print out our pattern rule.
        // Output Explanation: "Today is the day" has 3 spaces between the 4 words.
        // Because '\\s+' matches each group of spaces, match.find() successfully matches 3 separate times,
        // causing the loop to run 3 times and print the pattern string 3 times.
        while(match.find()) System.out.println(patt);
    }
}

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