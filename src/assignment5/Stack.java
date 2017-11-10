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
    
    
    public boolean inLang(String word){
        Stack stack = new Stack ();
        String storeWord = new String();
        int storeLength = 1;
        
        if(word.length() % 2 == 1){
            for(int i = 0; i < word.length() ; i++){
                if(word.charAt(i) == '$'){
                    storeWord = word.substring(i + 1);
                    storeLength = storeWord.length();
                    break;
                } else {
                   IntNode1 temp = new IntNode1(word.charAt(i));
                   
                    
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
