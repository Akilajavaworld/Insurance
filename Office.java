package tamilnadu.chennai; 

public class Office
{
void travel_allowance()
{
System.out.println("100 Rs Daily"); 

}
public void develop()
{
System.out.println("Development"); 
}
public void test()
{
System.out.println("Testing"); 
}
protected void do_project()
{
System.out.println("Project Strategies"); 
}
}


package tamilnadu.chennai; 
//javac -d . Employee.java
class Employee
{
public static void main(String[] args)
{
Office engineer = new Office(); 
engineer.develop(); 
engineer.test();
engineer.do_project();
}
}

package tamilnadu.madurai;
import tamilnadu.chennai.Office; 
//javac -d . Employee2.java
class Employee2 //extends Office
{
public static void main(String[] args)
{
//Employee2 engineer = new Employee2(); 
Office engineer = new Office();
engineer.develop(); 
engineer.test(); 
engineer.do_project();
}
}


package tamilnadu.dindigul; 
import tamilnadu.chennai.Office; 
class Branch extends Office
{

public static void main(String[] args)
{
Branch br = new Branch();
/* Office engineer = new Office();
engineer.test(); */
br.do_project();

}

}
