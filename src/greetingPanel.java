import javax.swing.*;


public class greetingPanel extends JPanel {
    
    private JLabel instructionalMessage;
    
    public greetingPanel(){
        
        instructionalMessage = new JLabel("Choose Lottery to generate:");
        
        add (instructionalMessage);
    }
}
