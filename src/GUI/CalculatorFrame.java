package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CalculatorFrame extends JFrame implements ActionListener {

    JLabel answerLine = new JLabel("0");

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
        answerLine.setHorizontalTextPosition(SwingConstants.RIGHT);
        answerLine.setForeground(Color.WHITE);
        panel.add(answerLine);
        panel.setBackground(Color.BLACK);
        panel.setBounds(4, 4, 276, 50);
        return panel;
    }

    public JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(new GridLayout(4, 3));
        panel.setBounds(4, 60, 276, 396);

        CalculatorButton btn1 = new CalculatorButton("1", this);
        CalculatorButton btn2 = new CalculatorButton("2", this);
        CalculatorButton btn3 = new CalculatorButton("3", this);
        CalculatorButton btn4 = new CalculatorButton("4", this);
        CalculatorButton btn5 = new CalculatorButton("5", this);
        CalculatorButton btn6 = new CalculatorButton("6", this);
        CalculatorButton btn7 = new CalculatorButton("7", this);
        CalculatorButton btn8 = new CalculatorButton("8", this);
        CalculatorButton btn9 = new CalculatorButton("9", this);
        CalculatorButton btn0 = new CalculatorButton("0", this);
        CalculatorButton btnDecimal = new CalculatorButton(".", this);

        CalculatorButton btnBack = new CalculatorButton("B", this);

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnBack);
        panel.add(btn0);
        panel.add(btnDecimal);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if ((Objects.equals(e.getActionCommand(), "B"))
                        && answerLine.getText().length() == 1) {
            answerLine.setText("0");
        }

        else if (Objects.equals(e.getActionCommand(), "B")) {
            answerLine.setText(answerLine.getText().substring(0, answerLine.getText().length() - 1));
        }

        else if (Objects.equals(e.getActionCommand(), ".") && (answerLine.getText().indexOf('.') != -1)) {
            answerLine.setText(answerLine.getText());
        }

        else if (!Objects.equals(answerLine.getText(), "0")) {
            answerLine.setText(answerLine.getText() + e.getActionCommand());
        }

        else {answerLine.setText(e.getActionCommand());}

    }
}
