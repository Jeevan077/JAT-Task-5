package javatasks;

import java.util.Scanner;

public class Code6_Hotel_Tariff {

	public static void main(String[] args) {
		Scanner myobj=new Scanner (System.in);
		System.out.print("Enter the number of the month (1-12) : ");
		int month=myobj.nextInt();
		System.out.print("Enter the Room rent per day : ");
		float Roomrent=(float) myobj.nextFloat();
		System.out.print("Enter Number of days stayed in the hotel : ");
		int days=myobj.nextInt();
		
		//Using boolean data type to determine if it is a peak season
		
		boolean isPeakSeason =false;
		
		//Using switch construct to determine if its a peak season
		
		switch (month)
		{
		case 4:  case 5:  case 6 : //April, May, June Month
		case 11: case 12: //November and December Month
			
			isPeakSeason =true;
			break;
			
			//If not peak season 
			
			default:
				isPeakSeason =false;
		}
		
		//Calculating Hotel tariff 
		
		float Hoteltariff = (float) Roomrent * days;
		isPeakSeason=true;
		{
			//Total tariff + Roomrent * 20%
			Hoteltariff += Roomrent * 0.2;  //If its a peakseason
		}
		//Printing the output with two decimal points
		System.out.printf("Total Tariff to be paid : %.2f%n  " , Hoteltariff);
		}

}

/*
 * Output:
 *Enter the number of the month (1-12) : 4
Enter the Room rent per day : 1200
Enter Number of days stayed in the hotel : 2
Total Tariff to be paid : 2640.00
*/
