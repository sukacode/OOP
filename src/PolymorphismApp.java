public class PolymorphismApp {

    public static void main(String[] args) {

        Employee employee = new Employee("aa");
        employee.sayHello("YY");

        employee = new Manager("bb");
        employee.sayHello("ZZ");

        employee = new VicePresident("cc");
        employee.sayHello("XX");

        sayHello(new Employee("gg"));
        sayHello(new VicePresident("hh"));
        sayHello(new Manager("ii"));
    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}