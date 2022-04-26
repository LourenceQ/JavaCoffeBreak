package Entities;

import java.util.ArrayList;

public class Loan {
    public ArrayList<Book> Book = new ArrayList<Book>(); 
    public ArrayList<Person> Person = new ArrayList<Person>();  
    
    public void printBooks() {
        System.out.println("Livros alugados");
        for (int i=0; i<Book.size(); i++) {
            System.out.println();
            System.out.println(Book.get(i));
        } 
    }

    public void printPeople() {
        System.out.println("Dados do locatário");
        for (int i=0; i<Person.size(); i++) {
            System.out.println(Person.get(i));
        } 
    }
}
