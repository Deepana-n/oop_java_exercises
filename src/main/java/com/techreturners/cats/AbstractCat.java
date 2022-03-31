package com.techreturners.cats;

public class AbstractCat implements Cat {
    private boolean asleep;
    private int averageHeight;
    private String setting;
    private String eat;

    public AbstractCat(String setting,int averageHeight,String eat){
        this.asleep = false;
        this.setting = setting;
        this.averageHeight = averageHeight;
        this.eat = eat;
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

    public String eat(){
        return this.eat;
    }

}
