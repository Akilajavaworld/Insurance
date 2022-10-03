class GrandFather    
{    
public void showG()    
{    
System.out.println("He is grandfather.");    
}    
}

class Father extends GrandFather    
{    
public void showF()    
{    
System.out.println("He is father.");    
}    
} 

class Son extends Father    
{    
public void showS()    
{    
System.out.println("He is son.");    
}    
}

public class Daughter extends Father    
{    
public void showD()    
{    
System.out.println("She is daughter.");    
}    
public static void main(String args[])    
{    
//Daughter obj = new Daughter();    
//obj.show();    
Son obj = new Son();  
obj.showS();  // Accessing Son class method  
obj.showF();  // Accessing Father class method  
obj.showG();  // Accessing GrandFather class method  
Daughter obj2 = new Daughter();  
obj2.showD();  // Accessing Daughter class method  
obj2.showF();    // Accessing Father class method  
obj2.showG();   // Accessing GrandFather class method 
obj2.showS(); 
}    
}  


public class Daughter_Baby extends Daughter    
{    
public void showDB()    
{    
System.out.println("She is granddaughter.");    
}    
public static void main(String args[])   
{
Daughter_Baby db = new Daughter_Baby();
db.showDB();
Son obj = new Son();  
obj.showS();  // Accessing Son class method  
obj.showF();  // Accessing Father class method  
obj.showG();
}
}

