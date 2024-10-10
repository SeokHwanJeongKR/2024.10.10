package compare.vo;

public class MemberV2 {
    //값만 가지고 값만 전달
    private int memberId;
    private String memberName;
    private String email;

    public MemberV2(int memberId, String memberName, String email) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public boolean equals(Object o) {
//        MemberV2 target = (MemberV2) o;
//        if (this.email.equals(target.getEmail()) && this.memberId == target.getMemberId() && this.memberName.equals(target.getMemberName()) ) {
//            return true;
//        }
//    } return;
}

