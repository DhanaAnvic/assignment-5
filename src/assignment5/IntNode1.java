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
    
    public int getNum(){
        return item;
    }
    
    public IntNode1 getNext(){
        return next;
    }
    
     public void setNext(IntNode1 node){
        next = node; 
}
     
}


