import javax.imageio.plugins.tiff.GeoTIFFTagSet;

import Entities.Employee;

class Main {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();

        emp1.setName("Lourence");
        emp1.setLastname("Queiróz");
        emp1.setSalary(9000);
        System.out.println(emp1.PrintMe());

        emp1.setName("Lawrence");
        emp1.setLastname("Fófano");
        emp1.setSalary(-1);
        System.out.println(emp1.PrintMe());
    }
}