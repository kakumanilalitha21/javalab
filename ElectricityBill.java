import java.util.Scanner;
class ElectricityBill
{
	Scanner ob=new Scanner(System.in);
	Scanner ob1=new Scanner(System.in);
	String consumernumber;
	String consumername;
	double previousmonthreading;
	double currentmonthreading;
	double amount;
	String typeofebc;
	ElectricityBill()
	{
		String consumernumber="";
		String consumername="";
		double previousmonthreading=0.0;
		double currentmonthreading=0.0;
		String typeofebc="";
	}
	void getDetails() 
	{
		System.out.println("enter consumer number:");
		consumernumber=ob1.next();
		System.out.println("enter consumer name:");
		consumername=ob1.next();
		System.out.println("enter previous month reading:");
		previousmonthreading=ob.nextDouble();
		System.out.println("enter current month reading:");
		currentmonthreading=ob.nextDouble();
		System.out.println("enter type:");
		typeofebc=ob1.next();
	}
	void billamount() 
	{
		double units;
		units=currentmonthreading-previousmonthreading;
		if(typeofebc=="domestic")
		{
			if(units<=100)
				amount=units*1;
			else if (units<=200)
				amount=100+(units-100)*2.50;
			else if(units<=500)
				amount=100+250+(units-200)*4;
			else
				amount=units*6;
		}

		else 
		{
			if(units<=100)
				amount=units*2;
			else if(units<=200)
				amount=200+(units-100)*4.50;
			else if(units<=500)
				amount=200+450+(units-200)*6;
			else
				amount=units*7;
		}
	 }
	void printBillamount() 
	{
		System.out.println("Consumer name:"+consumername);
		System.out.println("consumer number:"+consumernumber);
		if(typeofebc.equals("domestic"))
			System.out.println("typeofebc=domestic");
		else
			System.out.println("typeofebc=commercial");
		System.out.println("previous month reading"+previousmonthreading);
		System.out.println("current month reading:"+currentmonthreading);
		System.out.println("electricityBill:"+amount);
	}
}