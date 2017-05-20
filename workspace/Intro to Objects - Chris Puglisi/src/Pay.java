
public class Pay {//new class
	public static double computeNetPay(){//open computenetpay
		
		payCalculator.payment = (payCalculator.hoursWorked * payCalculator.payPerHour)*0.8; //calculated with taxes,
		return payCalculator.payment;//returns to the other class the final payment
	}
}
