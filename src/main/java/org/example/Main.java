package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bedroom bedroom;
        bedroom = new Bedroom(new Bed("Modern", 4,50, 1, 1),new Carpet(100,100, PaintColor.GREEN),new Ceiling(50,PaintColor.WHITE),new Lamp(LampType.NORMAL,false,8),new Wall("NORTH"),new Wall("SOUTH"), new Wall("EAST"), new Wall("WEST"), new Wardrobe(150,180,40.6),"Yatak Odası");

        System.out.println(bedroom);
    }
}