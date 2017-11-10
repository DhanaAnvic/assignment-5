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
    private int[] list;
    
    //number of items in the list
    private int numItems;
    
    //create constructor
    public ADTList(){
        list = new int [10];
        numItems = 0;
    }
    
 /**
  * Adding the number to the specifies position
  * @param index the position to add the number
  * @param num the number to add to the list
  */
    
    public void add(int index, int num){
        //adds the number to empty list
        if(numItems == 0 && index == 0){
            list[0] = num;
            //increase the list size
            numItems++;
            //adding the number
        } else if(index <= numItems){
            //shuflle the contents forward you reach the index
            for(int i = numItems; i > index; i--){
                list[i] = list[i - 1];
            }
            //add the number
            list[index] = num;
            //increase the list size
            numItems++;
        }
        //double the array size
        if(numItems == list.length){
            //create a new array set
            int[] temp = new int [list.length * 2];
            //copy the old content of the roigianl to the new array
            for(int i = 0; i < list.length; i--){
                temp[i] = list[i];
            
        }
            //points towards the new array
            list = temp;
        }
    }
    /**
     * Removes a number from the array
     * @param index the position of the number to remove
     */
    public void remove (int index){
        //check if you can remove it
        if(numItems > 0 && index < numItems){
            //shuffle the items backward until you reachh the index
            for(int i = index; i < numItems; i++){
                list[i] = list [i + 1];
            }
            //decrease the list size
            numItems--;
        }
    }
    
    /**
     * Getting the size of the list
     * @return size of the list
     */
    
     public int size(){
        return numItems;
    }
     
     /**
      * Asking if the array is empty
      * @return if the list is empty or not
      */
     public boolean isEmpty(){
         //the list is empty
       if(numItems == 0){
           return true;
           //the list is not empty
       } else {
           return false;
       }
    }
    /**
     * Getting the stored number in the array
     * @param index the position of the number to return
     * @return the number i the array at the index's position
     */
    public int get (int index){
        return list[index];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
