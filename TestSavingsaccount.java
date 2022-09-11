class TestSavingsaccount
{
	public static void main(String args[]) 
	{
		SavingsAccount ob1=new SavingsAccount(2000);
		SavingsAccount ob2=new SavingsAccount(3000);
		ob1.modifyInterestrate(0.04);
		ob1.calculateMonthlyInterest();
		ob2.modifyInterestrate(0.04);
		ob2.calculateMonthlyInterest();
		System.out.println("after changing interest rate from 4% to 5%");
		ob1.modifyInterestrate(0.05);
		ob2.calculateMonthlyInterest();
		ob1.modifyInterestrate(0.05);
		ob2.calculateMonthlyInterest();
	}
}