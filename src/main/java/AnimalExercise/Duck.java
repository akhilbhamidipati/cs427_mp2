package AnimalExercise;

public class Duck extends Animal {
    //@TODO: implement me
    @Override
    public String speak() {
        return "Quack";
    }

    public Duck(String backpack) {
        super(backpack);
    }
}
