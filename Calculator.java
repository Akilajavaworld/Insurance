class Calculators
{
public static void main(String[] args)
{
Calculators calc = new Calculators();
long result = calc.add(); 
System.out.println(result);
calc.subtract(result, 5.25l);
}
void subtract(long no1, long no2)
{
System.out.println(no1-no2);
return; 
}
long add()
{
//return 5+10+25;
long no1 = 5.75l, no2 = 10, no3 = 25; 
return no1/no2+no3;
//System.out.println("Hi");
}

}
