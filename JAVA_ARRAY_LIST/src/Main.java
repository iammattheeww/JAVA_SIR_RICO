import java.util.Arrays;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Main{
    public static void main (String[] std){
        String myList[][] = {
                {"Alpha", "0915", "Haha"},
                {"Bravo", "0916"},
                {"Charlie", "0917"},
        };
        for (int x=0;x<myList.length;x++){
            System.out.println(Arrays.toString(myList[x]));
            System.out.println("Location: " + myList[0][2]);
        }
    }
}