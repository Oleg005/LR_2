package com.laba.task3;


import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class Student {
    private Set<Subject> subjects = new HashSet<>();
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void  addSubject(String subject){
        this.subjects.add(new Subject(subject));
    }

    public void  setRate(String name,int rate){
         Subject subject =  subjects.stream().filter(s->s.getName().equalsIgnoreCase(name)).findFirst().orElseThrow(NoSuchElementException::new);
         subject.getRate().setRate(rate);
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Студент " + name+", предмети: "
                 + subjects;

    }
}
