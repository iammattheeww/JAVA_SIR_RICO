// FIRST ACTIVITY KAY SIR RICO: BASIC GUI CALCULATOR
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    public static void main (String[] justin121005){
        // NEW FRAME
        Frame myFrame = new Frame("Simple Calculator");

        // FRAME CONFIGURATION
        myFrame.setSize(1024, 768);
        myFrame.setLayout(null);
        myFrame.setVisible(true);

        // TEXT FIELDS FOR NUMBER INPUTS
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        // BUTTON FOR EQUALS (ADD, SUBTRACT, MULTIPLY, DIVIDE)
        Button addBtn = new Button("Add (+)");
        Button subtractBtn = new Button("Subtract (-)");
        Button multiplyBtn = new Button("Multiply (*)");
        Button divideBtn = new Button("Divide (/)");

        // RESULT
        Label resultLabel = new Label("Result: ");

        // TEXT FIELD POSITIONING
        tf1.setBounds(150, 100, 100, 30);
        tf2.setBounds(260, 100, 100, 30);

        // FOR ADDITION
        addBtn.setBounds(50, 130, 80, 40);

        // FOR SUBTRACTION
        subtractBtn.setBounds(150, 130, 80, 40);

        // FOR MULTIPLICATION
        multiplyBtn.setBounds(250, 130, 80, 40);

        // FOR DIVISION
        divideBtn.setBounds(350, 130, 80, 40);

        resultLabel.setBounds(50, 200, 200, 30);

        // LISTENER EVENT FOR THE ADDITION
        addBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    // 9. Safely catch runtime formatting errors if text entries are invalid.
                    // Simple terms: Prevents crashes if someone types letters instead of numbers.
                    resultLabel.setText("Error: Enter valid numbers!");
                }
            }
        });

        // LISTENER EVENT FOR THE SUBTRACTION
        subtractBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int subtracted = num1 - num2;
                    resultLabel.setText("Result: " + subtracted);
                } catch (NumberFormatException ex) {
                    // 9. Safely catch runtime formatting errors if text entries are invalid.
                    // Simple terms: Prevents crashes if someone types letters instead of numbers.
                    resultLabel.setText("Error: Enter valid numbers!");
                }
            }
        });

        // LISTENER EVENT FOR THE MULTIPLY
        multiplyBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int multiplied = num1 * num2;
                    resultLabel.setText("Result: " + multiplied);
                } catch (NumberFormatException ex) {
                    // 9. Safely catch runtime formatting errors if text entries are invalid.
                    // Simple terms: Prevents crashes if someone types letters instead of numbers.
                    resultLabel.setText("Error: Enter valid numbers!");
                }
            }
        });

        // LISTENER EVENT FOR THE DIVIDE
        divideBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int divide = num1 / num2;
                    resultLabel.setText("Result: " + divide);
                } catch (NumberFormatException ex) {
                    // 9. Safely catch runtime formatting errors if text entries are invalid.
                    // Simple terms: Prevents crashes if someone types letters instead of numbers.
                    resultLabel.setText("Error: Enter valid numbers!");
                }
            }
        });

        // ADD FRAMES FOR VISUALS
        myFrame.add(tf1);
        myFrame.add(tf2);
        myFrame.add(addBtn);
        myFrame.add(subtractBtn);
        myFrame.add(multiplyBtn);
        myFrame.add(divideBtn);
        myFrame.add(resultLabel);

        // FINAL SIZING
        myFrame.setSize(400, 300);
        myFrame.setLayout(null);
        myFrame.setVisible(true);
    }
}
