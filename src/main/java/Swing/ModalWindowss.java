package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModalWindowss {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Modal Dialog Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton showDialogButton = new JButton("Show Modal Dialog");
        showDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ModalWindow().showModalDialog(frame);
            }
        });

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(showDialogButton, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
