package Entities;

public class Book {
    public String Name;
    public String Author;
    public String Publisher;
    public String Genre;

    public Book(String name, String author, String publisher, String genre) {
        Name = name;
        Author = author;
        Publisher = publisher;
        Genre = genre;
    }   

    
    
    @Override
    public String toString() {
        return "Nome: " + this.Name + "\n" +
                "Author: " + this.Author + "\n" +
                "Editora: " + this.Publisher + "\n" +
                "Gênero: " + this.Genre;
    }


}
