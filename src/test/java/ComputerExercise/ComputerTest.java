package ComputerExercise;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class TestComputer extends SimpleComputer{
    private boolean runIsCalled = false;

    @Override
    public String run() {
        runIsCalled = true;
        return super.run();
    }

    public boolean getRunIsCalled(){
        return runIsCalled;
    }
}

public class ComputerTest {


    @Test
    public void computerWithMonitorTest(){
        TestComputer testComputer = new TestComputer();
        Computer computer = new Monitor(testComputer);
        assertFalse(testComputer.getRunIsCalled());
        assertEquals("Monitor turned on\nHello world!\nDisplay colorful interface\n", computer.run());
        assertEquals("A simple computer with monitor", computer.getDescription());
        assertTrue(testComputer.getRunIsCalled());
    }

    @Test(timeout = 1000)
    public void computerWithKeyboardTest(){
        TestComputer testComputer = new TestComputer();
        Computer computer = new Keyboard(testComputer);
        assertFalse(testComputer.getRunIsCalled());
        ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());
        System.setIn(in);
        assertEquals("Hello world!\n", computer.run());
        assertEquals("A simple computer with keyboard", computer.getDescription());
        assertTrue(testComputer.getRunIsCalled());
        System.setIn(System.in);
    }
}
