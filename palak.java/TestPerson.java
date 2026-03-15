class Person {
    void role() {
        System.out.println("I am a Person");
    }
}

class Employee extends Person {
    void role() {
        System.out.println("I am an Employee");
    }
}

class Manager extends Employee {
    void role() {
        System.out.println("I am a Manager");
    }
}

class TestPerson {
    public static void main(String[] args) {

        Person p;

        p = new Person();
        p.role();

        p = new Employee();
        p.role();

        p = new Manager();
        p.role();
    }
}