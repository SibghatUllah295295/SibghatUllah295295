import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;
public class BorrowTransaction extends Check{
    Scanner input = new Scanner(System.in);
    //DataMembers
    public int transactionId;
    public String member;
    public String book;
    public String borrowDate;
    public String dueDate;
    public String returnDate;
    public static final int lateFee = 10;

    public ArrayList<Integer> idList = new ArrayList<>();
    public ArrayList<String> memberList = new ArrayList<>();
    public ArrayList<String> bookList = new ArrayList<>();
    public ArrayList<String> borrowDateList = new ArrayList<>();
    public ArrayList<String> dueDateList = new ArrayList<>();
    public ArrayList<String> returnDateList = new ArrayList<>();
//Constructor
BorrowTransaction(){
}
//Methods
public void issueBook(Integer id,String name,String bookTitle,String borrowDate,String dueDate){
    int check = 0;
    
    for(int i = 0 ; i<1 ; i++){
        for(int j = 0 ; j<super.book.titleList.size(); j++){
            if(bookTitle.equals(super.book.titleList.get(j))){    
idList.add(id);
memberList.add(name);
bookList.add(bookTitle);
borrowDateList.add(borrowDate);
dueDateList.add(dueDate);
check = 1;
            }
        }
        if(check == 1) System.out.println("Book is Issued");
        else   System.out.println("Book is not Present in Library");
    }
}

public void returnBook(Integer id, String name, String bookTitle, String returnDate){
for(int i = 0 ; i<1 ; i++){
    for(int j = 0 ; j<idList.size(); j++){
        if(id.equals(idList.get(j))){
            returnDateList.add(returnDate);
            calculateLateFee(id);
            System.out.println("Thanks for Returning Book");
            break;
        }
    }
}
}
  public void calculateLateFee(Integer id) {
    if(idList.size() == 0) System.out.println("Any Book is not Issued Yet");
    for (int j = 0; j < idList.size(); j++) {
        if (id.equals(idList.get(j))) {
            LocalDate dueDate = LocalDate.parse(dueDateList.get(j));
            LocalDate returnDate = LocalDate.parse(returnDateList.get(j));

            long daysBetween = ChronoUnit.DAYS.between(dueDate, returnDate);

            int fee;
            if (daysBetween < 0) {
                fee = 0;
            } else {
                fee = (int) (daysBetween * lateFee);
            }
            System.out.println("The Fee is: " + fee + " $");
            break;
        }
        else System.out.println("The Book with given Transaction Id is not Issued yet");
        
    }
}









}
