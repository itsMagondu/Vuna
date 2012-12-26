package TestPackage;

 /**
   * Have this class subclass MyTableModelBase, so we can create different tables with
   * different columns, but always use the same helper functions we created like clear, addrow, etc.
   *
   * This class creates an extra column before the text string that displays a checkbox to
   * the user.  It allows the user to select options in the table.  The data will be stored
   * in our data model as a boolean.
   *
   * @author EAL April 2001
   * @version 1.0.0
   */
public class TestTableModel extends MyTableModelBase {

   private final static String DEFAULTCOLS[] = new String[] {
          "", "Column 2" };
    /** the first column */          
   public static int COLUMN_1    = 0;
    /** the second column */
   public static int COLUMN_2    = 1;
   
    /** constructor */
   public TestTableModel() {
      super();
       // set the array in the base class
      cols = DEFAULTCOLS;
   }
    /**
      * Have the users add rows with just a string, and then we append the check box to it
      * @param s the string to display next to the checkbox
      */
   public void addRow( String s ) {
      super.addRow( new Object[] { new Boolean(false), s } );
   }
    /**
      * Must override this function.  This allows users to select the check in column 1 and
      * no other elements in the table
      * @param row the row to check if editable
      * @param col the column to check if editable
      * @return true/false whether we want the user to be able to modify that cell in
      *   the table
      */
   public boolean isCellEditable( int row, int col ) {
      if( col < 1 ) return true;
      else return false;
   }

    /**
      * Sets the value in our data model
      * We know to expect only boolean/checkbox values here
      * @param value the object to set
      * @param row the row number to set the data
      * @param col the column number to set the data
      */
   public void setValueAt(Object value, int row, int col) {
       // get the array for the proper row
      Object o[] = (Object[]) data.elementAt(row);
       // replace the boolean object that changed
      o[col] = value;
   }
}







