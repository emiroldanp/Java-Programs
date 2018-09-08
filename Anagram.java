import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		char a;
		int b=0;

		System.out.println("We will see if your 2 words form an anagram");
		//a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

		System.out.println("Enter your first word");
		String word1 = in.next();

		System.out.println("Enter your second word");
		String word2 = in.next();  
		
			if(word1.length() != word2.length())
			 {
  				 System.out.println("Not an anagram");
			  }
			
			else {

   			for(int i = 0; i < word1.length(); i++) 
   			{
      		a = word1.charAt(i);
      		/*found on internet that 
      		The java string charAt() method returns a char 
      		value at the given index number. The index number starts from 0. */
      		for(int j = 0; j < word2.length(); j++) {
        	if(a==word2.charAt(j)) {
            b++;
         } 
      }
      			
   }
   			if (b==0) {
      		System.out.println("Not an anagram");
  			}
  			else {
      		System.out.println("YES, they form an anagram!!!"); }
} 
}
}