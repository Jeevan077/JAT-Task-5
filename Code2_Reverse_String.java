package javatasks;

import java.util.Scanner;

public class Code2_Reverse_String {

	public static void main(String[] args) {
		Scanner objscan=new Scanner (System.in);
		System.out.println("Enter a string:");
		String name=objscan.next();
		//Using lower case to Reverse name in lower case
        name =name.toLowerCase();
		//Initialising empty string to store the reverse string
		
		String reversed = " ";
		
		//Using a loop to reverse the string
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reversed +=name.charAt(i);
		}
		
		System.out.println("Reversed String : " + reversed);
		

	}

}

/*
 * Output:
 * Enter a string:
Jeevan
Reversed String :  naveej
*/
