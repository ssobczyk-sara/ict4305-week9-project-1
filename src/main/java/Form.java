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
 *
 * @author ssobczyk
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
    private final JTextArea tE;
    private final JButton sub; 
    private final JButton reset; 
    private final JTextArea tout; 
    private final JLabel res; 
    private final JTextArea resadd;
  
    //TODO: Add input validation
    
    public Form() {   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
// Title
        title = new JLabel("Registration Form"); 
        title.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        contentPane.add(title); 
        
// Name  
        name = new JLabel("Name"); 
        name.setFont(new Font("Gotham", Font.PLAIN, 14)); 
        name.setSize(100, 20); 
        name.setLocation(100, 100); 
        contentPane.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(200, 100); 
        contentPane.add(tname); 
        
// Address  
        address = new JLabel("Address"); 
        address.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        address.setSize(100, 20); 
        address.setLocation(100, 300); 
        contentPane.add(address); 
  
        tA = new JTextArea(); 
        tA.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tA.setSize(200, 75); 
        tA.setLocation(200, 300); 
        tA.setLineWrap(true); 
        contentPane.add(tA); 
        
// Email   
        email = new JLabel("Email"); 
        email.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        email.setSize(100, 20); 
        email.setLocation(100, 200); 
        contentPane.add(email); 
  
        tE = new JTextArea(); 
        tE.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tE.setSize(200, 75); 
        tE.setLocation(200, 200); 
        tE.setLineWrap(true); 
        contentPane.add(tE);
        
// Phone Number  
        phoneNumber = new JLabel("Phone Number"); 
        phoneNumber.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        phoneNumber.setSize(100, 20); 
        phoneNumber.setLocation(100, 150); 
        contentPane.add(phoneNumber); 
  
        tPN = new JTextField(); 
        tPN.setFont(new Font("AGotham", Font.PLAIN, 15)); 
        tPN.setSize(150, 20); 
        tPN.setLocation(200, 150); 
        contentPane.add(tPN);
        
// Submit Button
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(150, 450); 
        sub.addActionListener((ActionListener) this); 
        contentPane.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 450); 
        reset.addActionListener((ActionListener) this); 
        contentPane.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        contentPane.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Gotham", Font.PLAIN, 25)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        contentPane.add(res);
  
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Gotham", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        contentPane.add(resadd); 
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
            
            res.setText("Registration Successful!"); 
        } 
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            tname.setText(def); 
            tA.setText(def); 
            tPN.setText(def); 
            res.setText(def); 
            tout.setText(def);   
            resadd.setText(def); 
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
