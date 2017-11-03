package com.example.scott.fruitmachine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by scott on 03/11/2017.
 */

public class FruitMachine {

    private ArrayList<Symbols> symbols;
    private int winnings = 1000;
    private int funds = 0;


    public FruitMachine(){
        this.funds = 1000;
        this.winnings = 0;
//        initialised empty ArrayList below, which will take enum symbols (3).
        this.symbols = new ArrayList<>();
    }

    public ArrayList<Symbols> getSymbols() {
        symbols.add(0, Symbols.CHERRY);
        symbols.add(1, Symbols.BANANA);
        symbols.add(2, Symbols.BIGWIN);
        symbols.add(3, Symbols.STRAWBERRY);
        symbols.add(4, Symbols.WATERMELON);
        return symbols;
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

    public void spin(){
//        if funds are more than 50;
        for (int i=0; i < 3; i++){
//            generate a random symbol/index, and put it into the index = i on the symbol arraylist
        }
//        checkWinStatus()
    }
}
