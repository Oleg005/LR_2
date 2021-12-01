package com.laba.task1;

public class CubeBox extends Box {
    private  static final int width;
    private static final int height;
    private static final int depth;
    static {
        width=100;
        height=100;
        depth=100;
    }

    public CubeBox() {
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    public static int getDepth() {
        return depth;
    }


}
