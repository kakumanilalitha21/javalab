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
	public SavingsAccount(double balance) 
	{
		sbal=balance;
		annintrate=0;
	}
	public void calculateMonthlyInterest()
	 {
		System.out.println("current balance:"+sbal);
		double mi;
		mi=(sbal*annintrate)/12;
		sbal=sbal+mi;
		System.out.println("new balance:"+sbal);
	}
	double getbalance() 
	{
		return sbal;
	}

	static void modifyInterestrate(double newinterest) 
	{
		annintrate=newinterest;
	}
}