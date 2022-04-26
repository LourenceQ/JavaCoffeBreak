import Entities.Father;
import Entities.Mother;

class Main {
    public static void main(String[] args) {
        Father f1 = new Father("Robinson", 30, "M", "Pai");        
        Mother m1 = new Mother("Marcele", 30, "F", "Mãe");
        
        System.out.println(f1);  
        System.out.println(m1);
    }
}