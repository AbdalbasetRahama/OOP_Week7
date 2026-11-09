
public class gymMember {
    private final String memberId;
    private final String name;
    private final int age;

    public gymMember(String memberId, String name, int age)
    {
        if(memberId == null || memberId.isBlank())
        {
            throw new IllegalArgumentException("memberId cannot be null or blank");
        }

        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("name cannot be null or blank");
        }

        if (age < 0)
        {
            throw new IllegalArgumentException("age cannot be negative");
        }

        this.memberId = memberId;
        this.name = name;
        this.age = age;
    }

        public String getMemberId () {return memberId;}
        public String getName(){return name;}
        public int getAge() {return age;}


}
