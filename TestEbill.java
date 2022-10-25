import java.util.Scanner;
public class TestEbill
//class test electricity bill
{
	public static void main(String[] args) 
	{
		ElectricityBill eb=new ElectricityBill();
		eb.getDetails();
		eb.billamount();
		eb.printBillamount();
	}
}