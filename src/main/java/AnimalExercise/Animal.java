package AnimalExercise;

public abstract class Animal {

    private String backpack;
    private int age;

    public abstract String speak();

    public String getBackpack() {
        return backpack;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Animal(String backpack) {
        this.backpack = backpack;
    }
}
