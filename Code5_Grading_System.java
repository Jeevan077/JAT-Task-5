package javatasks;

import java.util.Scanner;

public class Code5_Grading_System {

	public static void main(String[] args) {
		Scanner myobj=new Scanner (System.in);
		System.out.println("Enter a mark :");
		//Using mark as an integer
		int mark =myobj.nextInt();
		System.out.println("Output :");
		//Printing Invalid Input
		
		if(mark>100)
		{
			System.out.println("Invalid Input");
		}
		else if(mark==100)
		{
			System.out.println("S");
		}else if(mark>=90)
		{
			System.out.println("A");
		}else if(mark>=80)
		{
			System.out.println("B");
		}else if(mark>=70)
		{
			System.out.println("C");
		}else if(mark>=60)
		{
			System.out.println("D");
		}else if(mark>=50)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("F");
		}

	}

}

/*
 * Output:
 * Enter a mark :
65
Output :
D
*/
