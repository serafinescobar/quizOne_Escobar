//Serafin Escobar

package quarterBackrating;

import java.util.*;

public class qbratingMain 
{
	public static void main(String[]args)
	{
		double att; // # of passing attempts
		double comp; // # of completions 
		double yd; // passing yards
		double td; // Touch downs
		double intr; // Interceptions
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the stats");
		System.out.println("\nEnter the number of passing attempts: ");
		att = scan.nextDouble();
		System.out.println("Enter the number of completions: ");
		comp = scan.nextDouble();
		System.out.println("Enter the passing yards: ");
		yd = scan.nextDouble();
		System.out.println("Enter the amount of touch downs: ");
		td = scan.nextDouble();
		System.out.println("Enter the amount of interceptions");
		intr = scan.nextDouble();
			
		double stat = ratingCalc(aCalc(comp,att),bCalc(yd,att),cCalc(td,att),dCalc(intr,att));

		double answer = Math.round(stat*100.0)/100.0;


		System.out.println("The quaterBack rating is " + answer);
		
	}
	public static double aCalc(double i, double j)
	{
		return ((i/j) -.3) * 5;
	}
	public static double bCalc(double i, double j)
	{
		return ((i/j)-3)*.25;
	}
	public static double cCalc(double i, double j)
	{
		return (i/j)*20;
	}
	public static double dCalc(double i, double j)
	{
		return 2.375- ((i/j)*25);
	}
	
	public static double ratingCalc(double a, double b, double c, double d)
	{
		return (((a+b+c+d)/6)*100);	
	}
}