public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("PRI");
        manager.name = "ab";
        manager.sayHello("xx");

        var vp = new VicePresident("SEC");
        vp.name = "cd";
        vp.sayHello("zz");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
