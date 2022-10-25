class TestSavingsaccount
{
	public static void main(String args[]) 
	{
		SavingsAccount saver1=new SavingsAccount(2000);
		SavingsAccount saver2=new SavingsAccount(3000);
		saver1.modifyInterestrate(0.04);
		saver1.MonthlyInterest();
		saver2.modifyInterestrate(0.04);
		saver2.calculateMonthlyInterest();
		System.out.println("after changing interest rate from 4% to 5%");
		saver1.modifyInterestrate(0.05);
		saver2.MonthlyInterest();
		saver1.modifyInterestrate(0.05);
		saver2.MonthlyInterest();
	}
}