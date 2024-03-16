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

public class FactorialGUI implements ActionListener
{
    private JFrame frame;
    private JTextField txt_number;
    private JLabel hariu;
    
    public static void main(String args[]) {
        new FactorialGUI();
    }
    
    public FactorialGUI(){
        frame = new JFrame("Факториал олох программ");
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        JLabel label1 = new JLabel("Факториал олох тоо: ");
        txt_number = new JTextField(5);
        JButton button = new JButton("Факториал бодох");
        JLabel label2 = new JLabel("Хариу: ");
        hariu = new JLabel("_");
        
        panel.add(label1);
        panel.add(txt_number);
        panel.add(button);
        panel.add(label2);
        panel.add(hariu);
        
        frame.add(panel);
        
        frame.setSize(240, 100);
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
            hariu.setText(Integer.toString(result));
        } else 
            JOptionPane.showMessageDialog(frame, "Факториал олох тоогоо оруулаарай.");
        
    }
}
