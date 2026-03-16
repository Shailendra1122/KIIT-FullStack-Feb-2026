package day24;

public class HDFCBank implements BankingService
{
	
	double balance;
	
	public HDFCBank(double balance)
	{
		this.balance=balance;
	}
	
	public synchronized void  withdraw(double withdrawAmount)
	{
		System.out.println("Trying to withdraw "+withdrawAmount);//Trying to withdraw 10000
		System.out.println("Balance "+ this.balance);			//5000
		
		if(withdrawAmount>this.balance)
		{
			System.out.println("Insufficient Funds");				//Insufficient Funds
			try 
			{
				wait();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.balance-=withdrawAmount;
		System.out.println("Withdrwal Successul ");				//Withdrwal Successul 
		System.out.println("Balance "+ this.balance);			//15,000
	}
	
	public synchronized void deposit(double depositAmount)
	{
		this.balance+=depositAmount;
		notify();
	}

}
