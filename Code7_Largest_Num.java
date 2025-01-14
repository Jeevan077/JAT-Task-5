package javatasks;

import java.util.Scanner;

public class Code7_Largest_Num {

	public static void main(String[] args) {
		// Calculate Largest numbers among 3 numbers
		
		Scanner myobj=new Scanner (System.in);
		System.out.print("Enter the number 1 : ");
		int num1=myobj.nextInt();
		System.out.print("Enter the number 2 : ");
		int num2=myobj.nextInt();
		System.out.print("Enter the number 3 : ");
		int num3=myobj.nextInt();
		
		// Calculation of largest numbers
		
		int Largestnum;
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("Number 1 is the Largest Number");
		}
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println("Number 2 is the Largest Number");
		}
		else
		{
			System.out.println("Number 3 is the Largest Number");
		}

	}

}

/*OUTPUT:
 * Enter the number 1 : 75
Enter the number 2 : 82
Enter the number 3 : 65
Number 2 is the Largest Number
*/
