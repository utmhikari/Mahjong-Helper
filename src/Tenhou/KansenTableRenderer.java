package Tenhou;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * 
 * 参照http://bbs.csdn.net/topics/390726474
 *
 */

@SuppressWarnings("serial")
public class KansenTableRenderer extends DefaultTableCellRenderer {
	
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		
	    @Override
	    public Component getTableCellRendererComponent(JTable table, Object value,
	            boolean isSelected, boolean hasFocus, int row, int column) {
	        Component renderer =dtcr.getTableCellRendererComponent(table, value,
	                isSelected, hasFocus, row, column);
	        if (renderer instanceof JLabel)
	        {
	           dtcr.setHorizontalAlignment(JLabel.CENTER);
	        }
	        if(isSelected){
	        	if (TenhouKansen.KSExistList.contains(TenhouKansen.sorter.convertRowIndexToModel(row))) {
	        			renderer.setBackground(Color.YELLOW);	        		
		        } 
		        else renderer.setBackground(new Color(160,207,254,170));
	        }
	        else{
		       if (TenhouKansen.KSExistList.contains(TenhouKansen.sorter.convertRowIndexToModel(row))) {	
	        			renderer.setBackground(new Color(56,247,9,125));	        		
		        } 
		        else {
		        	if(row % 2 == 0) {
		        		renderer.setBackground(Color.WHITE);
		        	}
		        	else {
		        		renderer.setBackground(new Color(224,224,224,200));
		        	}
		        }
	        }
	        return renderer;
	    }
	
}
