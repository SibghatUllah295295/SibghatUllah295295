public class PersonalLoan extends Loan{
PersonalLoan(int loanNumber, String lastName, long amountOfLoan, int term){
super(loanNumber, lastName, amountOfLoan, term);
Loan.interestRate= 2;
}
//End
}