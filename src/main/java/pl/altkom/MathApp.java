package pl.altkom;

import service.MathService;

public class MathApp {

    private MathService math;

    public int multiplyAndPlus ( int a, int b, int c){

        return (math.multiply(a,b) + c);

    }

}
