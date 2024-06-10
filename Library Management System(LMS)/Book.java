import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Book{
//Data Members

public Scanner input = new Scanner(System.in);
public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
public String title;
public String author;
public String publisher;
public Integer year;
public Integer copies;

public ArrayList<Object> titleList = new ArrayList<>();
public ArrayList<Object> authorList = new ArrayList<>();
public ArrayList<Object> pList = new ArrayList<>();
public ArrayList<Object> yearList = new ArrayList<>();
public ArrayList<Object> copiesList = new ArrayList<>();

//Constructor
Book(){
}

// Methods

public void addBook(String title,String author,String publisher,Integer year,Integer copies){
System.out.println("*******************");
titleList.add(title);
authorList.add(author);
pList.add(publisher);
yearList.add(year);
copiesList.add(copies);
}

public void removeBook(String name){
int check = 0;
for(int i = 0 ; i<1 ; i++){
    
for(int j  = 0;j<titleList.size() ; j++){

if(name.equals(titleList.get(j))){
titleList.remove(j);
authorList.remove(j);
pList.remove(j);
yearList.remove(j);
copiesList.remove(j);
check = 1;
}

}
if(check == 1)System.out.println("Book is removed completely.");
else System.out.println("Book is not Found");
}

//methodeEnd
}

public void updateBookInfo(String name){
int check = 0;
for(int i = 0 ; i<1 ; i++){

for(int j  = 0;j<titleList.size() ; j++){

if(name.equals(titleList.get(j))){
System.out.print("Please update the title of the Book: ");
try{
this.title = reader.readLine();
}
catch(IOException e){
    e.printStackTrace();
}
System.out.print("Please update the author's name of the Book: ");
try{
    this.author = reader.readLine();
    }
    catch(IOException e){
        e.printStackTrace();
    }
System.out.print("Please update the publisher's name of the Book: ");
try{
    this.publisher = reader.readLine();
    }
    catch(IOException e){
        e.printStackTrace();
    }

System.out.print("Please update the Year of the Book: ");
this.year = input.nextInt();
System.out.print("Please update the number of  Copies you are  adding: ");

this.copies = input.nextInt();
titleList.set(j, title);
authorList.set(j, author);
pList.set(j, publisher);
yearList.set(j, year);
copiesList.set(j, copies);
check = 1;
}

}
if(check == 1)System.out.println("Book is updated completely.");
else System.out.println("Book is not Found");
}

//Method End
}

public void searchBook(String name){
int check = 0;

for(int i = 0 ; i<1 ; i++){
for(int j  = 0;j<titleList.size() ; j++){

if(name.equals(titleList.get(j))){
System.out.println("*********************");
System.out.println("Title of the Book: "+titleList.get(j) );
System.out.println("Author's name of the Book: " + authorList.get(j));
System.out.println("Publisher's name of the Book: " + pList.get(j));
System.out.println("Year of the Book: " + yearList.get(j));
System.out.println("Copies of the book: " + copiesList.get(j));
check = 1;
}

}
if(check != 1)System.out.println("Book is not Found.");
}
//Methode End
}






//End
}