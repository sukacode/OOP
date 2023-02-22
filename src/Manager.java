public class Manager {
    // field name
    String name;
    String company;

    // Default Constructor
    Manager(String name){
        this.name = name;
    }

    // overloading Constructor
    Manager(String name, String company){
        this.name = name;
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("hi "+ name + ", my name is manager " +  this.name);
    }

}
