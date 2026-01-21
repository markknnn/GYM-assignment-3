package model;

public class Member extends Person {

    private String membershipType;

    public Member(int id, String name, int age, String membershipType) {
        super(id, name, age);
        setMembershipType(membershipType);
    }

    @Override
    public void work() {
        System.out.println("Member " + name + " is training.");
    }

    @Override
    public String getRole() {
        return "Member";
    }

    public void setMembershipType(String membershipType) {
        if (membershipType == null || membershipType.trim().isEmpty()) {
            throw new IllegalArgumentException("Membership type cannot be empty");
        }
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }
}
