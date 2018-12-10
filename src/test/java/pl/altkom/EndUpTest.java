package pl.altkom;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndUpTest {

    static EndUp end;

    @BeforeClass
    public static void inicjalizacja(){
        end = new EndUp();
    }

    @Test
    public void endUp1() {

        assertEquals("HeLLO", end.endUp("Hello"));

    }

    @Test
    public void endUp2() {

        assertEquals("Hi ThERE", end.endUp("Hi There"));

    }

    @Test
    public void endUp3() {

        assertEquals("HI", end.endUp("hi"));

    }

}