package day24;

public class Son extends Thread {
	HDFCBank bank;

	public Son(HDFCBank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		bank.withdraw(10000.0);
	}
}
