class Adder
    {  
    static int add(int a, int b)
    {
    return a+b;
    }  
    static double add(double a, double b)
    {
    return a+b;
    }  
    public static void main(String[] args)
    {  
    System.out.println(Adder.add(11,11.6));  
    System.out.println(Adder.add(12l,12.4));  
    }
    }
