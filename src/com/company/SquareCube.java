package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Matt on 7/7/2017.
 */
public class SquareCube {
    private JLabel title;
    private JTextField inputTextField;
    private JButton squareTheNumberButton;
    private JButton cubeTheButtonButton;
    private JTextField outputTextField;
    private JPanel gui;

    public SquareCube(){
        squareTheNumberButton.addActionListener(new BtnClicked(squareTheNumberButton.getText()));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SquareCube");
        frame.setContentPane(new SquareCube().gui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

private class BtnClicked implements ActionListener {

    private String value;

    public Btnclicked(String value) {
        this.value = value;
    }

    public void actionPerformed(){ActionEvent e}

}
