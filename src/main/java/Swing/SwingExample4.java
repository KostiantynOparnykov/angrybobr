package Swing;

import javax.swing.*;

class SwingExample4 {

    public static void main(String[] args) {
        //Declare a JFrame object
        JFrame frame = new JFrame();
        //Display a simple message dialog box with a default icon
        JOptionPane.showMessageDialog(frame,"Learn Java Swing");
        //Display a simple message dialog box with a warning icon
        JOptionPane.showMessageDialog(frame,"Something is missing.","Alert",JOptionPane.WARNING_MESSAGE);
        //Take input from the confirm dialog box
        int input =JOptionPane.showConfirmDialog(frame,"Do you want to learn Java swing?");
        //Check whether the user pressed YES or not
        if(input == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Glad to hear it.");
        }
        //Take string value from the user
        String answer = JOptionPane.showInputDialog("What is your favorite programming language? ");

        //Display message with the input value
        JOptionPane.showMessageDialog(null, "You like " + answer + "!");
    }
}
