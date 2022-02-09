package programTest.gmit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PassengerTest {
    Passenger p1;
    @Test
    public void TestConstructorTitle(){
        p1 = new Passenger("Mr","Martin","0000000000",111111,22);
        assertEquals("Mr",p1.getTitle());
    }
    @Test
    public void TestConstructorInvalidTitle(){
        final String invalid = "Invalid title Provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()->
                new Passenger("Miss","Abby","0000000000",111111,21));
        assertEquals(invalid,exceptionThrown.getMessage());
    }
    @Test
    public void TestConstructorName(){
        p1 = new Passenger("Mr","Tim","0000000000",111111,22);
        assertEquals("Tim",p1.getName());
    }
    @Test
    public void TestConstructorInvalidName(){
        final String invalid = "Invalid name Provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()->
                new Passenger("Mr","Ti","0000000000",111111,21));
        assertEquals(invalid,exceptionThrown.getMessage());
    }
    @Test
    public void TestConstructorID(){
        p1 = new Passenger("Mr","Tim","0000000000",111111,22);
        assertEquals("0000000000",p1.getID());
    }
    @Test
    public void TestConstructorInvalidID(){
        final String invalid = "Invalid ID Provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()->
                new Passenger("Mr","Tim","000000000",111111,21));
        assertEquals(invalid,exceptionThrown.getMessage());
    }
}
