import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String memberId;
    private final String name;
    private final int age;
    List<Member> members = new ArrayList<Member>();


    public Member(String memberId, String name, int age)
    {
        if(memberId == null || memberId.isBlank())
        {
            throw new IllegalArgumentException("memberId cannot be null or blank");
        }

        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("name cannot be null or blank");
        }

        if (age <= 0)
        {
            throw new IllegalArgumentException("age cannot be zero or negative");
        }

        this.memberId = memberId;
        this.name = name;
        this.age = age;
    }


    public String getMemberId () {return memberId;}
    public String getName(){return name;}
    public int getAge() {return age;}

    public void displayDetails()
    {
        System.out.println("Member ID: " + getMemberId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }


    public void addMember(Member member) {
        if (member == null) {
            throw new IllegalArgumentException("member cannot be null");
        }
        members.add(member);
    }
    public List<Member> dispalyAllMembers() {
        return new ArrayList<>(members);}

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }
    public boolean removeMember(String memberId) {

        Member member = findMemberById(memberId);
        if (member == null) {
            return false;
        }

        members.remove(member);
        return true;
    }


}