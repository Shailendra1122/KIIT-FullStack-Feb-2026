package day24;

public class BankDriver {

	public static void main(String[] args) {
		HDFCBank bank=new HDFCBank(5000.0);
		
		Son thread1=new Son(bank);
		Father thread2=new Father(bank);
		
		thread1.start();
		thread2.start();
	}

}
