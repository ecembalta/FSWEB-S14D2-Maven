package org.example.model;

public class Bedroom {
    private Bed bed;
    private Carpet carpet;
    private Ceiling ceiling;
    private Lamp lamp;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Wardrobe wardrobe;
    private String name;

    public Bedroom(Bed bed, Carpet carpet, Ceiling ceiling, Lamp lamp, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Wardrobe wardrobe, String name) {
        this.bed = bed;
        this.carpet = carpet;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.wardrobe = wardrobe;
        this.name = name;
    }

    public Bed getBed() {
        return bed;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "bed=" + bed +
                ", carpet=" + carpet +
                ", ceiling=" + ceiling +
                ", lamp=" + lamp +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", wardrobe=" + wardrobe +
                ", name='" + name + '\'' +
                '}';
    }
}
