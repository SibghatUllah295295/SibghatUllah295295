public class BusinessLoan extends Loan{
BusinessLoan(int loanNumber, String lastName, long amountOfLoan, int term){
super(loanNumber, lastName, amountOfLoan, term);
Loan.interestRate = 1;
}
//End
}