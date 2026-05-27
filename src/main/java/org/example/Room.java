package org.example;

public class Room {
    private String name;
    private String description;
    private int n, e, s, w;

    public Room(String name, String description, int n, int e, int s, int w) {
        this.name = name;
        this.description = description;
        this.n = n;
        this.e = e;
        this.s = s;
        this.w = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void printRoom() {
        System.out.println(getName());
        System.out.println(getDescription());
    }
}
