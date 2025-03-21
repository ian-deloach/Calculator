package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CalculatorFrame extends JFrame implements ActionListener {

    JLabel answerLine = new JLabel("0");
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");
    private JButton btn0 = new JButton("0");
    private JButton btnBack = new JButton("B");
    private JButton btnDecimal = new JButton(".");

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
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnBack.addActionListener(this);
        btnDecimal.addActionListener(this);

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

        else if (!Objects.equals(answerLine.getText(), "0")) {
            answerLine.setText(answerLine.getText() + e.getActionCommand());
        }

        else {answerLine.setText(e.getActionCommand());}

        //TODO remove out print
        System.out.println(e.getActionCommand());
    }
}
