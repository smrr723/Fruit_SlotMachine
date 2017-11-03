package com.example.scott.fruitmachine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by scott on 03/11/2017.
 */

public class FruitMachine {

    private ArrayList<Symbols> symbols;
    private ArrayList<Symbols> slots;
    private int winnings = 1000;
    private int funds = 0;


    public FruitMachine(){
        this.funds = 1000;
        this.winnings = 0;
//        initialised empty ArrayList below, which will take enum symbols (3).
        this.symbols = new ArrayList<>();
        this.slots = new ArrayList<>();
    }

    public ArrayList<Symbols> getSymbols() {
//        Refactor the below - method to loop through enums values?
        symbols.add(0, Symbols.CHERRY);
        symbols.add(1, Symbols.BANANA);
        symbols.add(2, Symbols.BIGWIN);
        symbols.add(3, Symbols.STRAWBERRY);
        symbols.add(4, Symbols.WATERMELON);
        return symbols;
    }

    public int getNoOfSymbols(){
        return getSymbols().size();
    }

    public ArrayList<Symbols> getSlots() {
        return slots;
    }

    public void setSymbols(ArrayList<Symbols> symbols) {
        this.symbols = symbols;
    }

    public int getWinnings() {
        return winnings;
    }

    public void setWinnings(int winnings) {
        this.winnings = winnings;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public int getRandomNumber(){
        Random rand = new Random();
        int listSize = getNoOfSymbols();
        int random = rand.nextInt(listSize);
        return random;
    }

    public int firstSlotVal(){
        return this.getSlots().get(0).getValue();
    }
    public int totalSlotVal(){
        int totalSlotVal = 0;
        int i = 0;
        for (i=0; i < 3; i++){
            totalSlotVal += this.getSlots().get(i).getValue();
        }
        return totalSlotVal;
    }

    public String checkWinStatus(){
        if (this.totalSlotVal() / this.firstSlotVal() == 3){
            return "You win!";}
        else {
                return "You lose!";
        }
    }

//    Java.util.Collections.frequency() could be used for the below;

    public void spin(){
//        if funds are more than 50;
        int i = 0;
        for (i=0; i < 3; i++) {
            slots.add(i, symbols.get(getRandomNumber()));
//            generate a random symbol/index, and put it into the index = i on the symbol arraylist
        }
        this.checkWinStatus();
    }
}
