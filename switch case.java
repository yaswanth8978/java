import java.io.*;
import java.util.*;
class Switch
{
   public static void main(String args[])
{

int n, x, units, price;
Scanner s= new Scanner(System.in);
System.out.println("enter the choice(1-2)");
x = s.nextInt();
switch(x){

case 1:
System.out.println("domestic");
System.out.println("enter your units :");
units = s.nextInt();
if(units<40)
System.out.println("the price is :"+20);
else if(units>30 && units<39)
System.out.println("the price is :"+30);
else if(units>20 && units<29)
System.out.println("the price is :"+40);
else
System.out.println("the price is :"+20);
break;

case 2:
System.out.println("industrial");
System.out.println("enter your units :");
units = s.nextInt();
if(units<40)
System.out.println("the price is :"+20);
else if(units>30 && units<39)
System.out.println("the price is :"+30);
else if(units>20 && units<29)
System.out.println("the price is :"+40);
else
System.out.println("the price is :"+20);
break;
default:
System.out.println("invalid");
}
}
}
