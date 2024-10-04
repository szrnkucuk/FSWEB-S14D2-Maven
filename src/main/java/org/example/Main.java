package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp(LampType.NORMAL, true, 80);
        Bed bed= new Bed("Çift Kişilik", 4, 1, 2, 2);
        Wardrobe wardrobe= new Wardrobe(2, 4, 40);
        Ceiling ceiling= new Ceiling(3, PaintColor.RED);
        Wall wall= new Wall("NORTH");
        System.out.println(lamp.getStyle());
        System.out.println(ceiling.getColor());

        System.out.println("Hello world!");
    }
}