import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class lotteryNumberGenerator extends JFrame 
{
    private greetingPanel banner;
    private lotteryPanel lottery;
    private JPanel buttonPanel;
    private JButton genButton;
    private JButton exitButton;
   
    
    
    public lotteryNumberGenerator()
    {
        setTitle("Random Lottery Number Generator");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        banner = new greetingPanel();
        lottery = new lotteryPanel();
        
        buildButtonPanel();
        
        add(banner, BorderLayout.NORTH);
        add(lottery, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
    private void buildButtonPanel()
    {
        buttonPanel = new JPanel();
        
        genButton = new JButton("Generate");
        exitButton = new JButton("Exit");
        
        genButton.addActionListener(new GenButtonListener());
        exitButton.addActionListener(new ExitButtonListener());
        
        buttonPanel.add(genButton);
        buttonPanel.add(exitButton);
        
    }
    
    private class GenButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int numbers;
            numbers = lottery.getLottery();
            
            
        }
    }
    
    private class ExitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    
    public static void main(String[] args)
    {
        new lotteryNumberGenerator();
    }
}
