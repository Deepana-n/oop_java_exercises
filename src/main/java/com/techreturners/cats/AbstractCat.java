package com.techreturners.cats;

public class AbstractCat implements Cat {
    private boolean asleep;
    private int averageHeight;
    private String setting;

    public AbstractCat(String setting){
        this.asleep = false;
        this.setting = setting;
    }

    public boolean isAsleep(){
        return this.asleep;
    }

    public void goToSleep(){
        this.asleep = true;
    }

    public void wakeUp(){
        this.asleep = false;
    }

    public String getSetting(){
        return this.setting;
    }
}
