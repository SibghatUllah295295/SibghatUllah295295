import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Member {
    Scanner input = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //Data Members
    public int memberId;
    public String name;
    public String contactInfo;
    public String rDate;

    public ArrayList<Integer> idList = new ArrayList<>();
    public ArrayList<String> nameList = new ArrayList<>();
    public ArrayList<String> contactList = new ArrayList<>();
    public ArrayList<String> rDateList = new ArrayList<>();

    //Constructor
    Member(){
    }
//Methods    
public void registerMember(int id, String name, String contact, String date){
idList.add(id);
nameList.add(name);
contactList.add(contact);
rDateList.add(date);
System.out.println("Member is added Completely");
}

public void removeMember(Integer id){
for(int i = 0 ;i<1 ; i++){
    for(int j = 0 ; j<idList.size() ; j++){
        if(id.equals(idList.get(j))){
            idList.remove(j);
            nameList.remove(j);
            contactList.remove(j);
            rDateList.remove(j);
            System.out.println("Member is removed Completely");
            break;
        }
    }
}
}
public void updateMemberInfo(Integer id){
    int check = 0;
    for(int i = 0 ; i<1 ; i++){
        for(int j = 0 ; j<idList.size() ; j++){
            if(id.equals(idList.get(j))){
                System.out.print("Enter the new Id of the member: ");
                int id2 = input.nextInt();
                System.out.print("Enter the new Name of the member: ");
                String name = ""; 
                try{
                    name = reader.readLine();
                 }
                 catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("Enter the Contact Information of member: ");
                String contact = "";
                try{
                    contact = reader.readLine();
                 }
                 catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("Enter Registration Date: ");
                String date = "";
                try{
                    date = reader.readLine();
                 }
                 catch (IOException e) {
                    e.printStackTrace();
                }
                idList.add(id2);
                nameList.add(name);
                contactList.add(contact);
                rDateList.add(date);
                check = 1;                
            }
}
if(check == 1){
    System.out.println("Member is updated Completely");
}
else System.out.println("Member not Found!");
}
}
public void searchMember(Integer id){
    int check = 0;
    for(int i = 0 ; i<1 ; i++){
        for(int j = 0 ; j<idList.size() ; j++){
            if(id.equals(idList.get(j))){
                System.out.println("Id: "+idList.get(j));
                System.out.println("Name: "+nameList.get(j));
                System.out.println("Contact: "+contactList.get(j));
                System.out.println("Registration Date: "+rDateList.get(j));
                check = 1;
            }
        }
        if(check == 1){
            System.out.println("Member is Found");
        }
        else System.out.println("Member is not Found");
    }
}


















//Class End
}
