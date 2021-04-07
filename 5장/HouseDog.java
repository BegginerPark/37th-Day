public class HouseDog extends Dog {
    public void sleep() { // 기능을 추가한다.
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour) { // 인수를 추가 
        System.out.println(this.name + " zzz in house for " + hour + "hours");
    }

    public void sleep(int hour, int min){
        System.out.println(this.name + " zzz in house for " + hour + "hours " + min + "min");
    }

    public HouseDog(String name) { // 생성자
        this.setName(name);
    }
    // 생성자의 규칙:   1. 클래스명과 메소드명이 동일해야 한다. 
    //                 2. 리턴타입을 정의하지 않는다. 

    public HouseDog(int type) { // 오버로딩
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    public static void main(String[] args) {
        // HouseDog housedog = new HouseDog();
        HouseDog dog = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(yorkshire.name);
    //     housedog.setName("happy");
    //     housedog.sleep(); // sleep() 메소드를 호출
    //     housedog.sleep(3); // sleep(int hour) 메소드 호출
    //     housedog.sleep(3,30);
    }
}

// Dog를 상속받았다.
// 상속 받은 sleep() 대신 기능을 추가한 sleep()을 사용한다.
// 상속 받은 동일한 형태의 기능보다 자식클래스에서 추가한 기능을 우선 한다.
// 이름은 같지만 인수가 들어간 형태와 인수가 없는 형태를 따로 구분이 가능하다.