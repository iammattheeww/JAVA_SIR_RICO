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

//public class Main {
//    public static void main(String[] args){
//        // 1. Create the main window frame container.
//        // Simple terms: This is the outer application window border where all visual elements will sit.
//        Frame myFrame = new Frame();
//
//        // 2. Create a text field input component.
//        // Simple terms: An interactive text box where the user can type custom strings/characters.
//        TextField textfield = new TextField();
//
//        // 3. Set text field bounds (x, y, width, height).
//        // Simple terms: Defines where the input box is placed horizontally/vertically and how big it appears.
//        textfield.setBounds(100, 400, 200, 25);
//
//        // 4. Create a label display component with initial fallback text.
//        // Simple terms: A static text display element used to show messages on screen.
//        Label label = new Label("Hello World!");
//
//        // 5. Set label placement bounds.
//        // Simple terms: Places the label component at coordinates (800, 200) with a size of 100x100 pixels.
//        label.setBounds(800, 200, 100, 100);
//
//        // 6. Create main functional click button and execution exit button components.
//        // Simple terms: Actionable buttons that wait for mouse interaction.
//        Button button = new Button("Click");
//        Button button_exit = new Button("Exit");
//
//        // 7. Set layout bounds mapping for both buttons.
//        // Simple terms: Assigns exact pixel coordinates and dimensions so they render in correct places.
//        button.setBounds(100, 100, 100, 100);
//        button_exit.setBounds(100, 500, 100, 25);
//
//        // 8. Add an action listener handler object to the main click button component.
//        // Simple terms: Listens specifically for user clicks on the "Click" button.
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // 9. Extract current string value from the text field and assign it to label text.
//                // Simple terms: Grabs whatever text the user typed in the box and copies it onto the label display.
//                String x = textfield.getText();
//                label.setText(x);
//            }
//        });
//
//        // 10. Add action listener callback to the exit button to handle closing mechanics.
//        // Simple terms: Listens for clicks on the "Exit" button to shut down the application window.
//        button_exit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // 11. Destroy and close down the window frame safely via memory disposal.
//                // Simple terms: Closes the application completely when the exit button is clicked.
//                myFrame.dispose();
//            }
//        });
//
//        // 12. Register all individual visual UI components into the master frame container.
//        // Simple terms: Attaches the text box, label, and buttons to the window so they actually appear.
//        myFrame.add(textfield);
//        myFrame.add(label);
//        myFrame.add(button);
//        myFrame.add(button_exit);
//
//        // 13. Set master window screen layout resolution dimensions.
//        // Simple terms: Makes the main application window 1024 pixels wide by 768 pixels high.
//        myFrame.setSize(1024, 768);
//
//        // 14. Clear layout manager configuration to enable absolute manual coordinate positioning.
//        // Simple terms: Disables automatic component arranging so our custom setBounds rules work properly.
//        myFrame.setLayout(null);
//
//        // 15. Change window property to visible state representation.
//        // Simple terms: Renders and opens the graphical window on the computer screen.
//        myFrame.setVisible(true);
//    }
//}

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
public class Main {
    public static void main(String[] args) {
        // 1. Initialize master frame window container.
        // Simple terms: Creates the empty container window.
        Frame frame = new Frame("Multi-Button App");

        // 2. Instantiate primary execution button component.
        // Simple terms: Creates a button labeled "Save".
        Button btn1 = new Button("Save");

        // 3. Instantiate secondary execution button component.
        // Simple terms: Creates a button labeled "Delete".
        Button btn2 = new Button("Delete");

        // 4. Create feedback notification label.
        // Simple terms: A text area showing the current operation status.
        Label statusLabel = new Label("Status: Ready");

        // 5. Apply layout bound dimensions to buttons and label.
        // Simple terms: Manually sets pixel layout positioning coordinates.
        btn1.setBounds(100, 100, 100, 50);
        btn2.setBounds(220, 100, 100, 50);
        statusLabel.setBounds(100, 200, 200, 30);

        // 6. Build a shared action listener utility utilizing e.getSource() differentiation logic.
        // Simple terms: One centralized listener that checks which button fired the click event.
        ActionListener commonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 7. Isolate exact triggering object component reference using e.getSource().
                // Simple terms: Asks the event object "Who sent this click signal?".
                Object clickedButton = e.getSource();

                // 8. Conditional branch evaluation matching source references.
                // Simple terms: Checks if it came from btn1 or btn2 to change status text accordingly.
                if (clickedButton == btn1) {
                    statusLabel.setText("Data Saved!");
                } else if (clickedButton == btn2) {
                    statusLabel.setText("Data Deleted!");
                }
            }
        };

        // 9. Register the shared listener handler to both buttons.
        // Simple terms: Connects both interactive buttons to our multi-target listener function.
        btn1.addActionListener(commonListener);
        btn2.addActionListener(commonListener);

        // 10. Add all UI elements into frame container layout.
        // Simple terms: Places buttons and status label onto the visible screen window.
        frame.add(btn1);
        frame.add(btn2);
        frame.add(statusLabel);

        // 11. Finalize application window sizing, layout clearing, and visibility activation.
        // Simple terms: Sets window boundaries, removes automatic layout manager, and displays the UI.
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}


// ---------------------------------------------------------------------
// EXAMPLE B: CALCULATOR / INPUT PROCESSOR APP
// Use this when you need to read numbers/text from fields and show math results.
// ---------------------------------------------------------------------
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Main {
//    public static void main(String[] args) {
//        // 1. Initialize main calculation window container frame.
//        // Simple terms: Creates the application frame border.
//        Frame frame = new Frame("Simple Adder");
//
//        // 2. Instantiate data text fields for number entry.
//        // Simple terms: Two empty text input boxes for numeric values.
//        TextField tf1 = new TextField();
//        TextField tf2 = new TextField();
//
//        // 3. Create math calculation trigger button component.
//        // Simple terms: Button that executes addition logic when clicked.
//        Button addBtn = new Button("Add");
//
//        // 4. Create outcome display label component.
//        // Simple terms: Text label reserved for printing addition math answers or errors.
//        Label resultLabel = new Label("Result: ");
//
//        // 5. Position coordinate boundaries for input fields, buttons, and labels.
//        // Simple terms: Sets exact placement pixels for form arrangement.
//        tf1.setBounds(50, 100, 100, 30);
//        tf2.setBounds(160, 100, 100, 30);
//        addBtn.setBounds(50, 150, 80, 30);
//        resultLabel.setBounds(50, 200, 200, 30);
//
//        // 6. Bind action listener to process arithmetic logic upon click.
//        // Simple terms: Listens for the "Add" button click to parse numbers and compute totals.
//        addBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    // 7. Parse text strings into integer primitive types for mathematical calculation.
//                    // Simple terms: Converts typed string numbers into actual numbers (integers) Java can add.
//                    int num1 = Integer.parseInt(tf1.getText());
//                    int num2 = Integer.parseInt(tf2.getText());
//                    int sum = num1 + num2;
//
//                    // 8. Update output label string representation with computed sum value.
//                    // Simple terms: Displays the final math total on screen.
//                    resultLabel.setText("Result: " + sum);
//                } catch (NumberFormatException ex) {
//                    // 9. Safely catch runtime formatting errors if text entries are invalid.
//                    // Simple terms: Prevents crashes if someone types letters instead of numbers.
//                    resultLabel.setText("Error: Enter valid numbers!");
//                }
//            }
//        });
//
//        // 10. Add all input fields, buttons, and labels into master container layout.
//        // Simple terms: Attaches every visual component to the frame window.
//        frame.add(tf1);
//        frame.add(tf2);
//        frame.add(addBtn);
//        frame.add(resultLabel);
//
//        // 11. Finalize frame sizing, null layout enforcement, and display property.
//        // Simple terms: Configures window size parameters and makes everything visible to user.
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
//public class Main {
//    public static void main(String[] args) {
//        // 1. Initialize login frame container window.
//        // Simple terms: Creates the login screen boundary container.
//        Frame frame = new Frame("Login Screen");
//
//        // 2. Instantiate text field components for credentials entry.
//        // Simple terms: Input boxes for typing usernames and passwords.
//        TextField userField = new TextField();
//        TextField passField = new TextField();
//
//        // 3. Configure password text mask character property.
//        // Simple terms: Hides typed password letters behind asterisk symbols (*).
//        passField.setEchoChar('*');
//
//        // 4. Create login submission button and validation status label.
//        // Simple terms: Button to submit login credentials and a label for success/error text.
//        Button loginBtn = new Button("Login");
//        Label msgLabel = new Label("");
//
//        // 5. Establish layout coordinate bounds for inputs, buttons, and message labels.
//        // Simple terms: Sets exact placement pixels for clean form layout alignment.
//        userField.setBounds(150, 100, 150, 25);
//        passField.setBounds(150, 140, 150, 25);
//        loginBtn.setBounds(150, 180, 80, 30);
//        msgLabel.setBounds(150, 230, 200, 25);
//
//        // 6. Add action listener callback execution for credential evaluation.
//        // Simple terms: Listens for login button clicks to verify matching username and password values.
//        loginBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // 7. Retrieve text strings entered into input fields.
//                // Simple terms: Grabs whatever text the user typed into the user and password boxes.
//                String username = userField.getText();
//                String password = passField.getText();
//
//                // 8. Execute logical condition check matching hardcoded authorized credentials.
//                // Simple terms: Checks if username is "admin" and password is "1234".
//                if (username.equals("admin") && password.equals("1234")) {
//                    msgLabel.setText("Login Successful!");
//                } else {
//                    msgLabel.setText("Invalid Credentials!");
//                }
//            }
//        });
//
//        // 9. Append static descriptor labels, input elements, buttons, and feedback indicators to frame container.
//        // Simple terms: Adds title labels ("Username:", "Password:"), input fields, and buttons to the window.
//        frame.add(new Label("Username:") {{ setBounds(50, 100, 90, 25); }});
//        frame.add(new Label("Password:") {{ setBounds(50, 140, 90, 25); }});
//        frame.add(userField);
//        frame.add(passField);
//        frame.add(loginBtn);
//        frame.add(msgLabel);
//
//        // 10. Complete window dimension configuration and render visibility properties.
//        // Simple terms: Sets final window size dimensions and displays the application interface.
//        frame.setSize(400, 350);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}
// =====================================================================