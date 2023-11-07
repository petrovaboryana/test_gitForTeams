public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Hugo","Labrador",2,20.6);
        dog1.makeSound();
        System.out.println(dog1.toString());
        dog1.eat("meat");

        System.out.println(dog1.toString());
    }
}