package Entities;

public class Mother extends Person{   
    public String Role;

    public Mother(String name, int age, String gender, String role) {
        super(name, age, gender);
        Role = role;
    }

    @Override
    public String toString() {
        return "Papel na família: " + this.Role + "\n" +
                "Nome: " + this.Name + "\n" +
                "idade: " + this.Age + "\n" +
                "Gênero: " + this.Gender;
    }

}
