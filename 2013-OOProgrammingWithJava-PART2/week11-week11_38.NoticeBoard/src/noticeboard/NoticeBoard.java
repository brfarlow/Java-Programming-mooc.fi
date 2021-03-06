package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        
        frame = new JFrame("Notice Board");
        
        frame.setPreferredSize(new Dimension(500,300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField fieldOne = new JTextField("I was copied here from the JTextArea");
        JButton copy = new JButton("Copy!");
        JLabel label = new JLabel();
        
        Copier copier = new Copier(fieldOne, label);
        copy.addActionListener(copier);
        
        container.add(fieldOne);
        container.add(copy);
        container.add(label);
        
    }
}
