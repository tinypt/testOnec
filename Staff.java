/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latedaytt;

public class Staff extends Employee {
    private String title;

    public Staff(String name) {
        super(name);
    }
    
    
    
    public Staff(String title, String name, String office, double salary) {
        super(name, office, salary);
        this.title = title;
    }

    public Staff(String title, String name, String address, String phoneNumber, String emailAddress, String office, double salary) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }

    public Staff( String name,String title) {
        super(name);
        this.title = title;
    }
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  super.toString() +"\nStaff{ " + "title=" + title + " }";
    }

    
}
