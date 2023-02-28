public class Manager extends Employee {

    String company;

    // Default Constructor
    Manager(String name){
        super(name);
    }

    // overloading Constructor
    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("hi "+ name + ", my name is manager " +  this.name);
    }
}
