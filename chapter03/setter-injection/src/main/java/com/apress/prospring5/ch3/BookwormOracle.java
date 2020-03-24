package com.apress.prospring5.ch3;

public class BookwormOracle implements Oracle{

    private Encyclepedia encyclepedia;

    public void setEncyclepedia(Encyclepedia encyclepedia){

        this.encyclepedia = encyclepedia;
    }

    @Override
    public String defineMeaningOfLife() {

        return "Encycleopedias are a waste of money - go see the world instead";
    }
}
