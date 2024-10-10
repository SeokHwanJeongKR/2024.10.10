package Object;

//부모가 없으면 묵시적으로 Object 클래스를 상속 받는다.
public class Parent extends Object {

    public static int a = 10;

    public void perentMethod() {
        System.out.println("Parent percent method");
    }

    public static void perentMethod2() {
        System.out.println("Parent percent method2");
    }
}
