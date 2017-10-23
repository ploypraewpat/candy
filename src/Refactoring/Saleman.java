package Refactoring;

public class Saleman extends Employee{
    String money;
    String branch;
    public Saleman(String name, String id, int grade,String position,String money,String branch, String certification) {
        super(name, id, grade,position, certification);
        this.money= money;
        this.branch = branch;
    }

    public String getMoney() {
        return money;
    }
}
