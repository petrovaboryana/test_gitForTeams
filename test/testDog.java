import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testDog {
    @Test
    public void testEat(){
        Dog dog = new Dog("Ivan","buldog",1,15.2);
        dog.eat("barf");
        Assertions.assertEquals(15.70,dog.weight);
    }
    @Test
    public void testWalkOut() {
        Dog dog = new Dog("Ivan","buldog",1,15.2);
        dog.walkOut(2);
        Assertions.assertEquals(14.40, dog.weight);
    }//тук не ми минава имам разминаване с някакви стотни... не знам защо
}
