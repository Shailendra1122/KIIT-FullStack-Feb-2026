package day24;

public class Father extends Thread
{
	HDFCBank bank;
	
	public Father(HDFCBank bank)
	{
		this.bank=bank;
	}
	@Override
	public void run() {
		
		try 
		{
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		bank.deposit(20000.0);
	}
}
