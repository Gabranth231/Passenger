package programTest.gmit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PassengerTest {
    Passenger p1;
    @Test
    public void TestConstructorTitle(){
        p1 = new Passenger("Mr","Martin","0085959",859459,22);
        assertEquals("Mr",p1.getTitle());
    }
    @Test
    public void TestConstructorInvalidTitle(){
        final String invalid = "Invalid title Provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()->
                new Passenger("Miss","Abby","879878947",774651,21));
        assertEquals(invalid,exceptionThrown.getMessage());
    }
}
