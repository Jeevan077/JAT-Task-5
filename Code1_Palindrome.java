package javatasks;

import java.util.Scanner;

public class Code1_Palindrome {

	
	    public static void main(String[] args) {
	        
	        Scanner objscan = new Scanner(System.in);

	        // Asking the user to enter a string
	        System.out.print("Enter a string: ");
	        String name = objscan.nextLine();

	        // Convert the string to lowercase to make the check case-insensitive
	        
	              name= name.toLowerCase();

	        // Using Boolean variable to check if it is palindrome or not
	            
	              boolean isPalindrome = true;

	        // Loop through the string from both ends
	              
	        for (int i = 0; i < name.length() / 2; i++) 
	        {
	            // Compare characters from start and end
	        	
	            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) 
	            {
	                isPalindrome = false; 
	                break; 
	            }
	        }
	        
	        if (isPalindrome)
	        {
	            System.out.println("The string is a palindrome.");
	        } 
	        else 
	        {
	            System.out.println("The string is not a palindrome.");
	        }
	    
	    }
}

/*
 * Output:
 * Enter a string: racecar
 * The string is a palindrome.
 */

	
