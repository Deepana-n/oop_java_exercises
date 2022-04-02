package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends AbstractCat {

    public DomesticCat() {
        super("domestic",23);
    }

    @Override
    public String eat(){
        String[] randomResponseArray = {"Purrrrrrr", "Purrrrrrr It will do I suppose"};
        int index = new Random().nextInt(randomResponseArray.length);
        return randomResponseArray[index];
    }
}
