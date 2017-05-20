/*
Chris Puglisi
mr. Boutanous
Feb 21
v1.0
*/
public class payCalculator {
	public static int hoursWorked = 20;//hours worked declared
	public static double payPerHour = 13.00; //hourly wage declared
	public static double taxRate = 0.2; //taxRate Declared
	public static double payment = 0.0; //payment declared

	public static void main(String[]args){//open main 
		Pay.computeNetPay();//calls the method from class Pay
		System.out.println("the final payment is $" + payment);//final printing
	}//end main 
}//end class
