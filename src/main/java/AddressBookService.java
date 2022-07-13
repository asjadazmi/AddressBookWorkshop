import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookService {
    static List<Contacts> arrayContacts=new ArrayList<Contacts>();

    public static Contacts addContacts(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first name :");
        String first_name = sc.next();
        System.out.println("Please enter your last name :");
        String last_name = sc.next();
        System.out.println("Please enter your Address :");
        String Address = sc.next();
        System.out.println("Please enter your city :");
        String city = sc.next();
        System.out.println("Please enter your state :");
        String state = sc.next();
        System.out.println("please enter the zip");
        int zip=sc.nextInt();
        System.out.println("Please enter your phone number :");
        long phone_number = sc.nextLong();
        System.out.println("Please enter your email id :");
        String email = sc.next();
        Contacts contact=new Contacts(first_name,last_name,Address,city,state,zip,phone_number,email);
        return contact;
    }
    public static void addContact() {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many contact you want to add");
        int o=sc.nextInt();
        for(int i=0;i<o;i++) {
            arrayContacts.add(addContacts());
            System.out.println();
        }
    }
    public static  void toPrint(){
        for(Contacts contacts:arrayContacts){
            System.out.println(contacts);
        }
    }
}
