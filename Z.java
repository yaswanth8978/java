class circle
{
static double pi=3.14;
float area(float radius)
{
float res=pi*radius*radius;
return res;
}
float area(int r)
{
float s= 2*pi*r;
return s;
}
}
class Z
{
public static void main(String args[])
{
circle C=new circle();
System.out.println(C.area(5.9f));
System.out.println(C.area(4));
}
}