import java.util.Scanner;
 
public class Palindrome {

   public static void main(String args[]) {

      String word = "";
      String reverse = "";
      Scanner in = new Scanner(System.in);
      
      System.out.println("We will check if the word you type in is a palindrome");
     //a word, phrase, or sequence that reads the same backward as forward

      System.out.println("Type 1 word to check if it is a palindrome");
      word = in.nextLine();
 
      for ( int i = word.length()- 1; i >= 0; i-- ) {
         reverse = reverse + word.charAt(i);
      }
 
      if (word.equals(reverse)) {
         System.out.println("The word you typed in is a palindrome.");
      }
      else {
         System.out.println("The word you typed in is not a palindrome.");
      }
 
   }
}  