
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        
        frame = new JFrame("Calculator");
        
        frame.setPreferredSize(new Dimension(500,300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField result = new JTextField("0");
        result.setEnabled(false);
        
        JTextField input = new JTextField("0");
        CalculatorButtons buttons = new CalculatorButtons(input, result);
        
        container.add(result);
        container.add(input);
        container.add(buttons);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}