
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.sql.Time;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PC
 */
public final class SpinerTime extends JPanel{

    JSpinner spinner;
    JSpinner spinner1;
    JSpinner spinner2;
    JPanel panel;

    public SpinerTime() {
        SpinnerTime();
    }
    
    public JPanel SpinnerTime(){
        
        Font font = new Font("Arial",Font.BOLD,15);
        
        JLabel label = new JLabel("H");
        label.setFont(font);
        label.setBounds(0, 0, 15, 25);
        JLabel label1 = new JLabel("M");
        label1.setFont(font);
        label1.setBounds(65, 0, 15, 25);
        JLabel label2 = new JLabel("S");
        label2.setFont(font);
        label2.setBounds(127, 0, 15, 25);
        
        spinner = new JSpinner();
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(0, 0, 23, 1);
        spinner.setModel(spinnerNumberModel);
        spinner.setBounds(15, 0, 40, 25);
        spinner.setFont(font);
        
        spinner1 = new JSpinner();
        SpinnerNumberModel spinnerNumberModel1 = new SpinnerNumberModel(0, 0, 59, 1);
        spinner1.setModel(spinnerNumberModel1);
        spinner1.setBounds(80, 0, 40, 25);
        spinner1.setFont(font);
        
        spinner2 = new JSpinner();
        SpinnerNumberModel spinnerNumberModel2 = new SpinnerNumberModel(0, 0, 59, 1);
        spinner2.setModel(spinnerNumberModel2);
        spinner2.setBounds(140, 0, 40, 25);
        spinner2.setFont(font);
        
        
        panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setBounds(10, 30, 180, 25);
        panel.setLayout(null);
        panel.add(label);
        panel.add(spinner);
        panel.add(label1);
        panel.add(spinner1);
        panel.add(label2);
        panel.add(spinner2);
        return panel;
        
    }
    
    public Time getTime(){
        return new Time((int) spinner.getValue(), (int) spinner1.getValue(), (int) spinner2.getValue());
    }
    
    public void setTime(){
        spinner.setValue(1);
        spinner1.setValue(11);
        spinner2.setValue(21);
    }
    
    public static void main(String[] args) {
        SpinerTime panel1 = new SpinerTime();
        
        
        
               
        
        Button button = new Button();
        button.setBounds(300, 300, 50, 30);
        button.setEnabled(false);
        button.addActionListener((e) -> {
            panel1.setTime();
            System.out.println(panel1.getTime());
        });
        
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setBackground(Color.yellow);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setLayout(null);
        f.add(panel1.SpinnerTime());
        f.add(button);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
