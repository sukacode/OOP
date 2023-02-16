public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "ab";
        manager.sayHello("xx");

        var vp = new VicePresident();
        vp.name = "cd";
        vp.sayHello("zz");
    }
}
