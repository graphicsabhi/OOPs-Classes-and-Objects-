public class main {
    public static void main(String[] args) {

        // Create Objects
        person p1 = new person();
        p1.age = 23;
        p1.name = "satyam";

        person p2 = new person();
        p2.age = 25;
        p2.name = "Sobhraj";

        person p3 = new person();
        p3.age = 34;
        p3.name = "abhi";

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
        System.out.println(p3.age + " " + p3.name);

        p1.walk();
        p2.eat();
        p3.run();

    }
}

// Create Class

class person {
    String name;
    int age;

    // Adding Behaviour of classes

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");

    }
    void run() {
        System.out.println(name + " is running");
    }


}