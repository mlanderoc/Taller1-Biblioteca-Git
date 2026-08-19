
package com.mycompany.biblioteca;


public class Book extends Material {
    private String author;
    private boolean available;

    public Book(String author, boolean available, String code, String title, String publicDate) {
        super(code, title, publicDate);
        this.author = author;
        this.available = available;
    }
    
    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
}
