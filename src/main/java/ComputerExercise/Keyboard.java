package ComputerExercise;

public class Keyboard extends ComputerPeripheral{
//@TODO: Implememnt me

    public Keyboard(Computer computer) {
        super(computer);
    }

    @Override
    public String run() {
        return "Hello world!\n";
    }

    @Override
    public String getDescription() {
        return "A simple computer with keyboard";
    }
}
