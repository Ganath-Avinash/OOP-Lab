
public class E5 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Bob", 4000);
        System.out.println("Employee: " + emp.getName() + ", Salary: " + emp.getSalary());
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 3000) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be at least 3000.");
        }
    }
}

