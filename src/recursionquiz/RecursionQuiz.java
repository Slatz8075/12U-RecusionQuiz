/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionquiz;

/**
 *
 * @author slatz8075
 */
public class RecursionQuiz {

    public String reverseString(String word) {
        //find the length of the word
        int length = word.length();
        //create a for loop that makes the last position of the original array equal to the first position of the new
        for (int position = 0; position != length; position++) {
            //add the last position to the new string
            String newstring = newstring + reverseString(word.charAt(length));
            //now move closer to the middle
            length--;
        }
        return newstring;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
