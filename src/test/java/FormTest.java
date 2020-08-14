/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ipiesh
 */
public class FormTest {
    
    Form f = new Form();

    
    public FormTest() throws AWTException {
        
        var os = System.getProperty("os.name");
        int modKey;
        
        if ("Mac OS X".equals(os)){
            modKey = KeyEvent.VK_META;
        } else {
            modKey = KeyEvent.VK_CONTROL;
        }
        
        String[] text = new String[10];
        text[0] = "Ivan Piesh";
        text[1] = "555-555-5555";
        text[2] = "ivan.piesh@du.edu";
        text[3] = "1111 Cool Road, Sweet Home, Alabama, 99999";
        
        Robot bot = new Robot();
        
        f.setVisible(true);

        bot.delay(1000);
        bot.setAutoDelay(100);
        clip(text[0]);       
        bot.keyPress(modKey);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyRelease(modKey);
        bot.keyRelease(KeyEvent.VK_V);
        clip(text[1]);
        bot.keyPress(KeyEvent.VK_TAB);
        bot.keyRelease(KeyEvent.VK_TAB);
        bot.keyPress(KeyEvent.VK_TAB);
        bot.keyRelease(KeyEvent.VK_TAB);
        bot.keyPress(modKey);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyRelease(modKey);
        bot.keyRelease(KeyEvent.VK_V);
        clip(text[2]);
        bot.keyPress(KeyEvent.VK_TAB);
        bot.keyRelease(KeyEvent.VK_TAB);      
        bot.keyPress(modKey);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyRelease(modKey);
        bot.keyRelease(KeyEvent.VK_V);
        clip(text[3]);
        bot.keyPress(KeyEvent.VK_TAB);
        bot.keyRelease(KeyEvent.VK_TAB);       
        bot.keyPress(modKey);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyRelease(modKey);
        bot.keyRelease(KeyEvent.VK_V);
        bot.keyPress(KeyEvent.VK_TAB);
        bot.keyRelease(KeyEvent.VK_TAB);
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
        bot.delay(2000);
        bot.keyPress(KeyEvent.VK_TAB);
        bot.keyRelease(KeyEvent.VK_TAB);
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
        bot.delay(1000);
    }

    /**
     * Test of actionPerformed method, of class Form.
     */
    @Test
    public void testActionPerformed() {

    }
    
    private void clip(String text){
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
    }
    
}
