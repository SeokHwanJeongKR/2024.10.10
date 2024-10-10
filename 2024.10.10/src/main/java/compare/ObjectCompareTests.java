package compare;

import compare.vo.MemberV1;

public class ObjectCompareTests {
//    public static void main(String[] args) {
//        test1();
//    }

    // 객체 값을 비교 1
    static void test3() {
        System.out.println("ObjectCompareTests1.test1");


        MemberV1 member1 = new MemberV1(1, "김민수", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "김민수", "admin@example.com");

        int member1Id = member1.getMemberId();
        int member2Id = member2.getMemberId();

        System.out.println("result1 = " + (member1Id == member2Id));

        String member1Name = member1.getMemberName();
        String newMemberName = new String("김민수");
        String newMemberName2 = "김민수";


        boolean result2 = member1Name == newMemberName;
        System.out.println("result2 = " + result2);
    }
    static void test2() {
        System.out.println("ObjectCompareTests1.test2");

    }


}
