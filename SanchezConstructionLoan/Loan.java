public abstract  class Loan implements LoanConstants{
public int loanNumber;
public String lastName;
public long amountOfLoan;
public static long interestRate;
public int term;
Loan(int loanNumber, String lastName, long amountOfLoan, int term){
this.loanNumber = loanNumber;
this.lastName = lastName;
if(amountOfLoan <= 100_000) this.amountOfLoan = amountOfLoan;
else System.out.println("You are not Allowed to take loan more than 100_000$");
if(term != 1 && term != 2 && term != 3) this.term = shortTerm;
else this.term = term;
}
@Override
public String toString(){
return "Loan Number: " + this.loanNumber + "\nLastName: " + this.lastName + "\nAmount Of Loan: " + this.amountOfLoan + "\nInterest Rate: " + this.interestRate + 
"\nTerm: " + this.term; 
}
//End
}