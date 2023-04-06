
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class ButtonTextCell extends AbstractCellEditor implements TableCellRenderer, TableCellEditor{
    String value ="default";
    JPanel panel = new JPanel();
    JButton button;
    JTextField text;

    public ButtonTextCell(){
        super();
        button = new JButton("...");
        button.setPreferredSize(new Dimension(16,16));
        button.setFocusable(false);
        button.setRolloverEnabled(false);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            //fireEditingStopped();
            JOptionPane.showMessageDialog(null, "Hello");
            //fireEditingStopped();
            }
        });
        text = new JTextField(value);
        text.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                value = text.getText();
                //fireEditingStopped();
            }
        });
        panel.setLayout(new BorderLayout());
        panel.add(button,BorderLayout.EAST);
        panel.add(text,BorderLayout.CENTER);
    }

    @Override
    public Object getCellEditorValue() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
        boolean isSelected, int row, int column) {
        //panel.setBackground(table.getSelectionBackground());
        return panel;
    }   

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        //text.setBackground(isSelected?table.getSelectionBackground():table.getBackground());
        if(isSelected){
        text.setBackground(table.getSelectionBackground());
        button.setBackground(table.getSelectionBackground());
        }else
            text.setBackground(table.getBackground());
            button.setBackground(table.getBackground());
            if (value == null|| value.toString().length() == 0)
                return panel;
        return panel;
    }
}