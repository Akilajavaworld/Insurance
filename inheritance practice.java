package akila.myhome;
public class Telephone1
{
public static void main(String[] args)
{
Telephone1 t1 = new Telephone1();
t1.make_call();
t1.receive_call();
}
public void make_call()
{
System.out.println("call to friends");
}
public void receive_call()
{
System.out.println("call from friends");
}
protected void project()
{
System.out.println("project");
}
}


package akila1.myhome1;
import akila.myhome.Telephone1;
class Cellphone1 extends Telephone1 
{
public static void main(String[] args)
{
Cellphone1 c1 = new Cellphone1();
Telephone1 t1 = new Telephone1();

t1.make_call();
t1.receive_call();
//c1.make_message();
c1.project();
c1.make_message();
}
void make_message()
{
System.out.println("sending message");
}
}
