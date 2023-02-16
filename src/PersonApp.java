public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("il", "pdt");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("alf");

        Person person2 = new Person("al", "bky");
        person2.sayHello("uyu");

        Person person3;
        person3 = new Person("ul");
        person3.sayHello("sans");


    }
}
