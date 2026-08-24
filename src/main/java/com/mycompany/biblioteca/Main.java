

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
    void readClient() {
        if (clients.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes:");
            for (Client client : clients) {
                System.out.println("ID: " + client.getId()
                        + ", Nombre: " + client.getName()
                        + ", Teléfono: " + client.getPhoneNumber()
                        + ", Email: " + client.getEmail());
            }
        }
    }

    void findClient() {
        try {
            System.out.print("Enter client ID to search: ");
            String id = sc.nextLine();

            if (id.isBlank()) {
                throw new IllegalArgumentException("El ID no puede estar vacío.");
            }

            boolean found = false;
            for (Client client : clients) {
                if (client.getId().equals(id)) {
                    System.out.println("Cliente encontrado:");
                    System.out.println("ID: " + client.getId());
                    System.out.println("Nombre: " + client.getName());
                    System.out.println("Teléfono: " + client.getPhoneNumber());
                    System.out.println("Email: " + client.getEmail());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No se encontró cliente con ID: " + id);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void updateClient() {
        try {
            System.out.print("Enter client ID to update: ");
            String id = sc.nextLine();

            if (id.isBlank()) {
                throw new IllegalArgumentException("El ID no puede estar vacío.");
            }

            boolean found = false;
            for (Client client : clients) {
                if (client.getId().equals(id)) {
                    System.out.println("Actualizando cliente: " + client.getName());

                    System.out.print("Nuevo nombre (dejar vacío para mantener): ");
                    String newName = sc.nextLine();
                    if (!newName.isBlank()) {
                        client.setName(newName);
                    }

                    System.out.print("Nuevo teléfono (dejar vacío para mantener): ");
                    String newPhone = sc.nextLine();
                    if (!newPhone.isBlank()) {
                        client.setPhoneNumber(newPhone);
                    }

                    System.out.print("Nuevo email (dejar vacío para mantener): ");
                    String newEmail = sc.nextLine();
                    if (!newEmail.isBlank()) {
                        client.setEmail(newEmail);
                    }

                    System.out.println("Cliente actualizado correctamente!");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No se encontró cliente con ID: " + id);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void deleteClient() {
        try {
            System.out.print("Enter client ID to delete: ");
            String id = sc.nextLine();

            if (id.isBlank()) {
                throw new IllegalArgumentException("El ID no puede estar vacío.");
            }

            boolean removed = clients.removeIf(client -> client.getId().equals(id));

            if (removed) {
                System.out.println("Cliente eliminado correctamente!");
            } else {
                System.out.println("No se encontró cliente con ID: " + id);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
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

    void readBook() {
        try {
            System.out.print("Enter book code to search: ");
            String code = sc.nextLine();

            if (code.isBlank()) {
                throw new IllegalArgumentException("El código no puede estar vacío.");
            }

            boolean found = false;
            for (Book book : books) {
                if (book.getCode().equals(code)) {
                    System.out.println("Book found:");
                    System.out.println("Code: " + book.getCode());
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("Public Date: " + book.getPublicDate());
                    System.out.println("Available: " + book.isAvailable());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No book found with code: " + code);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void findBook() {
        try {
            System.out.print("Enter book code to search: ");
            String code = sc.nextLine();

            if (code.isBlank()) {
                throw new IllegalArgumentException("El código no puede estar vacío.");
            }

            boolean found = false;
            for (Book book : books) {
                if (book.getCode().equals(code)) {
                    System.out.println("Book found:");
                    System.out.println("Code: " + book.getCode());
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("Public Date: " + book.getPublicDate());
                    System.out.println("Available: " + book.isAvailable());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No book found with code: " + code);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void updateBook() {
        try {
            System.out.print("Enter book code to update: ");
            String code = sc.nextLine();

            if (code.isBlank()) {
                throw new IllegalArgumentException("El código no puede estar vacío.");
            }

            boolean found = false;
            for (Book book : books) {
                if (book.getCode().equals(code)) {
                    System.out.println("Updating book: " + book.getTitle());

                    System.out.print("New title (leave blank to keep): ");
                    String newTitle = sc.nextLine();
                    if (!newTitle.isBlank()) {
                        book.setTitle(newTitle);
                    }

                    System.out.print("New author (leave blank to keep): ");
                    String newAuthor = sc.nextLine();
                    if (!newAuthor.isBlank()) {
                        book.setAuthor(newAuthor);
                    }

                    System.out.print("New public date (leave blank to keep): ");
                    String newDate = sc.nextLine();
                    if (!newDate.isBlank()) {
                        book.setPublicDate(newDate);
                    }

                    System.out.print("Is available? (S/N, leave blank to keep): ");
                    String resp = sc.nextLine().trim().toUpperCase();
                    if (!resp.isBlank()) {
                        book.setAvailable(resp.equals("S"));
                    }

                    System.out.println("Book updated successfully!");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No book found with code: " + code);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void deleteBook() {
        try {
            System.out.print("Enter book code to delete: ");
            String code = sc.nextLine();

            if (code.isBlank()) {
                throw new IllegalArgumentException("El código no puede estar vacío.");
            }

            boolean removed = books.removeIf(book -> book.getCode().equals(code));

            if (removed) {
                System.out.println("Book deleted successfully!");
            } else {
                System.out.println("No book found with code: " + code);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
