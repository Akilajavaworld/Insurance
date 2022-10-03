/*class Poorvika
{
int price, discount; 
Poorvika()
{
System.out.println("Juice"); 
}
Poorvika(int price)
{
this();
System.out.println("Calendar"); 
}
Poorvika(int price, int discount)
{
this(price);
this.model=model;
this.price = price; 
this.discount = discount; 
System.out.println("Gift Voucher"); 
}
public static void main(String[] args)
{
Poorvika nokia = new Poorvika(1000,0);
Poorvika apple = new Poorvika(100000, 10000);
Poorvika samsung = new Poorvika(5000, 500);  
System.out.println(samsung.discount); 
System.out.println(nokia.price); 
}
} */


class Poorvika
{
int price, discount; 
String model; 
Poorvika()
{
System.out.println("Juice"); 
}
Poorvika(String model, int price)
{
this(); 
this.model = model; 
this.price = price; 
System.out.println("Calendar "+ this.model); 
}
Poorvika(String model, int price, int discount)
{
this(model,price); // first statement 
this.model = model ; 
this.price = price; 
this.discount = discount; 
System.out.println("Gift Voucher for "+ this.model);
 

}
public static void main(String[] args)
{
Poorvika nokia = new Poorvika("Nokia 1100", 1000,0);
Poorvika apple = new Poorvika("Apple 14 Pro Max", 100000, 10000); 
Poorvika samsung = new Poorvika("S22 Ultra ", 5000, 500); 
System.out.println(samsung.discount); 
System.out.println(nokia.price); 

}
}

