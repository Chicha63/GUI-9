import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Problem 2");


        JPanel panel = new JPanel(new GridLayout(1,3));

        JButton button1 = new JButton("Warsaw");
        JButton button2 = new JButton("Change Title...");

        JTextField textField = new JTextField("Paris");

        button1.addActionListener(e->textField.setText(button1.getText()));

        textField.addActionListener(e->button1.setText(textField.getText()));

        button2.addActionListener(e->frame.setTitle(textField.getText()));

        panel.add(button1);
        panel.add(button2);
        panel.add(textField);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}