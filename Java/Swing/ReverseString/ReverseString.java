import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseString extends JFrame implements ActionListener{

public JPanel panel;
public JLabel label, label2;
public JButton button;
public JTextField textField;
public SpringLayout springLayout;

public ReverseString(){
setTitle("Main Frame");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);

label = new JLabel("Enter String");
label2 = new JLabel();
textField = new JTextField(16);
button = new JButton("Reverse");

button.addActionListener(this);

panel = new JPanel();
springLayout = new SpringLayout();
panel.setLayout(springLayout);

panel.add(label);
panel.add(textField);
panel.add(button);
panel.add(label2);

springLayout.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, panel);
springLayout.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, panel);

springLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.EAST, label);
springLayout.putConstraint(SpringLayout.NORTH, textField, 10, SpringLayout.NORTH, panel);

springLayout.putConstraint(SpringLayout.WEST, button, 10, SpringLayout.WEST, panel);
springLayout.putConstraint(SpringLayout.NORTH, button, 10, SpringLayout.SOUTH, textField);

springLayout.putConstraint(SpringLayout.WEST, label2, 10, SpringLayout.WEST, panel);
springLayout.putConstraint(SpringLayout.NORTH, label2, 10, SpringLayout.SOUTH, button);

add(panel);
pack();
setSize(300, 150);
setVisible(true);

}

public void actionPerformed(ActionEvent e){
String p = textField.getText();
String r = reverseString(p);
label2.setText(r);
textField.setText("");
}

public static String reverseString(String s){
String o = "";
int l = s.length();
int i;
for(i = l-1; i >= 0; --i){
o += s.charAt(i);
}
return o;
}

public static void main(String[] args){
javax.swing.SwingUtilities.invokeLater(new Runnable(){
public void run(){
new ReverseString();
}
});
}
}