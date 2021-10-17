package AnimalExercise;

public class Cat extends Animal {
    //@TODO: implement me
    @Override
    public String speak() {
        return "Meow";
    }

    public Cat(String backpack) {
        super(backpack);
    }
}
