
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class SpinnerTable {
    private class SpinnerTableCellRenderer extends JSpinner implements TableCellRenderer{

        JSpinner spinner;
        
        public SpinnerTableCellRenderer() {
            spinner = new JSpinner();
            setOpaque(true);
        }
        
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            setValue((value==null) ? 0:value);
            return this;
        }
        
    }
    private class SpinnerTableCellEditer extends DefaultCellEditor{
        
        JSpinner spinner;
        
        public SpinnerTableCellEditer(JTextField textField) {
            super(textField);
            spinner= new JSpinner();
            spinner.setOpaque(true);
        }
        @Override
        public Component getTableCellEditorComponent(JTable table, Object obj,
                boolean selected, int row, int col) {
            return spinner;
        }

        @Override
        public Object getCellEditorValue() {
            return spinner.getValue();
        }

        @Override
        public boolean stopCellEditing() {
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
        @Override
        public String toString(){
            return (String) spinner.getValue();
        }
    }
}
