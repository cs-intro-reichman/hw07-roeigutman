/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		
      if ( s.length() == 1 ||  s.length() == 0) {
		return true;
	  }

         boolean n =  s.charAt(0) == s.charAt(s.length()-1);

		return n && isPalindrome(s.substring(1, s.length() -1));
    }
}