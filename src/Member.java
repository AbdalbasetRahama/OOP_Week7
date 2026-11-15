
public class Member {
    private String memberId;
    private  String name;
    private  int age;



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

}