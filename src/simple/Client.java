package simple;

public class Client {
    public static void main (String[] args){
        Factory factory=new Factory();
        Fruit fruit=factory.createFruit("A");
        fruit.eat();
    }
}
