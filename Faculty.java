/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latedaytt;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name) {
        super(name);
    }

    public Faculty(String officeHours, String rank, String name, String office, double salary) {
        super(name, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String officeHours, String rank, String name, String address, String phoneNumber, String emailAddress, String office, double salary) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    
    
    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFaculty{ " + "officeHours=" + officeHours + ", rank=" + rank + " }";
    }
    
    
    
    
}
