/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latedaytt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.awt.PeerEvent;

/**
 *
 * @author INT105
 */
public class EmployeeTest {

    public static void main(String[] args) {
        String test_name = " Ike";
//        Employee emp = new Employee(test_name);
//        System.out.println(emp);
//        Staff sf = new Staff(test_name);
//        Faculty fc = new Faculty(test_name);
//        System.out.println(fc);
//        Person emp = new Employee(test_name);
//        System.out.println(emp);
//        Person std = new Student("idk", Student.Status.senior);
////        Student std = new Student("TINY", Student.Status.freshman);
//        System.out.println(std);
//        System.out.println(std.getSignature());
        Person[] persons = new Person[5];
        persons[0] = new Employee("JAM");
        persons[1] = new Student("Mint", Student.Status.junior);
        persons[2] = new Student("Mook", Student.Status.senior);
        persons[3] = new Staff("Amanda", "Infra");
        persons[4] = new Employee("Jung");
        
        Student std1 = new Student("AAAAAAAAAAA", Student.Status.senior);
        Student std2 = new Student("AAAAAAAAAAA", Student.Status.senior);
        
        if(std1.equals(std2)){
            System.out.println("*****std1 == std2*******");
        }
        
//        for(Object ooo: persons){
//            System.out.println(ooo);
//            System.out.println("****************************");
//        }

    }

    @Test
    public void setNameToEmployee() {
        String test_name = "Ike";
        Employee emp = new Employee(test_name);
        assertEquals(test_name, emp.getName());
    }

}
