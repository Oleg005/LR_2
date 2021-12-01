package com.laba.task4;

public class Rate {
    int rate;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return Integer.toString(rate);
    }
}
