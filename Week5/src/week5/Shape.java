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
public abstract class Shape {

    private double shapeId;

    public abstract double findArea();

    public abstract double finCircumherence();

    public Shape() {
    }

    public Shape(double shapeId) {
        this.shapeId = shapeId;
    }

    @Override
    public String toString() {
        return "Shape{" + "shapeId=" + shapeId + '}';
    }

}
