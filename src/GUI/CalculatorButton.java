package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorButton extends JButton{

    private String text;

    public <T> CalculatorButton(String text, T frame) {
        super();
        this.text = text;
        this.addActionListener((ActionListener) frame);
    }

    @Override
    public String getText() {
        return text;
    }
}
