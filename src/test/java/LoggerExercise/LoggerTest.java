package LoggerExercise;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class LoggerTest {

    @Test
    public void noPublicConstructorTest(){
        Constructor[] constructors = Logger.class.getConstructors();
        assertEquals(0,constructors.length);
    }

    @Test
    public void createInstanceTest() throws NoSuchFieldException,IllegalAccessException{

        Field field = Logger.class.getDeclaredField("instance");
        field.setAccessible(true);
        Logger log = (Logger)field.get(null);
        assertNull(log);
        Logger logger = Logger.getInstance();
        assertNotNull(logger);

    }

    @Test
    public void writeTest() throws IOException{
        String today = (new SimpleDateFormat("MMddyyyy")).format(new Date());
        String filename = "log"+today+".log";
        File file = new File(filename);
        Logger logger = Logger.getInstance();
        logger.logInFile(today+" is a good day.");
        logger.logInFile(today+" has clear sky.");
        assertTrue(file.exists());

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        assertEquals(today+" is a good day.",br.readLine());
        assertEquals(today+" has clear sky.",br.readLine());
        br.close();

    }
}
