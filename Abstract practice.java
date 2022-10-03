abstract class Parent
{
public static void main(String[] args)
{
System.out.println("Hi"); 
}
void eat()
{
System.out.println("Eating"); 
}
void work()
{
System.out.println("Working "); 
}
abstract void study();  
}


abstract class Child extends Parent
{
public static void main(String[] args)
{
//Child ch = new Child(); 
//ch.eat(); 
//ch.work(); 
//ch.study();
}
//void study()
//{
//System.out.println(" Degree"); 
//}
//abstract void engineer();
abstract void study(); 
//void engineer()
//{
//System.out.println(" e.Degree"); 
//}
}


class Child_baby extends Child
{
public static void main(String[] args)
{
Child_baby ch1 = new Child_baby(); 
//ch1.eat(); 
//ch1.work(); 
//ch1.engineer();
ch1.study(); 
}
//void engineer()
//{
//System.out.println(" e.Degree"); 
//}
void study()
{
System.out.println(" Degree"); 
}
}
