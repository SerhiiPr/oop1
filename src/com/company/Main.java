package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rectangle myGarden=new Rectangle(7,8);
        System.out.println(myGarden.toString());

        System.out.println(myGarden.getArea());

        Rectangle hisGarden= new Rectangle();
        hisGarden.setLenght(12);
        hisGarden.setWidths(5);

        hisGarden.equals(myGarden);

        System.out.println(myGarden.hashCode());

        System.out.println(Rectangle.getArea(10, 8));

        TriangleFactory factory = new TriangleFactory();
        Triangle fourth = TriangleFactory.create(10,1,1);
    }
}
