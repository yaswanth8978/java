class bonus
{
int sal;
double b;
bonus()
{
sal =0;
b=0.0f;
}
bonus(int x,float y)
{
sal = x;
b = y;
}
void display()
{
System.out.println("salary "+sal);
System.out.println("bonus"+b);
}
}

class para
{
public static void main(String args[])
{
bonus a=new bonus();
a.display();
bonus b=new bonus();
b.display();
}
}
