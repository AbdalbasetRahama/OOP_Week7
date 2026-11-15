
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Members members = new Members();


        Scanner menu = new Scanner(System.in);

        int choice = 0;
        while (choice != 5) {

            System.out.println("---Gym Membership Manager---");
            System.out.println("1. Add Member");
            System.out.println("2. Display All Member");
            System.out.println("3. Search by ID");
            System.out.println("4. Remove Member");
            System.out.println("5. Exit");

            System.out.println("Enter choice: ");

            try {
                choice = Integer.parseInt(menu.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input" + e.getMessage());
            }
             if (choice == 1) {

                 Scanner member1 = new Scanner(System.in);

                 System.out.println("Enter a member ID: ");
                 String memberId = member1.nextLine();

                 System.out.println("Enter name: ");
                 String name = member1.nextLine();

                 System.out.println("Enter age: ");
                 int age = member1.nextInt();

                 Member member = new Member(memberId, name, age);
                 members.addMember(member);

                 System.out.println("Member added successfully");
             }

            else if (choice == 2) {
                 members.displayAllMembers();
             }

            else if (choice == 3) {
                 System.out.println("Enter member ID: ");
                 String memberId = menu.nextLine();

                 Member found = members.findMemberById(memberId);
                 if (found == null) {
                     System.out.println("Member not found");
                 }
                 else {
                 found.displayDetails();
                 }

             }

            else if (choice == 4) {
                 System.out.println("Enter a member ID to remove:  ");
                 String memberId = menu.nextLine();

                 try {
                     members.removeMember(memberId);
                     System.out.println("Member removed");
                 } catch (IllegalArgumentException e)
                 {
                     System.out.println(e.getMessage());

                 }
             }
            else if (choice == 5) {
                 System.out.println("Exit the menu");

            }

            else  {
                System.out.println("Invalid choice");
            }
        }
    }
}
