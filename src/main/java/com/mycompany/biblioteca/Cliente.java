
package com.mycompany.biblioteca;


public class Cliente extends Persona{
    private  String email;
    
    public Cliente(String email, String name, String id, String phoneNumber) {
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
