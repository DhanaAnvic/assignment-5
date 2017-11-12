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
    public OrderedList() {
        head = null;
        numItems = 0;
    }
    
/**
 * Adds the number in the list
 * @param num the number you will add in the list
 */
    public void add(int num) {
        //start at beginning of list
        IntNode1 node = head;
        IntNode1 prev = null;
        IntNode1 temp = new IntNode1(num);

            //looking for the spot of the node
            while (node != null && num > node.getNum()) {
                prev = temp;
                temp = temp.getNext();
            }
            //check if it is the start of the list
            if(prev == null){
                node.setNext(temp);
                head = node;
                
             //link the node with temp
             //link the n with node
        } else {
                node.setNext(temp);
                prev.setNext(node);
            }
            
        //Increase the size counter
        numItems++;
    }
    
    /**
     * Removing the number in the list
     * @param num the number you will remove from the list
     */
     public void remove(int num) {
        IntNode1 node = head;
        //scan through the list
        for (int i = 0; i < numItems; i++) {
            //if found the number
            if (node.getNum() == num && i != 0) {
                node = head;

                //move back to the previous spot
                for (int j = 0; j < i - 1; j++) {
                    node = node.getNext();
                }

                //to remove the node
                IntNode1 remove = node.getNext();
                //move to its next node
                IntNode1 next = remove.getNext();
                //move the number down
                node.setNext(next);
                //remove the number at the spot
                remove.setNext(null);

                numItems--;
                break;
                
                //checkif it removes from the start
            }else if(node.getNum() == num){
                head = head.getNext();
                
                numItems++;
                break;
                
            } else {
                //set the new temp node to the next item in the list
                node = node.getNext();
            }
            
        }
     }
     
/**
 * The size of the list
 * @return the number of items in the list
 */
    public int size() {
        return numItems;
    }
   
    /**
     * Checking if the list is empty
     * @return true if it is empty and return false if it is still not empty
     */

        public boolean isEmpty() {
        return numItems == 0;
    }
 
        /**
         * Gets the number in the list
         * @param index of the list
         * @return the number at that position in the list
         */
    public int get(int index) {
        IntNode1 node = head;
        //move the number of times
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }

        /**
         * @param args the command line arguments
         */
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        list.add(2);
        list.add(-5);
        list.remove(1);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));


    }
    }
}
   

