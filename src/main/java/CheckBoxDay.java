
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PC
 */
public class CheckBoxDay extends JPanel{

    public CheckBoxDay() {
        day();
    }
    

    public void day(){
        
        JRadioButton radioButtonMon = new JRadioButton("MON");
        radioButtonMon.setBounds(1, 1, 55, 18);
        JRadioButton radioButtonTue = new JRadioButton("TUE");
        radioButtonTue.setBounds(57, 1, 55, 18);
        JRadioButton radioButtonWed = new JRadioButton("WED");
        radioButtonWed.setBounds(113, 1, 55, 18);
        JRadioButton radioButtonThu = new JRadioButton("THU");
        radioButtonThu.setBounds(169, 1, 55, 18);
        JRadioButton radioButtonFri = new JRadioButton("FRI");
        radioButtonFri.setBounds(1, 21, 55, 18);
        JRadioButton radioButtonSat = new JRadioButton("SAT");
        radioButtonSat.setBounds(57, 21, 55, 18);
        JRadioButton radioButtonSun = new JRadioButton("SUN");
        radioButtonSun.setBounds(113, 21, 55, 18);
        JRadioButton radioButtonAll = new JRadioButton("ALL");
        radioButtonAll.setBounds(169, 21, 55, 18);
        
        radioButtonAll.addActionListener((e)->{
            if(radioButtonAll.isSelected()){
                radioButtonMon.setSelected(true);
                radioButtonTue.setSelected(true);
                radioButtonWed.setSelected(true);
                radioButtonThu.setSelected(true);
                radioButtonFri.setSelected(true);
                radioButtonSat.setSelected(true);
                radioButtonSun.setSelected(true);
            }else{
                radioButtonMon.setSelected(false);
                radioButtonTue.setSelected(false);
                radioButtonWed.setSelected(false);
                radioButtonThu.setSelected(false);
                radioButtonFri.setSelected(false);
                radioButtonSat.setSelected(false);
                radioButtonSun.setSelected(false);
            }
        });
        
        
        JPanel panelDay = new JPanel();
        panelDay.setBackground(Color.lightGray);
        panelDay.setLayout(null);
        panelDay.setBounds(5, 15, 225, 40);
        panelDay.add(radioButtonMon);
        panelDay.add(radioButtonTue);
        panelDay.add(radioButtonWed);
        panelDay.add(radioButtonThu);
        panelDay.add(radioButtonFri);
        panelDay.add(radioButtonSat);
        panelDay.add(radioButtonSun);
        panelDay.add(radioButtonAll);
        
        
        
        
        
        JPanel pnlDayKH = new JPanel();
        pnlDayKH.setBorder(BorderFactory.createTitledBorder("DAY"));
        pnlDayKH.setBackground(null);
        pnlDayKH.setLayout(null);
        pnlDayKH.setBounds(100, 100, 235, 60);
        pnlDayKH.add(panelDay);
    }
    public static void main(String[] args) {
        
        CheckBoxDay checkBoxDay = new CheckBoxDay();
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setBackground(Color.yellow);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setLayout(null);
        f.add(checkBoxDay);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
