
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class CalculatorButtons extends JPanel{
    
    private JTextField input;
    private JTextField result;
    
    public CalculatorButtons(JTextField input, JTextField result){
        super(new GridLayout(1,3));
        this.input = input;
        this.result = result;
        createComponents();
        
    }
    
    private void createComponents(){
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton z = new JButton("Z");
        z.setEnabled(false);
        
        add(plus);
        add(minus);
        add(z);
        
        ButtonListener listener = new ButtonListener(input, result, plus, minus, z);
        plus.addActionListener(listener);
        minus.addActionListener(listener);
        z.addActionListener(listener);
        
        
        
    }
}
