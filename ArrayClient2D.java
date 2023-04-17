// Munshi Abrar
// CS2511 Chapter 9 Lab

import java.util.Scanner;

public class ArrayClient2D
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner( System.in );

	// 1) Declaring a Two Dimensional Array
	float [][] cellBills;
	String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


	// 2) Allocating Storage (Instantiate)
	cellBills = new float[3][7];

	// 3) Populate the array
	for ( int i = 0; i < cellBills.length; i++ )
	{
		for ( int j = 0; j < cellBills[0].length; j++ )
		{
			System.out.print( "Enter " + days[j] +  " temperature for Week " + ( i + 1 ) + ":\t" );
			cellBills[i][j] = scan.nextFloat( ); // read current bill
		}
	}

	// 4) Output the array with average
	double total; // new
	double wAverage; // new
	double dAverage; // new

	for ( int i = 0; i < cellBills.length; i++ )
	{
		total = 0; // set 0
		wAverage = 0; // set 0
		for ( int j = 0; j < cellBills[0].length; j++ )
    	{
      		System.out.printf( "%9.2f  ", cellBills[i][j]);
			wAverage= (total += cellBills[i][j]) / 7;
    	}
		System.out.printf( "%9.2f  ", wAverage); // print the accumulated average of that particular row
	}

	System.out.println( );
	System.out.println( );

    // 5) Test countElements()
    double t = countElements(cellBills);
    System.out.println( "The total ammount of elements is " + t );
	System.out.println( );

	}

	// static method that counts the total # of elements
	public static int countElements(float[][] array )
	{
		int count = 0;
		for (int i = 0; i < array.length; i++)
		{
  	    count += array[i].length;
		}
			return count;
	}
}