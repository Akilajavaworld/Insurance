package akila.myhome;
public class FirstClass {

    protected String name;

    protected FirstClass(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}


package akila1.myhome1;
import akila.myhome.FirstClass;
public class SecondClass extends FirstClass{
    
    public SecondClass(String name) {
        super(name);
        //System.out.println("SecondClass name is " + this.getName());
        //this.name = "new name";
    } 
public static void main(String[] args) {
   SecondClass sc = new SecondClass("random name");
    sc.name = "new name";
System.out.println("SecondClass name is " + this.getName());
}}
