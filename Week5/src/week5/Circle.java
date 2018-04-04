/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author INT105
 */
public abstract class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius, double shapeId) {
        super(shapeId);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()+"Circle{" + "radius=" + radius + '}';
    }
    @Override
    public  double findArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    
}
