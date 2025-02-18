class Employee {
    private String name;
    private int id;
    private String department;
    private int salary;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    Employee(String name, int id, String department,int salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
    void print() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        if(department!=null) {
            System.out.println("Department: "+department);
        }
        if(salary>0) {
            System.out.println("Salary: "+salary);
        }
    }
}
public class Que30{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aditya", 101);
        Employee emp2 = new Employee("Om", 102, "IT");
        Employee emp3 = new Employee("Shivam", 103, "Finance", 5000);
 
        emp1.print();
        emp2.print();
        emp3.print();
    }
}