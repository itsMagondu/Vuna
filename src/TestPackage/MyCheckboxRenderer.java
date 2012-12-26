package TestPackage;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

 /**
   * This class handles painting checkbox classes.  It also paints every other line
   * of the table a slightly darker offset of the base color, which for white gives
   * a nice white and gray effect.
   *
   * Place it on a panel so we can control alignment
   *
   * NOTE: For some reason, in JDK 1.1.8 setBackground didn't work for checkbox....
   *       So the control should be placed on a JPanel
   * @author EAL April 2001
   * @version 1.0.0
   */
public class MyCheckboxRenderer extends JCheckBox implements TableCellRenderer {
   
//   private JCheckBox jcb;  // uncomment for jdk1.1.8

    /**
      * Constructor
      */   
   public MyCheckboxRenderer() {
      super();
//      setLayout(new BorderLayout(0,0)); jdk 1.1.8
//      add(jcb=new JCheckBox(),BorderLayout.CENTER); jdk 1.1.8
//      jcb.setHorizontalAlignment(0); jdk 1.1.8
      setHorizontalAlignment(0);
   }
   
    /**
      * Override this method from the parent class.
      * Only paint the background if the row isn't selected
      * Paint every other row a color very similiar to the base color, just a little
      * darker
      * @param table the JTable component
      * @param value the cell content's object
      * @param isSelected boolean so we know if this is the currently selected row
      * @param hasFocus does this cell currently have focus?
      * @param row the row number
      * @param column the column number
      */
   public Component getTableCellRendererComponent(JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      if( !isSelected ) {
         Color c = table.getBackground();
         if( (row%2)==0 && c.getRed()>20 && c.getGreen()>20 && c.getBlue()>20 )
            this.setBackground(new Color(c.getRed()-20, c.getGreen()-20, c.getBlue()-20));
         else
            this.setBackground(c);
      }
//      jcb.setSelected(value!=null && ((Boolean)value).booleanValue()); jdk1.1.8
      setSelected(value!=null && ((Boolean)value).booleanValue());
      return this;
   }
}