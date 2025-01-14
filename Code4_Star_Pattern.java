package javatasks;

import java.util.Scanner;

public class Code4_Star_Pattern {

	public static void main(String[] args) {
		 //Star Pattern
		
		Scanner objscan=new Scanner (System.in);
		System.out.println("Enter a Number : ");
		int rows=objscan.nextInt();
		System.out.println("Output :");
		
		if(rows%2==0)
		{
			return;
		}
		
		for(int i=1;i<=rows;i++)
		{
			//Only for middle row
			if (i==(rows+1)/2)
			{
				System.out.println(" * ");
			}
			else
			{
				//Remaining rows
				System.out.println("* *");
			}
			System.out.println();
		}	

	}

}

/*
 * Output:
Enter a Number : 
5
Output :

* *

* *

 * 

* *

* *

*/
