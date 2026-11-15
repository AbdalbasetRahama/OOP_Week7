import java.util.ArrayList;
import java.util.List;

public class Members {
    List<Member> members = new ArrayList<Member>();

    public void addMember(Member member) {
        if (member == null) {
            throw new IllegalArgumentException("member cannot be null");
        }
        members.add(member);
    }
    public void displayAllMembers() {
        if (members.isEmpty()) {
            System.out.println("Member not found");
            return;
        }

            for (Member member : members) {
                member.displayDetails();
                System.out.println("--------------");
            }
        }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }

        }
        return null;
    }
    public void removeMember(String memberId) {

        Member member = findMemberById(memberId);
        if (member == null) {
            throw new IllegalArgumentException("member not found");
        }

        members.remove(member);
    }
}
