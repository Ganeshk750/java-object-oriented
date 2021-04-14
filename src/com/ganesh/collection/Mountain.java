package com.ganesh.collection;


/**
 * @created: 14/04/2021 - 7:50 PM
 * @author: Ganesh
 */


public class Mountain implements Comparable<Mountain>{

    private String name;
    private int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Mountain o) {
        return this.height - o.height;
    }
}
