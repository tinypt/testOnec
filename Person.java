/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latedaytt;

public class Person {
    
    private String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String name) {
        this.name = name;
    }//อย่างน้อยก็ต้งใส่อะไรมา

    public String getSignature(){
        String result ="";
        result = name.substring(0, 2);
        result += name.substring(name.length()-2);
        return result.toUpperCase();
    }
    
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{ name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + " }";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
    
}
