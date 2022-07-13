import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        System.out.println("welcome to address book");
        Scanner sc=new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("press 1 for add multiple contacts \n 2 for to print the data");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    AddressBookService.addContact();
                    break;
                case 2:
                    AddressBookService.toPrint();

            }
        }
    }
}
