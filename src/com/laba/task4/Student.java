package com.laba.task4;


import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public class Student {
    private final int id;
    private Set<Subject> subjects = new HashSet<>();
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Студент "+ name+ ", id="+ id+", предмети: "
                 + subjects;

    }
}
