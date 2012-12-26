/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vunafeeds;

/**
 *
 * @author Nyatha Githinji
 */
public abstract class Tracker {

    private static int pointer;

    public static void incrementPointer(){
        pointer++;
    }

    public static int getPointer(){
        return pointer;
    }
    public static void decrementPointer(){
         pointer--;
    }
    public static void setPointertozero(){
         pointer=0;
    }
}
