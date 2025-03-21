package GUI;
import javax.swing.*;
import java.awt.*;

public class CalculatorFrame  extends JFrame {

    public CalculatorFrame() {
        this.setTitle("Calculator");
        ImageIcon image = new ImageIcon("theIdea.png");
        this.setSize(300, 500);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(image.getImage());

        this.add(createAnswerPanel());
        this.add(createButtonPanel());

        this.setVisible(true);
    }

    public JPanel createAnswerPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(4, 4, 276, 50);
        return panel;
    }

    public JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(new GridLayout(3, 3));
        panel.setBounds(4, 60, 276, 396);
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        return panel;
    }

}
