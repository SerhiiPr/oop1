package com.company;

public class Box {
    private  int length;
    private  int width;
    private  int height;

    public Box() {
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public int getVolume(){
        return this.getHeight()*this.getWidth()*this.getLength();
    }

    public  int getSurfaceArea(){
        return 0;
    }

    public int getDiagonal(){
        return 0;
    }




}
