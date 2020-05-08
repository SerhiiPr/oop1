package com.company;

public class TriangleFactory {
    private  float sideA;
    private  float sideB;
    private  float sideD;

    public TriangleFactory() {
    }

    private TriangleFactory(float sideA, float sideB, float sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideD = sideD;
    }

    public  static Triangle create(float a,float b, float c){
        if(a+b<c) return  null;
        return new Triangle(a,b,c);
    }

}
