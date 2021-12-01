package com.laba.task1;

public class Box {
    private final static String name;
    static {
        name="box";
    }
    private String content;

    public Box() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static String getName() {
        return name;
    }


}
