package HomeWorks.Day5;

public class EmployeeTest {
    public static void main(String[] args) {
        /**
         *  create 5 employee objects(3 male and 2 female)
         * 3 of objects are working in same department
         */

        Employee employee1 = new Employee(256, "Armen", "java", 30, 'M');
        Employee employee2 = new Employee(256, "Ashot", "java", 30, 'M');
        Employee employee3 = new Employee(256, "Aram", "c++", 30, 'M');
        Employee employee4 = new Employee(256, "Ann", "java", 30, 'F');
        Employee employee5 = new Employee(256, "Ani", "c++", 30, 'F');


        /**
         *  print all info about them
         */
        employee1.allInfo();
        employee1.allInfo();
        employee1.allInfo();
        employee1.allInfo();
    }


}
