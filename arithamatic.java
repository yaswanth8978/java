import java.io.*;
import java.util.*;
class arithamatic
{
 public static void main(String args[])
{
 int a,b,x,sum,mul,sub,div,mod;
 Scanner s = new Scanner(System.in);
 System.out.println("enter the value of a ");
 a = s.nextInt();
 System.out.println("enter the value of b ");
 b = s.nextInt();
 System.out.println("enter your choice(1-5)");
 x = s.nextInt();
 switch(x){

 case 1:
 sum = a+b;
 System.out.println("addition"+sum);
 break;
 case 2:
 sub = a-b;
 System.out.println("subtraction"+sub);
 break;
 case 3:
 mul = a*b;
 System.out.println("multplication"+mul);
 break;
 case 4:
 div = a/b;
 System.out.println("division"+div);
 break;
 case 5:
 mod = a%b;
 System.out.println("modulese"+mod);
 break;
 default:
 System.out.println("not in list");
}
}
 }
