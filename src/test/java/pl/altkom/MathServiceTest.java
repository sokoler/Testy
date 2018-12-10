package pl.altkom;

import org.junit.Test;
import service.MathService;

import static org.junit.Assert.*;

public class MathServiceTest {

    @Test
    public void multiply() {
        MathService mathService = new MathService();

        int a=2, b=3;
        int expectedOutput = 6;

        int actualOutput = mathService.multiply(a,b);
        assertEquals(expectedOutput,actualOutput);

    }
}