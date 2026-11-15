import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { ;

        List<Member> members = new ArrayList<Member>();
        Scanner member1 = new Scanner(System.in);

        Scanner menu = new Scanner(System.in);

        System.out.println("---Gym Membership Manager---");
        System.out.println("1. Add Member");
        System.out.println("2. Display All Member");
        System.out.println("3. Search by ID");
        System.out.println("4. Remove Member");
        System.out.println("5. Exit");
        System.out.println("Enter choice: ");
        int choice = menu.nextInt();


        System.out.println("Enter a member ID: ");
        String memberId = member1.nextLine();

        System.out.println("Enter name: ");
        String name = member1.nextLine();

        System.out.println("Enter age: ");
        int age = member1.nextInt();

        for(Member member: members) {
            member.displayDetails();
        }

        if(choice == 1) {
            members.add(new Member(memberId, name, age));
            System.out.println("Member added successfully");
        }

        if(choice == 2) {
            System.out.println(members);
        }



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}