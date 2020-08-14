<<<<<<< Updated upstream
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
=======
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.io.FileWriter;
import javax.swing.JOptionPane;
>>>>>>> Stashed changes

/**
 *
 * @author ssobczyk
 */
public class Form {

    private final Container c; 
    private final JLabel title; 
    private final JLabel name; 
    private final JTextField tname; 
    private final JLabel phoneNumber; 
    private final JTextField tPN;  
    private final JLabel address; 
    private final JTextArea tA; 
    private final JLabel email; 
    private final JTextArea tE;
    private final JCheckBox term;
    private final JButton sub; 
    private final JButton reset; 
    private final JTextArea tout; 
    private final JLabel res; 
<<<<<<< Updated upstream
    private final JTextArea resadd;  
=======
    private final JTextArea resadd;
    FileWriter fileWriter;
>>>>>>> Stashed changes
  
 
    public Form() 
    {  
        c = getContentPane(); 
        c.setLayout(null); 
        
// Title
        title = new JLabel("Registration Form"); 
        title.setFont(new Font("Gotham", Font.PLAIN, 40)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        c.add(title); 
        
// Name  
        name = new JLabel("Name"); 
        name.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        name.setSize(100, 20); 
        name.setLocation(100, 100); 
        c.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(200, 100); 
        c.add(tname); 
        
// Address  
        address = new JLabel("Address"); 
        address.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        address.setSize(100, 20); 
        address.setLocation(100, 300); 
        c.add(address); 
  
        tA = new JTextArea(); 
        tA.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tA.setSize(200, 75); 
        tA.setLocation(200, 300); 
        tA.setLineWrap(true); 
        c.add(tA); 
        
// Email   
        email = new JLabel("Email"); 
        email.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        email.setSize(100, 20); 
        email.setLocation(100, 300); 
        c.add(email); 
  
        tE = new JTextArea(); 
        tE.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tE.setSize(200, 75); 
        tE.setLocation(200, 300); 
        tE.setLineWrap(true); 
        c.add(tE);
        
// Phone Number  
        phoneNumber = new JLabel("Phone Number"); 
        phoneNumber.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        phoneNumber.setSize(100, 20); 
        phoneNumber.setLocation(100, 150); 
        c.add(phoneNumber); 
  
        tPN = new JTextField(); 
        tPN.setFont(new Font("AGotham", Font.PLAIN, 15)); 
        tPN.setSize(150, 20); 
        tPN.setLocation(200, 150); 
        c.add(tPN); 

        term = new JCheckBox("Accept Terms And Conditions."); 
        term.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(150, 400); 
        c.add(term);
        
// Submit Button
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(150, 450); 
        sub.addActionListener((ActionListener) this); 
        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 450); 
        reset.addActionListener((ActionListener) this); 
        c.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        c.add(res); 
  
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
    } 
  

    
    
    
    
    
    
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == sub) { 
<<<<<<< Updated upstream
            if (term.isSelected()) {  
                String data 
                    = "Name : "
                      + tname.getText() + "\n"
                      + "Mobile : "
                      + tPN.getText() + "\n";  
  
                String data3 = "Address : " + tA.getText(); 
                tout.setText(data + data3); 
                tout.setEditable(false); 
                res.setText("Registration Successfully.."); 
            } 
            else { 
                tout.setText(""); 
                resadd.setText(""); 
                res.setText("Please accept the"
                            + " terms & conditions.."); 
            } 
=======
            String data 
                = "Name : "
                  + tname.getText() + "\n"
                  + "Mobile : "
                  + tPN.getText() + "\n" 
                  + "Email : "
                  + tE.getText() + "\n";

            String data3 = "Address : " + tA.getText(); 
            tout.setText(data + data3); 
            tout.setEditable(false);          
            res.setText("Registration Successful!"); 

			try {
			  String file = "Wk9Grp3Assignment.txt";
			  String path = ("../" +file);
			  fileWriter = new FileWriter(path);
			  fileWriter.write(name.getText() + ":" + tname.getText() + " ");
			  fileWriter.write(phoneNumber.getText() + ":" + tPN.getText() + " ");
			  fileWriter.write(address.getText() + ":" + tA.getText() + " ");
			  fileWriter.write(email.getText() + ":" + tE.getText());
			  fileWriter.close();
			  JOptionPane.showMessageDialog(null, "Output file " +file+ " has been successfully saved to project root folder.");
			} catch (Exception f) {JOptionPane.showMessageDialog(null, f + "");}
>>>>>>> Stashed changes
        } 
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            tname.setText(def); 
            tA.setText(def); 
			tE.setText(def);
            tPN.setText(def); 
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false);  
            resadd.setText(def); 
        } 

		else if (e.getActionCommand()== sub.getActionCommand()) {

		}
    } 
} 