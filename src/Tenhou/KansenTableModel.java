/**
 * 
 */
package Tenhou;

import java.awt.event.MouseEvent;

import javax.swing.table.DefaultTableModel;

/**
 * @author HiKari
 * 观战表格Model
 */
@SuppressWarnings("serial")
public class KansenTableModel extends DefaultTableModel{

	public KansenTableModel(Object[][] data, Object[] columnNames) {
    	super(data, columnNames);
    }

    public boolean isCellEditable(int row, int column) {
    	return false;
    }
    
    
}
