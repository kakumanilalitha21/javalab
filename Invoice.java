import java.util.Scanner;
class Invoice
{
private String number;
private String description;
private int quantity;
private double priceperitem;
Invoice()
{
String number="";
String description="";
int quantity=0;
double priceperitem=0.0;
}
public String getnumber() 
{
return number;
}
public void setnumber(String number) 
{
this.number = number;
}
public String getdescription() 
{
return description;
}
public void setdescription(String description) 
{
this.description = description;
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
public double getPriceperitem()
{
return priceperitem;
}
public void setPriceperitem(double priceperitem) 
{
if(priceperitem<0)
{
priceperitem=0.0;
}
else
this.priceperitem = priceperitem;
}
double getInvoiceAmount()
{
return getQuantity()*getPriceperitem();
}
}
