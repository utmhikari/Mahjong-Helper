package Tenhou;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import GUI.GUI;

@SuppressWarnings("serial")
public class MyKansenTableRenderer extends DefaultTableCellRenderer{
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
        	boolean exist = false;
        	StringBuffer id = new StringBuffer();
        	for(int r : TenhouKansen.KSExistList) {
        		id.append((String)GUI.getKansenTable().getModel().getValueAt(r, 4));
        		if(id.toString().equals(GUI.getMyKansenTable().getModel().getValueAt(
        				MyKansen.mysorter.convertRowIndexToModel(row), 1))) {
        			renderer.setBackground(Color.YELLOW);	  
        			exist = true;
        			id.delete(0, id.length());
        			break;
        		}
        		id.delete(0, id.length());
        	}
	        if(!exist) {
	        	renderer.setBackground(new Color(160,207,254,170));
	        }
        }
        else{
        	boolean exist = false;
        	StringBuffer id = new StringBuffer();
        	for(int r : TenhouKansen.KSExistList) {
        		id.append((String)GUI.getKansenTable().getModel().getValueAt(r, 4));
        		if(id.toString().equals(GUI.getMyKansenTable().getModel().getValueAt(
        				MyKansen.mysorter.convertRowIndexToModel(row), 1))) {
        			renderer.setBackground(new Color(56,247,9,125));	
        			exist = true;
        			id.delete(0, id.length());
        			break;
        		}     
        		id.delete(0, id.length());
        	}
	        if(!exist) {
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
