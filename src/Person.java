class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    Person(String name, String address) {
        // this keywoard
        this.name = name;
        this.address = address;
    }

    // Overloading Constructor
    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    // Method sayHello
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + this.name);
    }

}