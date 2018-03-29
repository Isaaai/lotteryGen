import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class lotteryPanel extends JPanel{   
    
    
    private JRadioButton none;
    private JRadioButton powerBall;
    private JRadioButton megaMillions;
    private ButtonGroup bg;
    
    public lotteryPanel(){
        
        
        setLayout(new GridLayout(1,3));
        none = new JRadioButton("None");
        powerBall = new JRadioButton("Power Ball");
        megaMillions = new JRadioButton("Mega Millions");
        
        bg = new ButtonGroup();
        bg.add(none);
        bg.add(powerBall);
        bg.add(megaMillions);
        
        setBorder(BorderFactory.createTitledBorder("Lottery"));
        
        add(none);
        add(powerBall);
        add(megaMillions);
    }
    
    public int getLottery(){
        
        Random rand = new Random();
        
        int oneP, twoP, threeP, fourP, fiveP, sixP;
        int oneM, twoM, threeM, fourM, fiveM, sixM;
        
        if (none.isSelected())
        {
            JOptionPane.showMessageDialog(null, "You can close the window, thank you!"); 
        }
        else if (powerBall.isSelected())
        {    
            oneP = rand.nextInt(69)+1;
            twoP = rand.nextInt(69)+1;
            threeP = rand.nextInt(69)+1;
            fourP = rand.nextInt(69)+1;
            fiveP = rand.nextInt(69)+1;
            sixP = rand.nextInt(26)+1;
            
            JOptionPane.showMessageDialog(null, "Your numbers are: " + oneP + " " + twoP + " " 
                                          + threeP + " " + fourP + " " + fiveP 
                                          + " and your Powerball number is: " + sixP);
        }
        else if (megaMillions.isSelected())
        {
            oneM = rand.nextInt(70)+1;
            twoM = rand.nextInt(70)+1;
            threeM = rand.nextInt(70)+1;
            fourM = rand.nextInt(70)+1;
            fiveM = rand.nextInt(70)+1;
            sixM = rand.nextInt(25)+1;
            
            JOptionPane.showMessageDialog(null, "Your numbers are: " + oneM + " " + twoM 
                                          + " " + threeM + " " + fourM + " " + fiveM 
                                          + " and your Megamillion number is: " + sixM);
        }
        return 0;
    }
    
}
