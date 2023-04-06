
import java.awt.Event;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("ID"));
        jPanel.setLocation(50,50);
        jPanel.setSize(100,60);
        
        
        
        
        JFrame jFrame = new JFrame("Hoa Don");
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(500,500);
        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
}
