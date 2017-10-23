package Refactoring;

public class Engineer extends Employee{
    String salary;
    public Engineer(String name, String id, int grade,String position,String certification,String salary) {
        super(name, id, grade, position, certification);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
