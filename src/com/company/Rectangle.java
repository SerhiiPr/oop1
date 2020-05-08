package com.company;

import java.util.Objects;

public class Rectangle {

    private int lenght;
    private int widths;


    public int getLenght() {
        return lenght;
    }

    public Rectangle() {
    }

    public int getWidths() {
        return widths;
    }

    public Rectangle(int lengt, int widhts)
    {
        this.lenght=lengt;
        this.widths=widhts;

    }

    public void setLenght(int lenght) {
        if(lenght>0){
        this.lenght = lenght;}
    }

    public void setWidths(int widths) {
        if(widths>0){
        this.widths = widths;}
    }
public int getArea(){
        return this.getLenght()*this.getWidths();
}

public int getPerimeter(){
        return 2*(this.getLenght()+this.getWidths());
}

public static int getArea(int lenght, int widths){
        return  lenght*widths;
}
    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", widths=" + widths +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLenght() == rectangle.getLenght() &&
                getWidths() == rectangle.getWidths();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLenght(), getWidths());
    }
}
