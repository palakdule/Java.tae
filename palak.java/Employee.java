class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void showCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 101);
        Employee e2 = new Employee("Anita", 102);
        Employee e3 = new Employee("Karan", 103);

        Employee.showCount();
    }
}