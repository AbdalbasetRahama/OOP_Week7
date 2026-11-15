
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Members members = new Members();

        int choice = 0;
        while (choice != 5) {

            System.out.println("---Gym Membership Manager---");
            System.out.println("1. Add Member");
            System.out.println("2. Display All Member");
            System.out.println("3. Search by ID");
            System.out.println("4. Remove Member");
            System.out.println("5. Exit");

            Scanner menu = new Scanner(System.in);

            System.out.println("Enter choice: ");
            try {
                choice = Integer.parseInt(menu.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input" + e.getMessage());
            }
             if (choice == 1) {

                 Scanner member = new Scanner(System.in);

                 System.out.println("Enter a member ID: ");
                 String memberId = member.nextLine();

                 System.out.println("Enter name: ");
                 String name = member.nextLine();

                 System.out.println("Enter age: ");
                 int age = member.nextInt();

                 Member member1 = new Member(memberId, name, age);
                 members.addMember(member1);

                 System.out.println("Member added successfully");
             }

            else if (choice == 2) {
                 members.displayAllMembers();
             }

            else if (choice == 3) {
                 System.out.println("Enter member ID: ");
                 String memberId = menu.nextLine();

                 Member found = members.findMemberById(memberId);
                 if (found != null) {
                     found.displayDetails();
                 }
                 else {
                     System.out.println("Member not found");
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

        }
    }
}
