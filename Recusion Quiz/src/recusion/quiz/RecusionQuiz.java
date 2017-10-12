/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recusion.quiz;

/**
 *
 * @author slatz8075
 */
public class RecusionQuiz {

    public static String reverseString(String word) {
        //create a vaiable to define the word length
        int length = word.length();
        //while the length is greater than 1 keep modifiying the string
        if (length > 1) {
            //make the new word equal to the current last letter + the reverse of the reverse last letters found in the rest of the string (found in other recursive runs) 
            String newWord = word.charAt(word.length() - 1) + reverseString(word.substring(0, length - 1));
            //tell the user/upper-recusion level
            return newWord;
            //but if this if statement does not trgger still tell them
        } else {
            //tell the user/upper-recusion level
            return word;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tell the user the reverse string
        System.out.println("reverse string of frog: " + reverseString("frog"));
    }
}
