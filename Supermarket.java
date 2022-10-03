class Supermarket
{
static String branch_name = "Akila Supermarket";
static int offer = 10; //declaration and initialization
int price;// variable declaration
//Supermarket product1; // object reference declaration
public static void main(String[] args)
{
Supermarket product1=new Supermarket();
Supermarket product2=new Supermarket();
Supermarket product3=new Supermarket();
product1.price=100;// initialization
product2.price = 120; 
product1.sell();//method calling statement
give_offer();// static method calling 
System.out.println(product1.price); 
System.out.println(product2.price);
// we can access static value using class name

//we can access static value using instance name 

//we can access static value directly in the same class
System.out.println(Supermarket.branch_name);
System.out.println(product1.branch_name);
System.out.println(name);
}
void sell()//method signature ,sell -method name,()-argument
{//method body-definition
System.out.println("product price is"+ price);
}
static void give_offer()
{
System.out.println("Offer % is"+ offer);
}
}
