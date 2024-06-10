import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Check{
public static Book book = new Book();
    public static void main(String[] args){

Scanner input = new Scanner(System.in);
Scanner intInput = new Scanner(System.in);
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

Member member = new Member();
BorrowTransaction issue = new BorrowTransaction();
System.out.println("***Library Management System***");
int again1 = 0;
int again2 = 0;
int again3 = 0;
do{
    again1 = 0;
System.out.println("Enter 1 Book Management");
System.out.println("Enter 2 Member's Management");
System.out.println("Enter 3 for Book Issuing & Transaction Management");
System.out.println("Enter 4 for Library Management");
System.out.print("*******************\nEnter your concern:");
int choice1 = input.nextInt();
int choice2 = 0;
if(choice1 == 1){
do{
    again2 = 0;
System.out.println("*******************");
System.out.println("*******************");
System.out.println("Enter 1 to Add Book");
System.out.println("Enter 2 to Remove Book");
System.out.println("Enter 3 to Update Book");
System.out.println("Enter 4 to Search Book");
System.out.println("");
System.out.println("*******************");
System.out.print("Please Enter your Concern: ");
choice2 = input.nextInt();
if(choice2 == 1){
do{
    again3  = 0;
System.out.print("Please enter the title of the Book: ");
String title = "";
try{
title = reader.readLine();
}catch (IOException e) {
    e.printStackTrace();
}
System.out.print("Please enter author's name of the Book: ");
String author = "";
try{
author = reader.readLine();
}catch (IOException e) {
    e.printStackTrace();
}
System.out.print("Please enter the publisher's name of the Book: ");
String publisher = "";
try{
publisher = reader.readLine();
}catch (IOException e) {
    e.printStackTrace();
}
System.out.print("Please enter the Year of the Book: ");
int year = intInput.nextInt();
System.out.print("Please tell me how many Copies are you adding: ");
int copies = intInput.nextInt();
book.addBook(title, author, publisher, year, copies);
System.out.println("Book is added completely.");
System.out.println("***********************");
System.out.print("Did you want to add more Books[1 for yes || 0 for no]: ");
again3 = intInput.nextInt();
}while(again3 == 1);
}
else if(choice2 == 2){
    do{
        again3 = 0;
    System.out.print("Enter the title of that book which you want to remove: ");
String name = "";
    try{
        name = reader.readLine();
}
catch(IOException e){
    e.printStackTrace();
}
book.removeBook(name);
System.out.print("Did you want to Remove more books[1 for yes || 0 for No]: ");
again3 = input.nextInt();
}while(again3 == 1);
}
else if(choice2 == 3){
    do{
        again3 = 0;
    System.out.print("Enter the title of that book which you want to update: ");
     String name = "";
     try{
         name = reader.readLine();}
         catch(IOException e){
             e.printStackTrace();
         }
         book.updateBookInfo(name);
         System.out.print("Did you want to Update more books[1 for yes || 0 for No]: ");
         again3 = input.nextInt();
        }while(again3 == 1);
}
else if(choice2 == 4){
    do{
        again3 = 0;
    System.out.print("Enter the title of that book which you want to search: ");
     String name = "";
     try{
         name = reader.readLine();}
         catch(IOException e){
             e.printStackTrace();
         }
         book.searchBook(name);
         System.out.print("Did you want to search more books[1 for yes || 0 for No]: ");
         again3 = input.nextInt();
        }while(again3 == 1);
}
System.out.println("***********************");
System.out.print("Did you want to perform other operations on Book management[1 for yes || 0 for no]: ");
again2 = intInput.nextInt();
}while(again2 == 1);
}
else if(choice1 == 2){
    do{
        again2 = 0;
    choice2  = 0;
    System.out.println("1 for register Member ");
    System.out.println("2 for remove Member");
    System.out.println("3 for Update Member Information");
    System.out.println("4 for Search Member");
    System.out.print("*******************\nEnter your concern:");
    choice2 = input.nextInt();
    if(choice2 == 1){
        do{
            again3 = 0;
        System.out.print("Enter Id of the Member: ");
        int id = input.nextInt();
        System.out.print("Enter name of the Member: ");
        String name = "";
        try{
            name = reader.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.print("Enter Contact Information: ");
        String contact = "";
        try{
            contact = reader.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.print("Enter Registration Date: ");
        String date = "";
        try{
            date = reader.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        member.registerMember(id, name, contact, date);
        System.out.println("***********************");
System.out.print("Did you want to Register more Members[1 for yes || 0 for no]: ");
again3 = intInput.nextInt();
        }while(again3 == 1);
    }
    else if(choice2 == 2){
        do{
            again3 = 0;
        System.out.print("Enter Id of the Member which you want to remove: ");
        int id = input.nextInt();
        member.removeMember(id);
        System.out.println("***********************");
        System.out.print("Did you want Remove more Members[1 for yes || 0 for no]: ");
        again3 = intInput.nextInt();
    }while(again3 == 1);
}
else if(choice2 == 3){
    do{
        again3 = 0;
    System.out.print("Enter Id of the Member which you want to Update: ");
    int id = input.nextInt();
    member.updateMemberInfo(id);
    System.out.println("***********************");
    System.out.print("Did you want Update more Members[1 for yes || 0 for no]: ");
    again3 = intInput.nextInt();
}while(again3 == 1);
}
else if(choice2 == 4){
    do{
        again3 = 0;
    System.out.print("Enter Id of the Member which you want to Search: ");
    int id = input.nextInt();
    member.searchMember(id);
    System.out.println("***********************");
    System.out.print("Did you want Search more Members[1 for yes || 0 for no]: ");
    again3 = intInput.nextInt();
}while(again3 == 1);
}
System.out.println("***********************");
System.out.print("Did you want to perform other operations on Book management[1 for yes || 0 for no]: ");
again2 = intInput.nextInt();
}while(again2 == 1);
}
else if(choice1 == 3){
    do{
again2 = 0;
choice2 = 0;
System.out.println("press 1 for Issue Book");
System.out.println("press 2 for Return Book");
System.out.println("press 3 for Calculate Late Fee");
System.out.println("*******************");
System.out.print("Enter Your Concern: ");
choice2 = input.nextInt();
if(choice2 == 1){
    do{
        again3 = 0;
    System.out.print("Enter Transaction Id: ");
    int id = input.nextInt();
    System.out.print("Enter Your name: ");
    String name = "";
    try{
        name = reader.readLine();
    }catch(IOException e){
        e.printStackTrace();
    }
    System.out.print("Enter Book Title: ");
    String bookTitle = "";
    try{
        bookTitle = reader.readLine();
    }
    catch(IOException e){
        e.printStackTrace();
    }
    System.out.print("Enter Issue || Borrow Date: ");
    String borrowDate = "";
    try{
        borrowDate = reader.readLine();
    }
    catch(IOException e){
        e.printStackTrace();
    }
    System.out.print("Enter Due Date: ");
    String dueDate = "";
    try{
        dueDate = reader.readLine();
    }
    catch(IOException e){
        e.printStackTrace();
    }
    issue.issueBook(id, name, bookTitle, borrowDate, dueDate);
    System.out.println("***********************");
    System.out.print("Did you want Issue more Books[1 for yes || 0 for no]: ");
    again3 = intInput.nextInt();
}while(again3 == 1);
}
else if(choice2 == 2){
    do{
        again3 = 0;
    System.out.print("Enter Transaction Id: ");
    int id = input.nextInt();
    System.out.print("Enter Your name: ");
    String name = "";
    try{
        name = reader.readLine();
    }catch(IOException e){
        e.printStackTrace();
    }
    System.out.print("Enter Book Title: ");
    String bookTitle = "";
    try{
        bookTitle = reader.readLine();
    }
    catch(IOException e){
        e.printStackTrace();
    }
    
    System.out.print("Enter Return Date: ");
    String returnDate = "";
    try{
        returnDate = reader.readLine();
    }
    catch(IOException e){
        e.printStackTrace();
    }
    issue.returnBook(id, name, bookTitle, returnDate);
    System.out.println("***********************");
    System.out.print("Did you want to Return more Members[1 for yes || 0 for no]: ");
    again3 = intInput.nextInt();
}while(again3 == 1);
}
else if(choice2 == 3){
    do{
        again3 = 0;
    System.out.print("Please enter the Transaction Id whose Fee you want to Find: ");
    Integer id = input.nextInt();
    issue.calculateLateFee(id);
    System.out.println("***********************");
    System.out.print("Did you want to Calculate Late Fees for more Books[1 for yes || 0 for no]: ");
    again3 = intInput.nextInt();
}while(again3 == 1);
    
}
System.out.println("***********************");
System.out.print("Did you want to perform other operations on Book Issuing & Transactions Management[1 for yes || 0 for no]: ");
again2 = intInput.nextInt();
}while(again2 == 1);
}
System.out.println("***********************");
System.out.print("Did you want to move into another management System[1 for yes || 0 for no]: ");
again1 = intInput.nextInt();
}while(again1 == 1);
//SecondLast End
}
//End
}