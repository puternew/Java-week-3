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
public class Circle2 extends Circle {

    public Circle2() {
    }

    public Circle2(double radius, double shapeId) {
        super(radius, shapeId);
    }

   

    @Override
    public double finCircumherence() {
        return 2 * Math.PI * getRadius();
    }
@Override
    public  double findArea(){
        return Math.PI*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
