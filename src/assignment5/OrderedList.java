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
        //start at beginning of list
        IntNode1 node = head;
        IntNode1 temp = new IntNode1(num);
        //see if it is the first item
        if(node == null){
            head = temp;
        } else if(num < node.getNum()) {
            IntNode1 n = head;
            head = temp;
            head.setNext(n);
        } else {
            IntNode1 b = null;
            while (node != null&&num > node.getNum()) {
                    node = node.getNext();
        }
            temp.setNext(node);
            b.setNext(temp);
        }
        numItems++;
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
