package Object.toString;

public class ToStringMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog("뽀삐", 10);
        //1. 단순 toString 호출
        System.out.println(dog.toString());

        //2. println 내부에서 to String 호출
        System.out.println(dog);

        //3. Object 다형성 활용
        ObjectPrinter.print(dog);
    }
}
