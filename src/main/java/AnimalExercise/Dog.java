package AnimalExercise;

public class Dog extends Animal {
    //@TODO: implement me
    @Override
    public String speak() {
        return "Woof";
    }

    public Dog(String backpack) {
        super(backpack);
    }
}
