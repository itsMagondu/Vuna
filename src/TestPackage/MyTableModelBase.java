package TestPackage;

import javax.swing.table.*;
import java.util.*;

 /**
   * MyTableModel adds my function above and beyond what the AbstractTableModel has.  Some
   * methods we need to override like getColumnClass() and others I added like clear().
   * @author EAL April 2001
   * @version 1.0.0
   */
public abstract class MyTableModelBase extends AbstractTableModel {
   
    /** vector to store the data in the columns */
   protected Vector data;
    /** col names - must be instansiated in constructor of class that extends this one */
   protected String[] cols;

    /** constructor */   
   public MyTableModelBase() {
      super();
      data = new Vector();
   }
   
    /**
      * Returns the type of object in the column
      * @param c the column
      * @return the type of class
      */
   public Class getColumnClass(int c) {
      return getValueAt(0,c).getClass();
   }
    /**
      * Returns the total number of rows
      * @return the # of rows
      */
   public int getRowCount() { return data.size();}
   
    /**
      * Clears all rows in the table
      */
   public void clear() {
      data.removeAllElements();
      fireTableDataChanged();
   }
    /**
      * Removes a row in the table
      * @param i the row number
      */
   public void removeRow( int i ) {
      data.removeElementAt(i);
      fireTableRowsDeleted(i,i);
   }
    /**
      * Returns the total number of columns in the table
      * @return the # of cols
      */
   public int getColumnCount() { return cols.length; }
    /**
      * Returns the column name for a given column
      * @param i the column
      * @return the name of that column
      */
   public String getColumnName(int i) { return cols[i]; }

    /**
      * Returns the object in the given coordinates
      * may be overridden by methods that extend this class
      * @param row the row number
      * @param col the column number
      * @return the object in that row/col
      */
   public Object getValueAt(int row, int col) {
      Object[] o = (Object[])data.elementAt(row);
      return o[col];
   }
   
    /**
      * Add a row to the table... if the entry is null, stick an empty string
      * in it's place, otherwise the table throws NullPointers
      * @param o an arrow of objects making 1 row of the table
      */
   public void addRow(Object o[]) {
      for( int i=0; i<o.length; i++ ) {
         if( o[i] == null ) {
            o[i] = new String();
         }
      }
      data.addElement(o);
       // entry added to the end, so fire an event to notify the table
       // to update itself
      fireTableRowsInserted(data.size()-1,data.size()-1);
   }   
}
