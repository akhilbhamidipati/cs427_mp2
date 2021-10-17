package AnimalExercise;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalFactory {

    public static Animal create(AnimalType type){
        //@TODO: implement me
        int age = Integer.parseInt((new SimpleDateFormat("dd")).format(new Date()));
        if (type == AnimalType.Cat) {
            Cat a = new Cat("Salmon");
            a.setAge(age);
            return a;
        } else if (type == AnimalType.Dog) {
            Dog a = new Dog("Bone");
            a.setAge(age);
            return a;
        } else if (type == AnimalType.Duck) {
            Duck a = new Duck("Rice");
            a.setAge(age);
            return a;
        } else if (type == AnimalType.Cow) {
            Cow a = new Cow("Grass");
            a.setAge(age);
            return a;
        }
        return null;
    }
}
