import Entities.Loan;
import Entities.Person;
import Entities.Book;

class Main {
    public static void main(String[] args) {
        Loan l1 = new Loan();
        Person p1 = new Person("Lucas", "32 999876757", 29, "Masculino");
        Book b1 = new Book("Ler e escrever", "H.Alister", "Editar Ltda", "Pedagoia");
        Book b2 = new Book("Histórias de Teror", "H.Crawlling", "Horror Ltda", "Terror");
        
        
        l1.Book.add(b1);
        l1.Book.add(b2);
        l1.Person.add(p1);        
        l1.printPeople(); 
        System.out.println();     
        l1.printBooks();
    }
}