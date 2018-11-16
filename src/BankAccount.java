public class BankAccount {
	private static long generatedAccountNumber = 100000001L;
	private double balance;
	private long accountNumber;
	private int PIN;
	private AccountHolder holder;
	
	public BankAccount(double balance, long accountNumber, int PIN, AccountHolder holder) {
		this.balance = balance;
		this.accountNumber = BankAccount.generatedAccountNumber++;
		this.PIN = PIN;
		this.holder = holder;
	}
	
	public int deposit (double amount) {
		if (amount < 0) {
			return 0;
		} else {
			this.balance = balance + amount;
			return 1;
		}
	}
	
	public int withdraw (double amount) {
		if (this.balance == 0) {
			return -1;
		} else if (amount < 0) {
			return 1;
		} else if (amount > this.balance) {
			return 0;
		}  else {
			return 2;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public int getPIN() {
		return PIN;
	}
	
	public AccountHolder getAccountHolder() {
		return holder;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setPIN(int PIN) {
		this.PIN = PIN;
	}
	
	public void setAccountHolder(AccountHolder holder) {
		this.holder = holder;
	}
}
	