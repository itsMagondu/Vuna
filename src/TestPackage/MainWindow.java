
package TestPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

 /**
   * Display a JTable and allow sorting on the columns
   * @author EAL April 2001
   * @version 1.0.0
   */
public class MainWindow extends JFrame {

    /** the JTable */
   private JTable tableView;
    /** menu item to add a row to the JTable */
   private MenuItem miAddRow;
    /** menu item to clear the JTable */
   private MenuItem miClear;
    /** menu item to exit */
   private MenuItem miExit;
    
    /*******************
     * if any arguments are passed in, there will be no sorting
     *******************/
	public static void main( String s[] ) {
	   MainWindow mw = new MainWindow();
	   mw.show();
   }

    /**
      * Constructor
      */   
   public MainWindow() {
      createControls();
      buildWindow();
      addListeners();
      addMenuBar();
      setSize(800,400);
      setLocation(10,10);
      setTitle("Test Window");
      addWindowListener(new w());
   }
   
    /**
      * Helper function, creates all the widgets to be used on this window
      */
   private final void createControls() {
       // Create the table
      TestTableModel ttm=new TestTableModel();
       // build the table
      tableView = new JTable(ttm);
       // set my own renderer
      MyTableRenderer mtr = new MyTableRenderer();
      tableView.setDefaultRenderer(Object.class, mtr);
      MyCheckboxRenderer mcr = new MyCheckboxRenderer();
      tableView.setDefaultRenderer(Boolean.class, mcr);
       // size the first column very small since it is just a checkbox
      TableColumn tc = tableView.getColumnModel().getColumn(0);
      tc.setPreferredWidth(20);
      tc.sizeWidthToFit();
      tc.setMaxWidth(20);
       // table properties      
      tableView.setShowVerticalLines(true);
      tableView.setShowHorizontalLines(false);
      tableView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       // exit, with shortcut key Ctrl+X
      miExit=new MenuItem("Exit", new MenuShortcut(KeyEvent.VK_X));
       // add row, with shortcut key Ctrl+A
      miAddRow=new MenuItem("Add Row", new MenuShortcut(KeyEvent.VK_A));
       // clear table, with shortcut key Ctrl+A
      miClear=new MenuItem("Clear", new MenuShortcut(KeyEvent.VK_C));
   }
   
    /**
      * Layout the controls in the window
      */
   private final void buildWindow() {
       // use a border layout
   	getContentPane().setLayout( new BorderLayout(3,3));
   	 // add the table to the center
   	getContentPane().add(new JScrollPane(tableView), BorderLayout.CENTER);
   }

    /** create and add the menu bar */
   private final void addMenuBar() {
      MenuBar mainMenu = new MenuBar();
      Menu m = new Menu("Sample");
         m.add(miAddRow);
         m.add(miClear);
         m.addSeparator();
         m.add(miExit);
      mainMenu.add(m);
      setMenuBar(mainMenu);
   }
   
    /**
      * Listen for the buttons and them menu items
      */
   private final void addListeners() {
      miAddRow.addActionListener(actionStuff);
      miClear.addActionListener(actionStuff);
      miExit.addActionListener(actionStuff);
   }

   class w extends WindowAdapter {
      public void windowClosing( WindowEvent we ) {
         System.exit(1);
      }
   }

    /**
      * Inner class to handle the action events.  In this case, we only have menu items.
      */   
   ActionListener actionStuff =  new ActionListener() {
      
      public void actionPerformed( ActionEvent ae ) {
         if(ae.getSource() == miAddRow) doAddRow();
         if(ae.getSource() == miClear) doClear();
         else if(ae.getSource() == miExit) doExit();
      }
      
       // clear the table
      private final void doClear() {
         TestTableModel ttm = (TestTableModel)tableView.getModel();
         ttm.clear();
      }
      
       // add a row to the table
      private final void doAddRow() {
         TestTableModel ttm = (TestTableModel)tableView.getModel();
          // get a RANDOM length, RANDOM word
         ttm.addRow( getRandomWord((int)Math.floor((Math.random()*10)+1)));
      }
   
       // end the program
      private final void doExit() {
         dispose();
         System.exit(1);
      }
      
      private final String getRandomWord(int length) {
         char s[] = new char[length];
         for( int i=0; i<length; i++ ) {
            s[i] = (char) ('A'+Math.floor(Math.random()*26));
         }
         return new String(s);
      }
   };
}
