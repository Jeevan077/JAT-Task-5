package javatasks;

import java.util.Scanner;

public class Code3_Printing_Pattern {

	public static void main(String[] args) {
		Scanner objscan=new Scanner (System.in);
		System.out.println("Enter a Number :");
		int rows =objscan.nextInt();
		
		int number =1;
		System.out.println("Output :");
		for(int i=1;i<=rows;i++)
		{
			//To Print numbers in each row
			for(int j=1;j<=i;j++)
			{
				System.out.print(number + " ");
				
				//Incrementing number by 1
				
				number++;
			}
			//Moves to  the next line after completing one row
			
			System.out.println();
		}

	}

}


/*
 * Output:
Enter a Number :
4
Output :
1 
2 3 
4 5 6 
7 8 9 10 

*/
