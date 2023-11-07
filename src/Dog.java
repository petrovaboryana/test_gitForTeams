public class Dog {
    public String name;
    public String breed;
    public int age;
    public double weight;
    public void makeSound(){
        System.out.println("Bau Bau");
    }
    public void eat(String food){
        this.weight += 0.50;
        System.out.println(this.name + " is eating " + food + " and his weight now is " + this.weight + " kg.");
    }

    public void walkOut(int time){
        this.weight -= (0.40 * time);
        System.out.println(this.name + " went for a walk for " + time + " hour and now his weight is " + this.weight + " kg.");
    }

    public Dog(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
