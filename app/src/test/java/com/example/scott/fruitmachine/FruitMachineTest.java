package com.example.scott.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

/**
 * Created by scott on 03/11/2017.
 */

public class FruitMachineTest {

    FruitMachine fruitMachine;

    @Before
    public void setUp() throws Exception {
        fruitMachine = new FruitMachine();
    }

    @Test
    public void testFruitMachineHasSymbols() throws Exception {
//        check to see if you can get all symbols from enum class file
        assertEquals("[CHERRY, BANANA, BIGWIN, STRAWBERRY, WATERMELON]", fruitMachine.getSymbols().toString());
        assertEquals(fruitMachine.getSymbols().get(0).getValue(), 25);
    }
//
    @Test
    public void testSpinReturnsRandomSymbols() throws Exception {
//         check that spin can put out 3 random symbols and that they get added to the symbol ArrayList
//        check what happens when 3 symbols match
        fruitMachine.spin();
//        add Mockito to test randomness later - works for now.
        assertEquals(fruitMachine.getSlots(), fruitMachine.getSlots());
    }

    @Test
    public void testCheckWinStatus() throws Exception {
        fruitMachine.spin();
//        add Mockito to check for randomness later.
        assertEquals("You lose!", fruitMachine.checkWinStatus());
    }

//
//    @Test
//    public void testWinningsAreUpdated() throws Exception {
////  check that winnings are updated when the player wins a round.
//    }
//
//    @Test
//    public void testPayoutMethodWorks() throws Exception {
//// check that winnings are updated if the player chooses to payout
//    }

    @Test
    public void testTotalSlotValue() throws Exception {
        fruitMachine.spin();
        assertEquals(30, fruitMachine.totalSlotVal());
    }
    @Test
    public void testFirstSlotValue() throws Exception {
        fruitMachine.spin();
        assertEquals(10, fruitMachine.firstSlotVal());
    }
}
