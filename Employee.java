/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latedaytt;

/**
 *
 * @author INT105
 */
public class Employee extends Person {
    //#office: String
    //#salary: double
    //เวลาคลาสลูกสร้างขึ้นมาถ้าคลาสพ่อมีคอนทรัคเตอร์เปล่า จะเรียกมาใช้ได้ 
    
    protected String office;
    protected double salary;

    public Employee(String name) {
        super(name);
    }
    
    public Employee(String name, String office, double salary) {
        super(name);
        this.office = office;
        this.salary = salary;
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nEmployee{ office=" + office + ", salary=" + salary + " }";
    }


    
    
    
}
