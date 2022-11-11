package day28review;

import java.util.Deque;
import java.util.LinkedList;

public class Queues02 {
    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>();
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck);

        furnitureTruck.push("TV Unit");
        System.out.println(furnitureTruck);

        String el1 = furnitureTruck.pop();
        System.out.println(el1);
        System.out.println(furnitureTruck);

    }
}
