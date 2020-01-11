/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soduku;

import java.util.ArrayList;

/**
 *
 * @author Riley McCarthy
 */
public class Cell {
    private ArrayList<Integer> options;
    private boolean original = false;
    private int value = 0;
    
    public Cell() {
        options = new ArrayList<Integer>();
    }
    
    public void setOptions(ArrayList<Integer> theOptions) {
        options = theOptions;
    }
    
    public ArrayList<Integer> getOptions() {
        return options;
    }
    
    public void setOriginal(boolean theOriginal) {
        original = theOriginal;
    }
    
    public boolean isOriginal() {
        return original;
    }
    
    public void setValue(int theValue) {
        value = theValue;
    }
    
    public int getValue() {
        return value;
    }
}