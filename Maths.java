class Maths
{
//int a=45;
//float b=50.8f;
//int result=a+b;
//System.out.println(a+b);
public static void main(String[] args)
{
Maths m = new Maths();
//int a+b = m.multiplication();

//int result = m.add();
m.multiplication(24.5f,50);
//System.out.println(result);
//m.add1(result);
m.subtract();
}
void multiplication(float a, int b)
{
System.out.println(a*b);
//return a+b;
}
void subtract()
{
int a=25;
float b=10.5f;
System.out.println(a-b);
}
//void add1()
//{
//System.out.println(result);
//}
}
