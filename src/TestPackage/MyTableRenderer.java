package TestPackage;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**   * Our own Table Cell Renderer.  It handles painting Date classes the   * different colors in the table.  It also paints every other line of the table   * a slightly darker offset of the base color, which for white gives a nice   * white and gray effect.   * @author EAL April 2001   * @version 1.0.0   */
public class MyTableRenderer extends DefaultTableCellRenderer {

    /**      * Override this method from the parent class.      * Only paint the background if the row isn't selected      * Paint every other row a color very similiar to the base color, just a little      * darker      * @param table the JTable component      * @param value the cell content's object      * @param isSelected boolean so we know if this is the currently selected row      * @param hasFocus does this cell currently have focus?      * @param row the row number      * @param column the column number      */
    public Component getTableCellRendererComponent(JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (!isSelected) {
            Color c = table.getBackground();
            if ((row % 2) == 0 && c.getRed() > 20 && c.getGreen() > 20 && c.getBlue() > 20) {
                setBackground(new Color(c.getRed() - 20, c.getGreen() - 20, c.getBlue() - 20));
            } else {
                setBackground(c);
            }
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}