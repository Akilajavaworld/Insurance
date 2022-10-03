class Lalitha_Chennai
{
int offer=500; 
public Lalitha_Chennai()
{
System.out.println("Samy Photo Calendar"); 
}
public Lalitha_Chennai(int offer)
{
this();
//this.offer=offer;
System.out.println("Chennai Offer " + this.offer); 
}
//public static void main(String[] args)//my try
//{
//Lalitha_Chennai lc = new Lalitha_Chennai(2000); 

//}
public void Customer_handling()
{
System.out.println("CCP");
}
}


class Lalitha_Kumbakonam extends Lalitha_Chennai
{
int offer; 
public Lalitha_Kumbakonam(int offer)
{
this.offer = offer; 
System.out.println("KK Offer " + this.offer); 
}
public static void main(String[] args)
{
Lalitha_Kumbakonam lk = new Lalitha_Kumbakonam(2000); 
}
}


class Lalitha_Thiruvarur extends Lalitha_Chennai
{
int offer; 
public Lalitha_Thiruvarur(int offer)
{
super(offer);  // Explicit call of super class constructor
this.offer = offer; 
System.out.println("KK Offer " + this.offer); 
}
public static void main(String[] args)
{
Lalitha_Thiruvarur lt = new Lalitha_Thiruvarur(2000); 
lt.buy(); 
lt.Customer_handling();
Lalitha_Chennai lc = new Lalitha_Chennai();
lc.Customer_handling();
}
void buy()
{
System.out.println("KK --> "+ this.offer); 
System.out.println("LC --> "+ super.offer); 
}
public void Customer_handling()
{
System.out.println("Valet Parking");
}
}
