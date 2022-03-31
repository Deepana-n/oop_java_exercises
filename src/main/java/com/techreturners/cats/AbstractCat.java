package com.techreturners.cats;

public abstract class AbstractCat implements Cat {
    private boolean asleep;
    private int averageHeight;
    private String setting;

    public AbstractCat(String setting,int averageHeight){
        this.asleep = false;
        this.setting = setting;
        this.averageHeight = averageHeight;
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

    public int getAverageHeight(){
        return this.averageHeight;
    }

    public abstract String eat();

}
