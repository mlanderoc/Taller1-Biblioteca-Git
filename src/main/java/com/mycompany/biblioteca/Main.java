

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
    void createClient() {

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

            System.out.println("Cliente registrado");

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
    //----------------------------------------------------
    void createBook() {
    try {
        System.out.print("Enter book code : ");
        String code = sc.nextLine();

        System.out.print("Enter title : ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter publicDate: ");
        String publicDate = sc.nextLine();

        System.out.print("Is the book available? (S/N): ");
        String resp = sc.nextLine().trim().toUpperCase();
        boolean available = resp.equals("S");

        if (code.isBlank()) {
            throw new IllegalArgumentException("code no puede estar vacio.");
        }

        Book book = new Book(author, available, code, title, publicDate);
        books.add(book);

        System.out.println("Libro guardado correctamente");

    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
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
