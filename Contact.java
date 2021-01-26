import java.util.ArrayList;
import java.util.*; 
public class Contact {
    String Firstname,Lastname,TeleNum;
    Telephone tel = new Telephone();

    public Contact(){

    }
    public Contact(String Firstname, String Lastname, String TeleNum){
        this.Firstname= Firstname;
        this.Lastname = Lastname;
        this.TeleNum = TeleNum;

    }
    public Contact(String Firstname, String Lastname, String TeleNum, Telephone tel){
        this.Firstname= Firstname;
        this.Lastname = Lastname;
        this.TeleNum = TeleNum;
        this.tel=tel;
    }

    public static void main(String[] args){

        Contactlist conlist = new Contactlist();
        Scanner sc = new Scanner(System.in);

        while(true){
            conlist.showMenu();
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            if(choice==1){
                conlist.addContact();
            }
            else if (choice==2){
                conlist.updateContact();
            }
            else if (choice==3){
                conlist.deleteUser();
            } 
            else if (choice==4){
                conlist.listContact();
            }
            else if (choice==5){
                break;
            }

        }
    }
}
class Telephone{
    String purpose;
    public Telephone(){

    }
    public Telephone(String purpose){
        this.purpose=purpose;
    }
}
class Contactlist{

    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> user = new ArrayList<Contact>();
    Contact contact = new Contact();
    

    public void showMenu(){
        System.out.println("\n1. Add more contact for the user");
        System.out.println("2. Update contact for the user");
        System.out.println("3. Delete contact for the user");
        System.out.println("4. List all contact");
        System.out.println("5. Exit the program");
    }

    public void addContact(){
        System.out.print("Enter your first name: ");
        contact.Firstname = sc.nextLine();
        System.out.print("Enter your last name: ");
        contact.Lastname = sc.nextLine();
        System.out.print("Enter your phone number: ");
        contact.TeleNum= sc.nextLine();
        
        Contact con = new Contact(contact.Firstname,contact.Lastname,contact.TeleNum);
        user.add(con);
    }
    public void updateContact(){
        System.out.print("Enter the user contact: ");
        String checkContact = sc.nextLine();
        Iterator<Contact> itr = user.iterator();
        while (itr.hasNext()){
            Contact c = itr.next();
            if(checkContact.equals(c.TeleNum)){
                System.out.print("Enter a new contact: ");
                String newContact = sc.nextLine();
                c.TeleNum= newContact;
            }
        }

    }
    public void deleteUser(){
        System.out.print("Enter user firstname: ");
        String firstname_remover = sc.nextLine();
        System.out.print("Enter user lastname: ");
        String lastname_remover = sc.nextLine();

       
        Iterator<Contact> itr = user.iterator();
        while (itr.hasNext()){
            Contact c = itr.next();
            if(firstname_remover.equals(c.Firstname) && lastname_remover.equals(c.Lastname)){
                itr.remove();
                System.out.println("The user has been deleted successfully");
            }
        }
    }

    public void listContact(){
        for(Contact arr:user){
            System.out.println("\n"+arr.Firstname+" "+arr.Lastname+ " " + arr.TeleNum);
        }
    }
}