import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// =====================================================================
// EXISTING CODE HISTORY PRESERVED BELOW
// =====================================================================

//public class Main{
//    public static void main(String[] xyz){
//        Frame myFrame = new Frame();
//        myFrame.setSize(1024, 768);
//        myFrame.setLayout(null);
//        myFrame.setVisible(true);
//    }
//}

//public class Main{
//    public static void main(String[] xyz){
//        Frame myFrame = new Frame();
//        Button myButton = new Button("Click Me!");
//        myButton.setBounds(200, 200, 100, 100);
//        myFrame.add(myButton);
//        myFrame.setSize(1024, 768);
//        myFrame.setLayout(null);
//        myFrame.setVisible(true);
//    }
//}

//public class Main{
//    public static void main(String[] xyz){
//        Frame myFrame = new Frame();
//        Label x = new Label("Hello World!");
//        Button myButton = new Button("Click Me!");
//        x.setBounds(400, 400, 100, 100);
//        myButton.setBounds(200, 200, 100, 100);
//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello from Button!");
//            }
//        });
//        myFrame.add(myButton);
//        myFrame.add(x);
//        myFrame.setSize(1024, 768);
//        myFrame.setLayout(null);
//        myFrame.setVisible(true);
//    }
//}

//public class Main{
//    public static void main(String[] xyz){
//        Frame myFrame = new Frame();
//        Label x = new Label("Hello World!");
//        Button myButton = new Button("Click Me!");
//        x.setBounds(400, 400, 100, 100);
//        myButton.setBounds(200, 200, 100, 100);
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
//                String buttonText = e.getActionCommand();
//                System.out.println("Action Command: " + buttonText);
//
//                Object source = e.getSource();
//                if (source == myButton) {
//                    System.out.println("The event came specifically from myButton!");
//                }
//
//                long clickTime = e.getWhen();
//                System.out.println("Click timestamp: " + clickTime);
//            }
//        });
//        myFrame.add(myButton);
//        myFrame.add(x);
//        myFrame.setSize(1024, 768);
//        myFrame.setLayout(null);
//        myFrame.setVisible(true);
//    }
//}

//public class Main{
//    public static void main(String[] xyz){
//        Frame myFrame = new Frame();
//        TextField toGet = new TextField();
//        Label x = new Label("Hello World!");
//        Button myButton = new Button("Click Me!");
//        toGet.setBounds(100, 100, 200, 100);
//        x.setBounds(400, 400, 100, 100);
//        myButton.setBounds(200, 200, 100, 100);
//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String z = toGet.getText();
//                x.setText(z);
//           }
//        });
//        myFrame.add(toGet);
//        myFrame.add(myButton);
//        myFrame.add(x);
//        myFrame.setSize(1024, 768);
//        myFrame.setLayout(null);
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

// =====================================================================
// =====================================================================
//             ULTIMATE JAVA AWT LAB EXAM CHEAT SHEET & EXAMPLES
// =====================================================================
// =====================================================================

// =====================================================================
// SECTION 1: QUICK RE-TYPING CHEAT SHEET (Common Method Calls)
// =====================================================================
//
// imports:        import java.awt.*; import java.awt.event.ActionEvent; import java.awt.event.ActionListener;
// frame:          Frame f = new Frame("Title"); f.setSize(1024, 768); f.setLayout(null); f.setVisible(true); f.dispose();
// button:         Button b = new Button("Text"); b.setBounds(x, y, w, h); f.add(b);
// label:          Label l = new Label("Text"); l.setBounds(x, y, w, h); l.setText("New"); f.add(l);
// textfield:      TextField tf = new TextField(); tf.setBounds(x, y, w, h); tf.getText(); f.add(tf);
// textarea:       TextArea ta = new TextArea(); ta.setBounds(x, y, w, h); ta.getText(); f.add(ta);
// checkbox:       Checkbox cb = new Checkbox("Check"); cb.setBounds(x, y, w, h); cb.getState(); f.add(cb);
// choice/dropdown:Choice ch = new Choice(); ch.add("Opt 1"); ch.setBounds(x, y, w, h); ch.getSelectedItem(); f.add(ch);
// listener:       btn.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { ... } });


// =====================================================================
// SECTION 2: WHOLE-ASS CODE EXAMPLES FOR COMMON LAB SCENARIOS
// =====================================================================

// ---------------------------------------------------------------------
// EXAMPLE A: MULTI-BUTTON CHECKER USING ActionEvent 'e' (e.getSource())
// Use this when you have multiple buttons and want to handle them cleanly.
// ---------------------------------------------------------------------
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class MultiButtonExample {
//    public static void main(String[] args) {
//        Frame frame = new Frame("Multi-Button App");
//        Button btn1 = new Button("Save");
//        Button btn2 = new Button("Delete");
//        Label statusLabel = new Label("Status: Ready");
//
//        btn1.setBounds(100, 100, 100, 50);
//        btn2.setBounds(220, 100, 100, 50);
//        statusLabel.setBounds(100, 200, 200, 30);
//
//        // Shared listener using e.getSource() to differentiate buttons
//        ActionListener commonListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Object clickedButton = e.getSource();
//                if (clickedButton == btn1) {
//                    statusLabel.setText("Data Saved!");
//                } else if (clickedButton == btn2) {
//                    statusLabel.setText("Data Deleted!");
//                }
//            }
//        };
//
//        btn1.addActionListener(commonListener);
//        btn2.addActionListener(commonListener);
//
//        frame.add(btn1);
//        frame.add(btn2);
//        frame.add(statusLabel);
//        frame.setSize(500, 400);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}


// ---------------------------------------------------------------------
// EXAMPLE B: CALCULATOR / INPUT PROCESSOR APP
// Use this when you need to read numbers/text from fields and show math results.
// ---------------------------------------------------------------------
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class SimpleCalculatorExample {
//    public static void main(String[] args) {
//        Frame frame = new Frame("Simple Adder");
//        TextField tf1 = new TextField();
//        TextField tf2 = new TextField();
//        Button addBtn = new Button("Add");
//        Label resultLabel = new Label("Result: ");
//
//        tf1.setBounds(50, 100, 100, 30);
//        tf2.setBounds(160, 100, 100, 30);
//        addBtn.setBounds(50, 150, 80, 30);
//        resultLabel.setBounds(50, 200, 200, 30);
//
//        addBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    // Parse strings from text fields into integers for math
//                    int num1 = Integer.parseInt(tf1.getText());
//                    int num2 = Integer.parseInt(tf2.getText());
//                    int sum = num1 + num2;
//                    resultLabel.setText("Result: " + sum);
//                } catch (NumberFormatException ex) {
//                    resultLabel.setText("Error: Enter valid numbers!");
//                }
//            }
//        });
//
//        frame.add(tf1);
//        frame.add(tf2);
//        frame.add(addBtn);
//        frame.add(resultLabel);
//        frame.setSize(400, 300);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}


// ---------------------------------------------------------------------
// EXAMPLE C: LOGIN FORM VALIDATOR (String comparison template)
// Use this for validation tasks checking text content.
// ---------------------------------------------------------------------
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class LoginFormExample {
//    public static void main(String[] args) {
//        Frame frame = new Frame("Login Screen");
//        TextField userField = new TextField();
//        TextField passField = new TextField(); // Note: use TextField for basic AWT (can use setEchoChar('*') for masking)
//        Button loginBtn = new Button("Login");
//        Label msgLabel = new Label("");
//
//        userField.setBounds(150, 100, 150, 25);
//        passField.setBounds(150, 140, 150, 25);
//        passField.setEchoChar('*'); // Masks password input characters
//        loginBtn.setBounds(150, 180, 80, 30);
//        msgLabel.setBounds(150, 230, 200, 25);
//
//        loginBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = userField.getText();
//                String password = passField.getText();
//
//                if (username.equals("admin") && password.equals("1234")) {
//                    msgLabel.setText("Login Successful!");
//                } else {
//                    msgLabel.setText("Invalid Credentials!");
//                }
//            }
//        });
//
//        frame.add(new Label("Username:") {{ setBounds(50, 100, 90, 25); }});
//        frame.add(new Label("Password:") {{ setBounds(50, 140, 90, 25); }});
//        frame.add(userField);
//        frame.add(passField);
//        frame.add(loginBtn);
//        frame.add(msgLabel);
//
//        frame.setSize(400, 350);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}
// =====================================================================