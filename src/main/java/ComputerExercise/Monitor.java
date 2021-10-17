package ComputerExercise;

public class Monitor extends ComputerPeripheral{
    public Monitor(Computer computer) {
        super(computer);
    }
//@TODO: Implememnt me
    @Override
    public String run() {
        return "Monitor turned on\nHello world!\nDisplay colorful interface";
    }

    @Override
    public String getDescription() {
        return "A simple computer with monitor";
    }
}
