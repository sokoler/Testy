package pl.altkom;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonkeyTroubleTest {

    // Raz wywoła sie  BeforeClass, a Before przed każdym testem

   static MonkeyTrouble mk;

    @BeforeClass
    public static void inicjalizacja(){

        mk = new MonkeyTrouble();

    }


    @Test
    public void monkeyTroubleTrue() {

    //    MonkeyTrouble mk = new MonkeyTrouble();
        mk.monkeyTrouble(true,true);
        //trouble if both are smiling or noone is smiling
        assertTrue("both smiling", true);

    }

    @Test
    public void monkeyTroubleFalse() {

     //   MonkeyTrouble mk = new MonkeyTrouble();

        mk.monkeyTrouble(false, true);

        assertFalse("one smiling, one sad", false);

    }

    @Test
    public void monkeyTroubleTrue2() {

     //   MonkeyTrouble mk = new MonkeyTrouble();

        mk.monkeyTrouble(false,false);
        //trouble if both are smiling or noone is smiling
        assertTrue("both sad", true);

    }

    @Test
    public void monkeyTroubleFalse2() {

      //  MonkeyTrouble mk = new MonkeyTrouble();

        mk.monkeyTrouble(true,false);
        //trouble if both are smiling or noone is smiling
        assertFalse("one smiling, one sad", false);

    }



}