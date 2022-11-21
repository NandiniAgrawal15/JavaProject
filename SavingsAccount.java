
public class SavingsAccount extends Account {

	SavingsAccount(Customer u) {
		super(u);
		setMinBalance(500);
		setWithdrawalLimit(500, 20000);
		setBalance(500);
	}

	SavingsAccount(String an, String pin, double balance, Customer u) {
		this(u);
		super.setAccountNo(an);
		super.setPIN(pin);
		super.setBalance(balance);
	}

	void setMinBalance(double a) {
		minBalance = a;
	}

	void setWithdrawalLimit(double l, double h) {
		minWithdrawal = l;
		maxWithdrawal = h;
	}

	int getAccountType() {
		return Account.SAVINGS_ACCOUNT;
	}

}
