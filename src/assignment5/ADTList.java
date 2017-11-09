/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author fabed2976
 */
public class ADTList {
    
    //create instance variables
    private int[] list = new int[10];
    
    //number of items in the list
    private int numItems;
    
    //create constructor
    public ADTList(){
        numItems = 0;
    }
    
    public boolean isEmpty(){
        return numItems == 0;
    }
    
    public int size(){
        return numItems;
    }
    
    public void add(int index, int num){
        //adds the number to empty list
        if(numItems == 0 && index == 0){
            list[0] = num;
        } else if(indes )
        
    }
    
    
    
    
    
    
    
    
        
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
