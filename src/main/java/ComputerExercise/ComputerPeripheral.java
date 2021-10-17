package ComputerExercise;

public abstract class ComputerPeripheral implements Computer{
    protected Computer computer;

    public ComputerPeripheral(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String run(){
        //@TODO: Implement me
        return null;
    }
    @Override
    public String getDescription(){
        //@TODO: Implement me
        return null;
    }
}
