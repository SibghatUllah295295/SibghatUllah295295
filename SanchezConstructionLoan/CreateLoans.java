import java.util.ArrayList;
import java.util.Scanner;
public class CreateLoans{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Please Enter Prime Interest Rate: ");
int interestRate = input.nextInt();
System.out.println("Which Type of Loan Did You Want: ");
System.out.println("Press 1 for Business Loan!");
System.out.println("Press 2 for Personal Loan!");
System.out.print("Please enter your concren: ");
int type = input.nextInt();
    BusinessLoan[] businessObj = new BusinessLoan[5];
    PersonalLoan[] personalObj = new PersonalLoan[5];
for(int i = 0 ; i<5 ; i++){
System.out.println("***********************");
System.out.print("Enter Loan Number: ");
int loanNumber = input.nextInt();
System.out.print("Enter Last Name: ");
String lastName = input.next();
System.out.print("Enter Amount Of Loan: ");
long amountOfLoan = input.nextLong();
if(amountOfLoan > 100_000){
    amountOfLoan = 0;
    System.out.println("Loan more than 100_000$ is not allowed");
    System.out.println("Press 1 to exit program");
    System.out.println("Press 2 to for taking Loan less than 100_000$");
    System.out.print("Enter Your Concern:" );
    int choice = input.nextInt();
    if(choice == 1){
        System.exit(0);
    }
    else{
        System.out.print("Enter Amount Of Loan (Less than 100_000$): ");
        amountOfLoan = input.nextInt();
        if(amountOfLoan > 100_000){
            System.out.println("You Are Not Allowed to Take Loan!!!!");
            System.exit(0);
        }
    }
    
    
}
System.out.print("Enter Term of the Loan: ");
int term = input.nextInt();
if(type == 1){
businessObj[i] = new BusinessLoan(loanNumber, lastName, amountOfLoan, term);
} 
else{
personalObj[i] = new PersonalLoan(loanNumber, lastName, amountOfLoan, term);
}
}
System.out.println("***********************");
if(type == 1) System.out.println("All Loan are of Business Type");
else System.out.println("All Loan are of Personal Type");
for(int i = 0 ; i<5 ; i++){
    System.out.println();
System.out.println("***********************");
if(type == 1){
System.out.print("Loan Number is: ");
System.out.println(businessObj[i].loanNumber);
System.out.print("Last Name is: ");
System.out.println(businessObj[i].lastName);
System.out.print("Amount Of Loan is: ");
System.out.println(businessObj[i].amountOfLoan + "$");

System.out.print("Loan With Fee: ");
long feeLoan = (businessObj[i].amountOfLoan * businessObj[i].interestRate) /100;
System.out.println(feeLoan + "$");

System.out.print("Term of the Loan is: ");
System.out.println(businessObj[i].term);
System.out.print("Interest Rate is: ");
System.out.println(businessObj[i].interestRate);
}
else{
System.out.print("Loan Number is: ");
System.out.println(personalObj[i].loanNumber);
System.out.print("Last Name is: ");
System.out.println(personalObj[i].lastName);
System.out.print("Amount Of Loan is: ");
System.out.println(personalObj[i].amountOfLoan+ "$");
System.out.print("Term of the Loan is: ");
System.out.println(personalObj[i].term);

System.out.print("Loan With Fee: ");
long feeLoan = (personalObj[i].amountOfLoan * personalObj[i].interestRate) /100;
System.out.println(feeLoan+ "$");

System.out.print("Interest Rate is: ");
System.out.println(personalObj[i].interestRate);
}
}
//SecondLast End
}
//End
}