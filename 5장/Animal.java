public class Animal {
    String name; // name 을 정의

    public void setName(String name) {
        this.name = name; // this 에 string 으로 들어간 객체의 이름이 들어감 (cat,dog)
    }
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("boby"); // boby 가 cat의 이름으로 들어 간다.
        
        Animal dog = new Animal();
        dog.setName("happy"); // setName 으로 인해 dog 의 이름이 happy 로 변경 된다.
        
        Animal horse = new Animal();
        horse.setName("nabi");

        Animal rabbit = new Animal();
        rabbit.setName("mija");

        System.out.println(cat.name);
        System.out.println(dog.name);
        System.out.println(horse.name);
        System.out.println(rabbit.name);
    }
}


// cat 은 하나의 객체 라고 하고 
// Animal 은 class 이다
// cat 은 Animal 의 인스턴스라고 표현 한다.
