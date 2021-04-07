public class Dog extends Animal2 {
    public Dog() { // defalut 생성자
    } // 클래스 명과 메소드 명이 같고 리턴 값이 없기에 생성자라고 할 수 있다.
    // dafault 생성자를 안만들어도 자바에서 자동으로 추가된다. 
    // 하지만 사용자가 생성자를 하나라도 만들게 되면 자바에서는 더이상 자동으로 다른 생성자를 생성 하지 않는다.

    public void sleep() { // 기능을 추가
        System.out.println(this.name + " zzz");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}

// 자식클래스(Dog) extends 부모클래스(animal)
// 자식클래스는 부모 클래스에서 상속 받은 기능에 더하여 더 많은 기능을 갖도록 설계한다.
