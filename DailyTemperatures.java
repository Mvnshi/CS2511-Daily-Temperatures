// Munshi Abrar
// CS2511 Chapter 9 Lab

import java.util.Scanner;

public class DailyTemperatures
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner( System.in );

		// 1) Declaring a Two Dimensional Array & Array with Week Names
		double [][] temperatures;
		String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

		// 2) Allocating Storage (Instantiate)
		temperatures = new double[4][7];

		// 3) Populate the array
		for ( int i = 0; i < temperatures.length; i++ )
		{
		for ( int j = 0; j < temperatures[0].length; j++ )
			{
				System.out.print( "Enter " + days[j] +  " Temperature for Week " + ( i + 1 ) + ":\t" );
				temperatures[i][j] = scan.nextDouble( ); // read current temp
			}
		}

		System.out.println( );
		System.out.println("	Weekly Temperature Report	");
		System.out.println( );

		// Print shortened day names
		System.out.print("\t");
		for ( int i = 0; i < days.length; i++ )
		{
			System.out.print(days[i].substring(0, 3) + "\t");
		}
		System.out.println("Average");

		// Output the array with averages
		double total; // new
		double wAverage; // variable for weekly average
		double[] dAverages = new double[7]; // variable for day average
		double totalWeeklyAverages = 0;  // new

		for ( int i = 0; i < temperatures.length; i++ )
		{
			total = 0; // set 0
			wAverage = 0; // set 0
			System.out.print("\n" + (i + 1) + "\t"); // Prints week number
			for ( int j = 0; j < temperatures[0].length; j++ )
			{
				System.out.printf("%.1f\t", temperatures[i][j]);
				total += temperatures[i][j];
				wAverage= total / 7;
				dAverages[j] += temperatures[i][j]; // Accumulates the total temperatures for each day of the week
			}
			System.out.printf("%.1f", wAverage); // Prints the accumulated average of that particular week
			totalWeeklyAverages += wAverage; // Adds up the weekly averages
			System.out.println();
		}

		System.out.println( );
		System.out.println("--------------------------------------------------------------------");
		System.out.println( );

		// Calculate and output the average temperature for each day of the week
		System.out.print("\t");
		for (int j = 0; j < dAverages.length; j++)
		{
			dAverages[j] /= temperatures.length;
			System.out.printf("%.1f\t", dAverages[j]);
		}

		// Calculate and output the average of all weekly averages
		double averageOfAllWeeklyAverages = totalWeeklyAverages / temperatures.length;
		System.out.printf("%.1f", averageOfAllWeeklyAverages);
		System.out.println();

	}
}
