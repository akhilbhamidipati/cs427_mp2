package ComputerExercise;

public class SimpleComputer implements Computer {

    //Do not modify me
    @Override
    public String run() {
        return "Hello world!\n";
    }

    @Override
    public String getDescription() {
        return "A simple computer";
    }
}
