package composite;

public class Developer implements Employee {

    private long empId;
    private String name;
    private String position;
    private double salary;

    public Developer(long empId, String name, String position, double salary) {
        this.empId = empId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " - " + name);
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
