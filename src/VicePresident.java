public class VicePresident extends Manager {

    // access super constructor
    VicePresident(String name){
        super(name);
    }
    // method overriding
    void sayHello(String name){
        System.out.println("hi " + name + " ,my name is vp " + this.name);
    }

}
