public class MethodTest2 {

    int a; // 객체변수 a

    public void vartest(MethodTest2 test) { // return 값이 없을때 void 사용
        test.a++;
    }

    public static void main(String[] args) {
        MethodTest2 myTest = new MethodTest2();
        myTest.a = 1;
        myTest.vartest(myTest);
        System.out.println(myTest.a);
    }
}
