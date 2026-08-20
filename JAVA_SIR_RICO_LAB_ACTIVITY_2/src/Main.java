//import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main{
    public static void main(String[] intoy){
        // FOR MATCHERS
        String url1 = "https://www.google.com";
        String url2 = "www.google.com";
        String url3 = "https://google.com";
        String url4 = "https://google";
        String url5 = " https://www.google.com";


        // DECLARE STRING VARIABLE regex
        String regex = "^https?://www\\.[a-zA-Z0-9]+\\.(com|org|net)[^\\s]*$";

        // COMPILE ANG PATTERN NGA regex
        Pattern patt = Pattern.compile(regex);

        // SAMPLE 1 (https://www.google.com)
        // DECLARE MATCHER CLASS
        Matcher match1 = patt.matcher(url1);
        if(match1.matches()){
            System.out.println("EXAMPLE 1");
            System.out.println("Enter website URL: " + url1);
            System.out.println("Valid URL!");
        } else {
            System.out.println("Enter website URL: " + url1);
            System.out.println("Invalid URL!");
        }

        System.out.println("\n");

        // SAMPLE 2 (www.google.com)
        // DECLARE MATCHER CLASS
        Matcher match2 = patt.matcher(url2);
        if(match1.matches()){
            System.out.println("EXAMPLE 2");
            System.out.println("Enter website URL: " + url2);
            System.out.println("Invalid URL! no www. Please enter a valid URL.");
        } else {
            System.out.println("Enter website URL: " + url1);
            System.out.println("Valid URL!");
        }

        System.out.println("\n");

        // SAMPLE 3 (https://google.com)
        // DECLARE MATCHER CLASS
        Matcher match3 = patt.matcher(url3);
        if(match1.matches()){
            System.out.println("EXAMPLE 3");
            System.out.println("Enter website URL: " + url3);
            System.out.println("Invalid URL! no www.");
        } else {
            System.out.println("Enter website URL: " + url1);
            System.out.println("Valid URL!");
        }

        System.out.println("\n");

        // SAMPLE 4 (https://google)
        // DECLARE MATCHER CLASS
        Matcher match4 = patt.matcher(url4);
        if(match1.matches()){
            System.out.println("EXAMPLE 4");
            System.out.println("Enter website URL: " + url4);
            System.out.println("Invalid URL! no domain extension! Please enter a valid URL.");
        } else {
            System.out.println("Enter website URL: " + url1);
            System.out.println("Valid URL!");
        }

        System.out.println("\n");

        // SAMPLE 5 ( https://www.google. com)
        // DECLARE MATCHER CLASS
        Matcher match5 = patt.matcher(url5);
        if(match1.matches()){
            System.out.println("EXAMPLE 5");
            System.out.println("Enter website URL: " + url5);
            System.out.println("Invalid URL! spaces not allowed! Please enter a valid URL.");
        } else {
            System.out.println("Enter website URL: " + url1);
            System.out.println("Valid URL!");
        }

    }
}