package assignment5;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class IntNode1 {
    
    private int item;
    private IntNode1 next;
    
    //constructor
    public IntNode1(int num){
        item = num;
        next = null;
    }
    /**
     * Returns the number stored in the node
     * @return the stored number
     */
    public int getNum(){
        return item;
    }
    
    /**
     * Returns the node comes after
     * @return the next node
     */
    public IntNode1 getNext(){
        return next;
    }
    
    /**
     * Sets the node that comes after 
     * @param node the node to point to
     */
     public void setNext(IntNode1 node){
        next = node; 
}
     
}


