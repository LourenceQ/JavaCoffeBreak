import Entities.Contact;
import Entities.Schedule;

class Main {
    public static void main(String[] args) {
        Contact ct1 = new Contact("Ricardo", "35 987786547","Masculino" ,40);
        Contact ct2 = new Contact("João","33 9889786547" , "Masculino", 54);
        Contact ct3 = new Contact("Heitor", "31 987786547", "Masculino", 35);

        Schedule mk = new Schedule();
        mk.Contact.add(ct1);
        mk.Contact.add(ct2);
        mk.Contact.add(ct3);

        int len = mk.Contact.size();
        for(int i=0; i<len; i++) {
            System.out.println("Contato nº " + (i+1));
            System.out.println(mk.Contact.get(i).toString());
            System.out.println();
        }
    }
}