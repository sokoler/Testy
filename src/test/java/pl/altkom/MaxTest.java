package pl.altkom;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {


    static Max max;

    @BeforeClass
    public static void inicjalizacja(){
        max = new Max();
    }

    @Test
    public void max1020() {

    assertEquals(18,max.max1020(23,18) );
    }
}