package Functions;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.plaf.synth.SynthComboBoxUI;

import com.sun.java.swing.plaf.windows.WindowsComboBoxUI;


/**
 * http://henry406.iteye.com/blog/607562
 * 加上原先的Nimbus(Synth)ComboBoxUI
 * 显示长项目ComboBox
 */

public class LargerComboBoxUI extends SynthComboBoxUI {  

    protected ComboPopup createPopup() {  
        return new LargerComboPopup(comboBox);  
    }  
  
    @SuppressWarnings("deprecation")
	public class LargerComboPopup extends BasicComboPopup {  
        public LargerComboPopup(JComboBox comboBox) {  
            super(comboBox);  
        }  
  
        public void show() {  
            int selectedIndex = comboBox.getSelectedIndex();  
            if (selectedIndex == -1) {  
                list.clearSelection();  
            } else {  
                list.setSelectedIndex(selectedIndex);  
                list.ensureIndexIsVisible(selectedIndex);  
            }  
  
            Insets insets = getInsets();  
            Dimension listDim = list.getPreferredSize();  
            boolean hasScrollBar = scroller.getViewport().getViewSize().height != listDim.height;  
            if (hasScrollBar) {  
                JScrollBar scrollBar = scroller.getVerticalScrollBar();  
                listDim.width += scrollBar.getPreferredSize().getWidth();  
            }  
  
            int width = Math.max(listDim.width, comboBox.getWidth() - (insets.right + insets.left));  
            int height = getPopupHeightForRowCount(comboBox.getMaximumRowCount());  
            Rectangle popupBounds = computePopupBounds(0, comboBox.getHeight(), width, height);  
  
            Dimension scrollSize = popupBounds.getSize();  
            scroller.setMaximumSize(scrollSize);  
            scroller.setPreferredSize(scrollSize);  
            scroller.setMinimumSize(scrollSize);  
  
            list.revalidate();  
            show(comboBox, popupBounds.x, popupBounds.y);  
        }  
    }  
}  
