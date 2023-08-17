package entities;

public class BussinesAccount extends Account { // com o extends a classe BA herdara todos os dados e comportamentos da classe Account 

	private Double LoanLimit;
	
	public BussinesAccount() {
		super();
		
	}

	public BussinesAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //Construtor da super classe Account
		LoanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return LoanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		LoanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= LoanLimit) {
			balance += amount - 10.0;
			}
		}
}
