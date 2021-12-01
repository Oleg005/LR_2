package com.laba.task4;

import java.util.Objects;

public class Subject {
    private final String name;
    private Rate rate;

    public Subject(String name) {
        this.name = name;
        this.rate = new Rate();
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject)) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return  name +  (rate.getRate()==0 ? "":" "+rate.getRate());
    }
}
