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

/**
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Touriac
 * @author Kevin Taylor
 */

public class Form extends JFrame implements ActionListener {

    private final JPanel contentPane;
    private final JLabel title; 
    private final JLabel name; 
    private final JTextField tname; 
    private final JLabel phoneNumber; 
    private final JTextField tPN;  
    private final JLabel address; 
    private final JTextArea tA; 
    private final JLabel email; 
    private final JTextField tE;
    private final JButton sub; 
    private final JButton reset; 
    private final JTextArea tout; 
    private final JLabel res;
  
    //TODO: Add input validation
    
    public Form() {   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(800, 450, 800, 450);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
// Title
        title = new JLabel("Contact Form"); 
        title.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        title.setSize(300, 30); 
        title.setLocation(297, 30); 
        contentPane.add(title); 
        
// Name  
        name = new JLabel("Name"); 
        name.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        name.setSize(200, 30); 
        name.setLocation(100, 100); 
        contentPane.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tname.setSize(225, 30); 
        tname.setLocation(225, 100); 
        contentPane.add(tname);   
        
// Phone Number  
        phoneNumber = new JLabel("Phone Number"); 
        phoneNumber.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        phoneNumber.setSize(200, 30); 
        phoneNumber.setLocation(100, 150); 
        contentPane.add(phoneNumber); 
  
        tPN = new JTextField(); 
        tPN.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tPN.setSize(225, 30); 
        tPN.setLocation(225, 150); 
        contentPane.add(tPN);        

// Email   
        email = new JLabel("Email"); 
        email.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        email.setSize(200, 30); 
        email.setLocation(100, 200); 
        contentPane.add(email); 
  
        tE = new JTextField(); 
        tE.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tE.setSize(225, 30); 
        tE.setLocation(225, 200);  
        contentPane.add(tE);
        
// Address  
        address = new JLabel("Address"); 
        address.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        address.setSize(200, 30); 
        address.setLocation(100, 250); 
        contentPane.add(address); 
  
        tA = new JTextArea(); 
        tA.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tA.setSize(225, 60); 
        tA.setLocation(225, 250); 
        tA.setLineWrap(true); 
        contentPane.add(tA); 
        
// Submit Button
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(275, 350); 
        sub.addActionListener((ActionListener) this); 
        contentPane.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(400, 350); 
        reset.addActionListener((ActionListener) this); 
        contentPane.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tout.setSize(200, 210); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        contentPane.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        res.setSize(500, 25); 
        res.setLocation(275, 375); 
        contentPane.add(res);

    } 
  
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == sub) { 
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
            
            //TODO: Create Text file with inputted information
            
            res.setText("Contact Registration Successful!"); 
        } 
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            tname.setText(def); 
            tA.setText(def);
            tE.setText(def);
            tPN.setText(def); 
            res.setText(def); 
            tout.setText(def);   
        } 
    } 
}
    
//    PHONE NUMBER VALIDATION NOTES
//    private boolean isValidPhoneNumber(){
//        if (phoneNumber.matches("\\d{10}")) return true;
//        if (phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
//        if (phoneNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
//        return false;
//    }
