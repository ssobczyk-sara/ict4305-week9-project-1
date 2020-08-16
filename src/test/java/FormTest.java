import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.junit.jupiter.api.Test;

/**
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Touriac
 * @author Kevin Taylor
 */

public class FormTest {
    
    Form f = new Form();

    /**
     * Test of actionPerformed method, of class Form.
     * @throws java.awt.AWTException
     */
    @Test
    public void testActionPerformed() throws AWTException {
        
        var os = System.getProperty("os.name");
        int modKey;
        
        if ("Mac OS X".equals(os)){
            modKey = KeyEvent.VK_META;
        } else {
            modKey = KeyEvent.VK_CONTROL;
        }
        
        String[] text = new String[10];
        text[0] = "Random Stranger";
        text[1] = "555";
        text[2] = "555-555-5555";
        text[3] = "blah@com";
        text[4] = "random.stranger@du.edu";
        text[5] = "1111 Cool Road, Sweet Home, Alabama, 99999";
        
        Robot bot = new Robot();
        
        f.setVisible(true);
        
        bot.delay(2000);
        bot.setAutoDelay(250);
        
        //______AUTOMATION START______
        
        // go to submit and press enter to test blank name
        pressTabByAmount(bot, 5);
        pressEnter(bot);
        bot.delay(1000);
        // relocate to name field
        pressTabByAmount(bot, 2);
        // copy paste proper name
        clip(text[0]);       
        paste(bot, modKey);
        // go to submit and press enter to test blank phone number
        pressTabByAmount(bot, 5);
        pressEnter(bot);
        bot.delay(1000);
        // relocate to phone number field
        pressTabByAmount(bot, 4);
        // copy paste invalid phone number
        clip(text[1]);
        paste(bot, modKey);
        // go to submit and press enter to test invalid phone number
        pressTabByAmount(bot, 3);
        pressEnter(bot);
        bot.delay(1000);
        // relocate to phone number field
        pressTabByAmount(bot, 4);
        // copy paste proper phone number
        clip(text[2]);
        selectAll(bot, modKey);
        paste(bot, modKey);
        // go to submit and press enter to test blank email
        pressTabByAmount(bot, 3);
        pressEnter(bot);
        bot.delay(1000);
        // relocate to email field
        pressTabByAmount(bot, 5);
        // copy paste invalid email
        clip(text[3]);
        paste(bot, modKey);
        // go to submit and press enter to test invalid email
        pressTabByAmount(bot, 2);
        pressEnter(bot);
        bot.delay(1000);
        // relocate to email field
        pressTabByAmount(bot, 5);
        // copy paste valid email
        clip(text[4]);
        selectAll(bot, modKey);
        paste(bot, modKey);
        // go to submit and press enter to test blank address
        pressTabByAmount(bot, 2);
        pressEnter(bot);
        bot.delay(1000);
        // relocate to address field
        pressTabByAmount(bot, 6);
        // copy paste valid address
        clip(text[5]);
        paste(bot, modKey);
        // go to submit and press enter to display successful form execution and text file generation
        pressTabByAmount(bot, 1);
        pressEnter(bot);
        bot.delay(2000);
        // clear floating display prompt
        pressEnter(bot);
        bot.delay(1000);
        pressTabByAmount(bot, 1);
        // go to and press reset button to reset form
        pressEnter(bot);
        bot.delay(2000); 
        
        //______AUTOMATION END______
    }
    
    private void clip(String text){
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
    }
    
    private void pressTabByAmount (Robot bot, int nubmer) {
        for (int i = 0; i < nubmer; i++) {
            bot.keyPress(KeyEvent.VK_TAB);
            bot.keyRelease(KeyEvent.VK_TAB);
        }
    }
    
    private void pressEnter (Robot bot){
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
    }
    
    private void paste (Robot bot, int modKey) {
        bot.keyPress(modKey);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyRelease(modKey);
        bot.keyRelease(KeyEvent.VK_V);
    }
    
    private void selectAll (Robot bot, int modKey) {
        bot.keyPress(modKey);
        bot.keyPress(KeyEvent.VK_A);
        bot.keyRelease(modKey);
        bot.keyRelease(KeyEvent.VK_A);
    }
    
}
