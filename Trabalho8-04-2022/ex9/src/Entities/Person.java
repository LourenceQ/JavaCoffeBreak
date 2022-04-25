package Entities;

public class Person {
    public String Name;
    public String PhoneNumber;
    public int Age;
    public String Gender;

    public Person(String name, String phoneNumber, int age, String gender) {
        Name = name;
        PhoneNumber = phoneNumber;
        Age = age;
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Nome: " + this.Name + "\n" +
                "Número de telefone: " + this.PhoneNumber + "\n" +
                "idade: " + this.Age + "\n" +
                "Gênero: " + this.Gender;
    }
}
