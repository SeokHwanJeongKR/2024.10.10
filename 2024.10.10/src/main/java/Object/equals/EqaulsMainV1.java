package Object.equals;

public class EqaulsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id - 100");
        UserV1 user2 = new UserV1("id - 100");

        System.out.println("Identity = " + (user1 == user2));
        System.out.println("Equality = " + (user1.equals(user2)));

    }
}
