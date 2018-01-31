/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.view;

import student.model.Address;
import student.model.Student;

/**
 *
 * @author INT105
 */
public class TestStudent {
    public static void main(String[] args) {
        Address johnAddr = new Address("123","Prachautid","BKK","10140");
        Student john = new Student(60123,"john",johnAddr);
        System.out.println(john);
        
        Address newJohnAddr = new Address("444","Ratchada","BKK","1000");
        john.setStdAddr(newJohnAddr);
        System.out.println(john);
        
        Student mary = new Student (60124,"Mary",johnAddr);
        System.out.println(mary);
     
    }
}
