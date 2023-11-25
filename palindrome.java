import java.io.*;
import java.util.*;
class pali
{
public static void main(String args[])
{
int n,rev,r,original;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
n=s.nextInt();
original=n;
rev = 0;
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
if(original == rev){
System.out.println("palindrome: " + rev);
}
else
{
System.out.println("not palindrome: "+rev);
}
}
}
