class Bank
{
final int interest_rate = 4; 
final int minimum_balance = 2000; 
// final-we cannot reassign any final variable
void deposit()
{
System.out.println("Deposit"); 
}

void withdraw()
{
System.out.println("Withdraw");
}
}


class Customer
{
public static void main(String[] args)
{
Bank indian_bank = new Bank(); 
indian_bank.deposit(); 
indian_bank.withdraw();
System.out.println(minimum_balance);
indian_bank.minimum_balance=500;
System.out.println(minimum_balance);
}
}

