class Updater {   // update 클래스(메소드)
    // public void update(int count) { // 값을 전달 받았다
    //     count++; // count 를 하나씩 증가
    // }
    public void update(Counter counter) { // 객체를 전체를 전달 받았다
        counter.count++;
    }
}

public class Counter { // counter 클래스
    int count = 0; // count 변수 설정
    public static void main(String[] args) {
        Counter myCounter = new Counter(); // myCount 객체 설정
        System.out.println("before update:" + myCounter.count);
        Updater myUpdater = new Updater(); // myUpdater 객체 설정
        // myUpdater.update(myCounter.count); 
        myUpdater.update(myCounter);
        System.out.println("after update:" + myCounter.count);
    }
}

// 메소드에 값을 전달하는 것과 객체를 전달하는 거에는 큰 차이가 있다.
// 객체를 전달할 경우 메소드에서 객체의 객체변수(속성)값을 변경할 수 있게 된다.
// 메소드가 객체의 속성값을 변경하면 메소드 수행후 객체의 변경된 속성값이 유지되게 된다.
// 변수로 전달 -> 객체로 전달 (값을 유지할 수 있다.)