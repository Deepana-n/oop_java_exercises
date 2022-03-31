package com.techreturners.cats;

public class AbstractCat implements Cat {
    private boolean asleep;
    private int averageHeight;
    private String setting;

    public AbstractCat(){
        this.asleep = false;
    }

    public boolean isAsleep(){
        return this.asleep;
    }
}
