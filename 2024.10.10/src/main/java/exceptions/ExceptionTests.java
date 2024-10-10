package exceptions;

public class ExceptionTests {

    public static void main(String[] args) {
        //test1();
        try {
            test1();
            test2();
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception!");
        } catch (Exception e) {
            System.out.println("Exception!");
        } finally {
            System.out.println("무조건 실행!");
        }

        System.out.println("바깥");


    }

    static void test1() {
        active1();
        active2(); //실행이 안됨 try catch를 안해서

    } static void test2() {

        active3();
        // active4();

    }

    static void active1() {

        throw new RuntimeException("Unchecked Exception");

    }
    static void active2() throws RuntimeException {
        throw new RuntimeException();
    }

    static void active3() {
       // throw new Exception();
    }

    static void active4() throws Exception {
        throw new Exception("checked Exception");
    }

}
