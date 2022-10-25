import java.util.Scanner;
//importing scanner class
class InvoiceTest
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
Invoice in=new Invoice();
System.out.print("Enter part number :");
in.setnumber(sc.nextLine());
System.out.print("Enter part description :");
in.setdescription(sc.nextLine());
System.out.print("Enter no. of items purchased :");
in.setQuantity(sc.nextInt());
System.out.print("Enter price per item :");
in.setPriceperitem(sc.nextDouble());
System.out.print(" Item Details \n");
System.out.print("Part number :" + in.getnumber());
System.out.print("\nPart description :" + in.getdescription());
System.out.print("\nTotal Billing Amount :" + in.getInvoiceAmount());
}
}
