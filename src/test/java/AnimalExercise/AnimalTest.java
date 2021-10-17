package AnimalExercise;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AnimalTest {

    @Test
    public void speakTest(){
        Animal cat = AnimalFactory.create(AnimalType.Cat);
        assertEquals("Meow",cat.speak());
        Animal dog = AnimalFactory.create(AnimalType.Dog);
        assertEquals("Woof",dog.speak());
        Animal duck = AnimalFactory.create(AnimalType.Duck);
        assertEquals("Quack",duck.speak());
        Animal cow = AnimalFactory.create(AnimalType.Cow);
        assertEquals("Moo",cow.speak());
    }

    @Test
    public void ageTest(){
        int age = Integer.parseInt((new SimpleDateFormat("dd")).format(new Date()));
        Animal cat = AnimalFactory.create(AnimalType.Cat);
        assertEquals(age,cat.getAge());
        Animal dog = AnimalFactory.create(AnimalType.Dog);
        assertEquals(age,dog.getAge());
        Animal duck = AnimalFactory.create(AnimalType.Duck);
        assertEquals(age,duck.getAge());
        Animal cow = AnimalFactory.create(AnimalType.Cow);
        assertEquals(age,cow.getAge());
    }

    @Test
    public void sillyAnimalTest(){
        int age = Integer.parseInt((new SimpleDateFormat("dd")).format(new Date()));
        Cat cat = new Cat("object");
        assertNotEquals(age,cat.getAge());
        Dog dog = new Dog("object");
        assertNotEquals(age,dog.getAge());
        Duck duck = new Duck("object");
        assertNotEquals(age,duck.getAge());
        Cow cow = new Cow("object");
        assertNotEquals(age,cow.getAge());
    }

    @Test
    public void backpackTest(){
        Animal cat = AnimalFactory.create(AnimalType.Cat);
        assertEquals("Salmon",cat.getBackpack());
        Animal dog = AnimalFactory.create(AnimalType.Dog);
        assertEquals("Bone",dog.getBackpack());
        Animal duck = AnimalFactory.create(AnimalType.Duck);
        assertEquals("Rice",duck.getBackpack());
        Animal cow = AnimalFactory.create(AnimalType.Cow);
        assertEquals("Grass",cow.getBackpack());
    }

}
