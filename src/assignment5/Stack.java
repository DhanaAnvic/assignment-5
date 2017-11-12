/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author fabed2976
 */
public class Stack {
    
    //create instance variables
    private char [] term;
    private int numItems;
    
    //create a constructor
    public Stack(){
        term = new char[1];
        numItems = 0;
    }
    
    /**
     * 
     * @param word
     * @return 
     */
    public boolean inLang(String word){
        //Go through each character in the string
        for(int i = 0; i < word.length(); i++){
            //check if there is space in the array to store in chracters
            if(numItems < term.length){
                //INsert the nre character at the specific location
                term[i] = word.charAt(i);
                numItems++;
                
            } else {
                //create a new array of term 
                char[] temp = new char[term.length + 1];
                //go through the new array 
                //move the new characters in their specific location
                for(int j = 0; j < term.length; j++){
                    temp[j] = term[j];
                    
                }
                //make the temporary array equal to the original array
                term = temp;
                term[i] = word.charAt(i);
                numItems++;
            }
        }
        
        //create an if statement if there is a dollar sign in the middle of the word
        if(term[(numItems - 1) / 2] == '$'){
            //go through the positions of the array
            for(int i = 0; i < term.length; i++){
                //check if the charcters on each side of the word closing in, doesn't equal to zero
                //then break the loop
                if(term[i] != term[(numItems - 1) - i]){
                    break;
                }
                //return true if the loop doesn't break
                return true;
            }
        }
        //Return false if the loop does break
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack test = new Stack();

        // String to test for proper format
        String word = "cat$tac";

        // outputs true if the String is in proper format
        System.out.println("In proper format: " + test.inLang(word));
    }
    }


