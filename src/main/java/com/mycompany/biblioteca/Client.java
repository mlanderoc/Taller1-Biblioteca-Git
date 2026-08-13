
package com.mycompany.biblioteca;


public class Client extends Person{
    private  String email;
    
    public Client(String email, String name, String id, String phoneNumber) {
        super(name, id, phoneNumber);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
