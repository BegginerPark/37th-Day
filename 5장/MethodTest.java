public class MethodTest {
    // 입력값과 출력값이 함께 있는 경우
    // public int sum(int a, int b) {
    //     return a+b; // 던져 받은 a 값과 b 값을 더해준다.
    // }

    // public static void main(String[] args) {
    //     int a = 3;
    //     int b = 4;

    //     MethodTest myTest = new MethodTest();
    //     int c = myTest.sum(a,b); // sum을 호출 하고 들어온 값을 return a+b 로 던져줌

    //     System.out.println(c); // 더해진 값인 c 를 출력
    // }

    // 입력값 없이 출력만 있는 경우
    // public String say() {
    //     return "hi";
    // }

    // public static void main(String[] args) {
    //     MethodTest myTest = new MethodTest();
    //     String a = myTest.say();
    //     System.out.println(a);
    // }

    // 입력은 있는데 출력이 없는 경우 ** Return 이 없으면 출력도 없다.
    // public void int sum(int a, int b) {
    //     System.out.println("sum of a and b is" + (a+b));
    // }
    // public static void main(String[] args) {
    //     MethodTest myTest = new MethodTest();
    //     int c = myTest.sum(3,4);
    //     System.out.println(c); 
    // }

    // return의 또 따른 쓰임새
    public void say_nick(String nick) {
        if ("fool".equals(nick)) {
            return;
        }
        System.out.println("my nick name is " + nick );
    }
}
