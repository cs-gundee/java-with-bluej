import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FactorialGUIAbsoluteLayout implements ActionListener
{
    private JFrame frame;
    private JTextField txt_number;
    private JLabel hariu;
    
    public static void main(String args[]) {
        new FactorialGUIAbsoluteLayout();
    }
    
    public FactorialGUIAbsoluteLayout(){
        frame = new JFrame("Факториал олох программ");
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel label1 = new JLabel("Факториал олох тоо: ");
        // setBounds(x, y, өргөн, өндөр)
        label1.setBounds(10, 10, 150, 15);
        
        txt_number = new JTextField();
        txt_number.setBounds(150, 10, 50, 20);
        
        JButton button = new JButton("Факториал бодох");
        button.setBounds(210, 8, 150, 25);
        
        JLabel label2 = new JLabel("Хариу: ");
        label2.setBounds(85, 34, 50, 15);
        
        hariu = new JLabel("_");
        hariu.setBounds(150, 34, 150, 15);
        
        panel.add(label1);
        panel.add(txt_number);
        panel.add(button);
        panel.add(label2);
        panel.add(hariu);
        
        frame.add(panel);
        
        frame.setBounds(100, 100, 400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        button.addActionListener(this);
        
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(!txt_number.getText().equals("")){
            int too = Integer.parseInt(txt_number.getText());
            Factorial f = new Factorial();
            int result = f.calcFact(too);
            hariu.setText(Integer.toString(too) + "! = " + Integer.toString(result));
        } else 
            JOptionPane.showMessageDialog(frame, "Факториал олох тоогоо оруулаарай.");        
    }
}
