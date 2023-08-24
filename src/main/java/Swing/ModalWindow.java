package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModalWindow {
    String btnExit = "Exit";                //all these values sets by ResourceBundle for exact locale
    String btnNewGame = "New game";
    String lblResultWin = "You win! Congrats!";
    String lblResultLoose = "You loose.. Maybe next time..";
    String titleResult = "Result";
    boolean win = false;            //check result status for "Win" or "Loose" label text message


    public void showModalDialog(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, titleResult, true);
        dialog.setSize(200, 150);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        String lblResult;
        if(win){
            lblResult = lblResultWin;
        } else {
            lblResult = lblResultLoose;}

        JLabel label = new JLabel(lblResult);
        label.setHorizontalAlignment(JLabel.CENTER);

        JButton okButton = new JButton(btnNewGame);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //todo newGame()
                dialog.dispose();
            }
        });

        JButton cancelButton = new JButton(btnExit);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(label, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);

        dialog.getContentPane().add(contentPanel);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
    }
}