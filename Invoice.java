import java.util.Scanner;
class Invoice
{
private String part_number;
private String part_description;
private int quantity;
private double price_item;
private double total=0;
Invoice()
{
String part_number="";
String part_description="";
int quantity=0;
double price_item=0.0;
}
public String getPart_number() 
{
return part_number;
}
public void setPart_number(String part_number) 
{
this.part_number = part_number;
}
public String getPart_description() 
{
return part_description;
}
public void setPart_description(String part_description) 
{
this.part_description = part_description;
}
public int getQuantity() 
{
return quantity;
}
public void setQuantity(int quantity)
{
if(quantity<0)
{
quantity=0;
}
else
this.quantity = quantity;
}
public double getPrice_item()
{
return price_item;
}
public void setPrice_item(double price_item) 
{
if(price_item<0)
{
price_item=0.0;
}
else
this.price_item = price_item;
}
double getInvoiceAmount()
{
totalprice();
return total;
}
void totalprice()
{
total=total+getQuantity()*getPrice_item();
}
}