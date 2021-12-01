package com.laba.task1;

public class Task1 {

    public static void main(String[] args) {
        // write your code here
        Box box = new Box();
        box.setContent("demo content");
        System.out.println("Box: "+Box.getName()+", content: "+box.getContent());
        CubeBox cubeBox = new CubeBox();
        cubeBox.setContent("demo cube content");
        System.out.println("CubeBox: "+CubeBox.getName()+", content: "+cubeBox.getContent()
                + ", size: {"+CubeBox.getWidth()+", "+CubeBox.getHeight()+", "+CubeBox.getDepth()+"}");
        DeliveryBox deliveryBox = new DeliveryBox("USA, Pentagon","President");
        System.out.println("DeliveryBox: "+DeliveryBox.getName()+", address: ["+deliveryBox.getAddress()+
                "], recipient: ["+deliveryBox.getRecipient()+"], departure date: "+
                deliveryBox.getDepartureDate().toString()+
                ", size: {"+DeliveryBox.getWidth()+", "+DeliveryBox.getHeight()+", "+DeliveryBox.getDepth()+"}");

    }
}
