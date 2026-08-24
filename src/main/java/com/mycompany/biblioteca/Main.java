

package com.mycompany.biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Book> books = new ArrayList<>(); 
    static ArrayList<Client> clients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    //Methods
    static void createClient() {

        try {
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter phone number: ");
            String phoneNumber = sc.nextLine();

            System.out.print("Enter email: ");
            String email = sc.nextLine();

            if (id.isBlank()) {
                throw new IllegalArgumentException("ID no puede estar vacio.");
            }

            Client client = new Client(email, name, id, phoneNumber);

            clients.add(client);

            System.out.println("Cliente creado");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
    void readClient(){
        
    }
    void findClient(){
        
    }
    void updateClient(){
        
    }
    void deleteClient(){
        
    }
    void createBook(){
        
    }
    void readBook(){
        
    }
    void findBook(){
        
    }
    void updateBook(){
        
    }
    void deleteBook(){
        
    }
}
