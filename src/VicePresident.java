public class VicePresident extends Manager {

    // access super constructor
    // boleh akses 1 constructor / 2 constructor
    VicePresident(String name){
        super(name, null);
    }
    // method overriding
    void sayHello(String name){
        System.out.println("hi " + name + ", my name is vp " + this.name);
    }

}
