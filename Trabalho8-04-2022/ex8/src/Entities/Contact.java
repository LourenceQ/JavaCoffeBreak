package Entities;

public class Contact {
    public String Name;
    public String PhoneNumber;
    public String Gender;
    public int Age;

    public Contact(String name, String phoneNumber, String gender, int age) {
        Name = name;
        PhoneNumber = phoneNumber;
        Gender = gender;
        Age = age;
    }

    @Override
    public String toString() {
        return "Nome: " + this.Name + "\n" +
                "Número de Telefone: " + this.PhoneNumber + "\n" +
                "Gênero: " + this.Gender + "\n" +
                "Idade: " + this.Age;
    }
}
