/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author fabed2976
 */
public class OrderedList {
    
    //create instance variables
    private IntNode1 head;
    private int numItems;
    
    //create constructor
    public OrderedList(){
        head = null;
        numItems = 0;
    }
    
    public int size(){
        return numItems;
    }
    
     public boolean isEmpty(){
         //the list is empty
         if(numItems == 0){
             return true;
         } else {
             return false;
         }
     }
     
    
    public void add(int num){
        //adds the first number in the list
        if(numItems == 0){
            head = new IntNode1(num);
        } else {
            IntNode1 n = head;
            for(int i = 0; i < numItems; i++){
                if(num <= n.getNum()){
                    IntNode1 temp = new IntNode1(num);
                }
            }
        }
    }
        

    public int get (int index){
        IntNode1 node = head;
        //move the number of times
        for(int i = 0; i< index; i++){
            node = node.getNext();
        }
        return node.getNum();
    }
    
    public int remove(int num){
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
}
