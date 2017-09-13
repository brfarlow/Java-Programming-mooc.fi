
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class ButtonListener implements ActionListener {
    
    private JTextField input;
    private JTextField result;
    private JButton plus;
    private JButton minus;
    private JButton z;
    
    public ButtonListener(JTextField input, JTextField result, JButton plus, JButton minus, JButton z){
        this.input = input;
        this.result = result;
        this.plus = plus;
        this.minus = minus;
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource() == plus){
            add();
        }else if(e.getSource() == minus){
            subtract();
        }else{
            //z is the only other option.
            zero();
        }
        
    }
    
    private void add(){
        
        Integer x = 0;
        Integer y = 0;
        try{
            x = Integer.parseInt(input.getText());
            y = Integer.parseInt(result.getText());
        }catch(NumberFormatException e){
            y = 0;
        }
        
        Integer z = x+y;
        
        if(z != 0){
            this.z.setEnabled(true);
        }
        
        input.setText("");
        result.setText(z.toString());
        
        
    }
    
    private void subtract(){
        
        Integer x = 0;
        Integer y = 0;
        try{
            x = Integer.parseInt(input.getText());
            y = Integer.parseInt(result.getText());
        }catch(NumberFormatException e){
            y = 0;
        }
        
        Integer z = y-x;
        
        if(z != 0){
            this.z.setEnabled(true);
        }
        
        input.setText("");
        result.setText(z.toString());
    }
    
    private void zero(){
        
        z.setEnabled(false);
        input.setText("");
        result.setText("0");
    }
    
}
