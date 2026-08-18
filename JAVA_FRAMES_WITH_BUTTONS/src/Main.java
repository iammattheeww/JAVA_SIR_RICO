import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Main{
//    public static void main(String[] xyz){
//        // 1. Create the main window frame
//        Frame myFrame = new Frame();
//        // 2. Set window dimensions (width, height)
//        myFrame.setSize(1024, 768);
//        // 3. Use absolute positioning (no layout manager)
//        myFrame.setLayout(null);
//        // 4. Make the window visible on the screen
//        myFrame.setVisible(true);
//    }
//}

//public class Main{
//    public static void main(String[] xyz){
//        // 1. Create the main window frame
//        Frame myFrame = new Frame();
//        // 2. Create a button component with label text
//        Button myButton = new Button("Click Me!");
//        // 3. Set the button's bounds (x, y, width, height)
//        myButton.setBounds(200, 200, 100, 100);
//        // 4. Add the button to the frame
//        myFrame.add(myButton);
//        // 5. Set window dimensions
//        myFrame.setSize(1024, 768);
//        // 6. Use absolute positioning
//        myFrame.setLayout(null);
//        // 7. Make the window visible
//        myFrame.setVisible(true);
//    }
//}


//public class Main{
//    public static void main(String[] xyz){
//        // 1. Create the main window frame
//        Frame myFrame = new Frame();
//        // 2. Create a label to display text
//        Label x = new Label("Hello World!");
//        // 3. Create a button component
//        Button myButton = new Button("Click Me!");
//        // 4. Set the position and size of the label
//        x.setBounds(400, 400, 100, 100);
//        // 5. Set the position and size of the button
//        myButton.setBounds(200, 200, 100, 100);
//        // 6. Add an action listener to handle button clicks
//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // 7. Print a message to the console when clicked
//                System.out.println("Hello from Button!");
//            }
//        });
//        // 8. Add the button to the frame
//        myFrame.add(myButton);
//        // 9. Add the label to the frame
//        myFrame.add(x);
//        // 10. Set window dimensions
//        myFrame.setSize(1024, 768);
//        // 11. Use absolute positioning
//        myFrame.setLayout(null);
//        // 12. Make the window visible
//        myFrame.setVisible(true);
//    }
//}

//public class Main{
//    public static void main(String[] xyz){
//        // 1. Create the main window frame
//        Frame myFrame = new Frame();
//        // 2. Create a label component
//        Label x = new Label("Hello World!");
//        // 3. Create a button component
//        Button myButton = new Button("Click Me!");
//        // 4. Set label bounds
//        x.setBounds(400, 400, 100, 100);
//        // 5. Set button bounds
//        myButton.setBounds(200, 200, 100, 100);
//        // 6. Add an action listener with custom text output
//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Good day!");
//            }
//        });
//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello from Button!");
//
//                // --- EXAMPLES OF USING 'e' ---
//
//                // 1. Get the text/command of the button that was clicked
//                String buttonText = e.getActionCommand();
//                System.out.println("Action Command: " + buttonText);
//
//                // 2. Check which component triggered the event (useful for multiple buttons)
//                Object source = e.getSource();
//                if (source == myButton) {
//                    System.out.println("The event came specifically from myButton!");
//                }
//
//                // 3. Get the exact timestamp of when the click happened
//                long clickTime = e.getWhen();
//                System.out.println("Click timestamp: " + clickTime);
//            }
//        });
//        // 7. Add button to frame
//        myFrame.add(myButton);
//        // 8. Add label to frame
//        myFrame.add(x);
//        // 9. Set window dimensions
//        myFrame.setSize(1024, 768);
//        // 10. Use absolute positioning
//        myFrame.setLayout(null);
//        // 11. Make window visible
//        myFrame.setVisible(true);
//    }
//}

//public class Main{
//    public static void main(String[] xyz){
//        // 1. Create the main window frame
//        Frame myFrame = new Frame();
//        // 2. Create a text field for user input
//        TextField toGet = new TextField();
//        // 3. Create a label component
//        Label x = new Label("Hello World!");
//        // 4. Create a button component
//        Button myButton = new Button("Click Me!");
//        // 5. Set the bounds for the text field
//        toGet.setBounds(100, 100, 200, 100);
//        // 6. Set the bounds for the label
//        x.setBounds(400, 400, 100, 100);
//        // 7. Set the bounds for the button
//        myButton.setBounds(200, 200, 100, 100);
//        // 8. Add an action listener to the button
//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // 9. Retrieve text from the text field and store it in 'z'
//                String z = toGet.getText();
//                // 10. Update the label's text with the value from 'z'
//                x.setText(z);
//            }
//        });
//        // 11. Add the text field to the frame
//        myFrame.add(toGet);
//        // 12. Add the button to the frame
//        myFrame.add(myButton);
//        // 13. Add the label to the frame
//        myFrame.add(x);
//        // 14. Set window dimensions
//        myFrame.setSize(1024, 768);
//        // 15. Use absolute positioning
//        myFrame.setLayout(null);
//        // 16. Make the window visible
//        myFrame.setVisible(true);
//    }
//}

public class Main {
    public static void main(String[] args){
        // 1. Create the main window frame
        Frame myFrame = new Frame();
        // 2. Create a text field component for input
        TextField textfield = new TextField();
        // 3. Set text field bounds (x, y, width, height)
        textfield.setBounds(100, 400, 200, 25);
        // 4. Create a label component with initial text
        Label label = new Label("Hello World!");
        // 5. Set label bounds
        label.setBounds(800, 200, 100, 100);
        // 6. Create main click button and exit button components
        Button button = new Button("Click");
        Button button_exit = new Button("Exit");
        // 7. Set bounds for the buttons
        button.setBounds(100, 100, 100, 100);
        button_exit.setBounds(100, 500, 100, 25);
        // 8. Add action listener to the main click button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 9. Get text from text field and update label text
                String x = textfield.getText();
                label.setText(x);
            }
        });
        // 10. Add action listener to the exit button to close the frame
        button_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 11. Dispose/close the window frame
                myFrame.dispose();
            }
        });
        // 12. Add all components to the frame
        myFrame.add(textfield);
        myFrame.add(label);
        myFrame.add(button);
        myFrame.add(button_exit);
        // 13. Set window dimensions
        myFrame.setSize(1024, 768);
        // 14. Use absolute positioning
        myFrame.setLayout(null);
        // 15. Make the window visible
        myFrame.setVisible(true);
    }
}