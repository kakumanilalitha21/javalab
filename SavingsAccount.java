import java.util.Scanner;
class SavingsAccount
{
	private static double annintrate;
	private double sbal;
	public SavingsAccount() 
	{
		sbal=0; 
		annintrate=0;
	}
	public SavingsAccount(double bal) 
	{
		sbal=bal;
		annintrate=0;
	}
	public void MonthlyInterest()
	 {
		System.out.println("current balance:"+sbal);
		double monint;
		monint=(sbal*annintrate)/12;
		sbal=sbal+monint;
		System.out.println("new balance:"+sbal);
	}
	double getbalance() 
	{
		return sbal;
	}

	static void modifyInterestrate(double newint) 
	{
		annintrate=newint;
	}
}