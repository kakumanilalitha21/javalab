import java.util.Scanner;
class InvoiceTest
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
Invoice in=new Invoice();
System.out.print("Enter part number :");
in.setPart_number(sc.nextLine());
System.out.print("Enter part description :");
in.setPart_description(sc.nextLine());
System.out.print("Enter no. of items purchased :");
in.setQuantity(sc.nextInt());
System.out.print("Enter price per item :");
in.setPrice_item(sc.nextDouble());
System.out.print(" Item Details \n");
System.out.print("Part number :" + in.getPart_number());
System.out.print("\nPart description :" + in.getPart_description());
System.out.print("\nTotal Billing Amount :" + in.getInvoiceAmount());
}
}