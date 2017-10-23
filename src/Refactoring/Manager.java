package Refactoring;

class Manager extends Employee{
    public Manager(String name,String id,int grade){
        /*Original*/
//        _name = name;
//        _id = id;
//        _grade = grade;
        super(name,id,grade,"","");
    }
}