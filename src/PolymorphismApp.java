public class PolymorphismApp {

    public static void main(String[] args) {

        Employee employee = new Employee("aa");
        employee.sayHello("YY");

        employee = new Manager("bb");
        employee.sayHello("ZZ");

        employee = new VicePresident("cc");
        employee.sayHello("XX");
    }
}
