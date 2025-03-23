package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class CalculatorFrame extends JFrame implements ActionListener {

    JLabel answerLine = new JLabel("0");
    ArrayList<CalculatorButton> buttons = new ArrayList<>();

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
        panel.setLayout(new GridLayout(5, 4));
        panel.setBounds(4, 60, 276, 396);

        buttons.add(new CalculatorButton("T", this));
        buttons.add(new CalculatorButton("M", this));
        buttons.add(new CalculatorButton("C", this));
        buttons.add(new CalculatorButton("/", this));

        buttons.add(new CalculatorButton("7", this));
        buttons.add(new CalculatorButton("8", this));
        buttons.add(new CalculatorButton("9", this));
        buttons.add(new CalculatorButton("*", this));

        buttons.add(new CalculatorButton("4", this));
        buttons.add(new CalculatorButton("5", this));
        buttons.add(new CalculatorButton("6", this));
        buttons.add(new CalculatorButton("-", this));

        buttons.add(new CalculatorButton("1", this));
        buttons.add(new CalculatorButton("2", this));
        buttons.add(new CalculatorButton("3", this));
        buttons.add(new CalculatorButton("+", this));

        buttons.add(new CalculatorButton("B", this));
        buttons.add(new CalculatorButton("0", this));
        buttons.add(new CalculatorButton(".", this));
        buttons.add(new CalculatorButton("=", this));

        for(CalculatorButton button : buttons) {
            panel.add(button);
        }

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
