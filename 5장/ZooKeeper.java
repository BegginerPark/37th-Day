public class ZooKeeper {
    // public void feed(Tiger tiger) {
    //     System.out.println("feed apple");
    // }

    // public void feed(Lion lion) {
    //     System.out.println("feed banana");
    // }
    
    public void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
    // tiger, lion 은 각각 Tiger와 Lion 의 객체이기도 하지만 Predator 인터페이스의 객체이기도 하다.

        public static void main(String[] args) {
        ZooKeeper zookeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();

        zookeeper.feed(crocodile);
        zookeeper.feed(tiger);
        zookeeper.feed(lion);
    }
}
