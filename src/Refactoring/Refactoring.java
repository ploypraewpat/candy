package Refactoring;

/**
 * Created by praewpatjiradecha on 10/23/2017 AD.
 */
public class Refactoring {
    public boolean getploy(int ploy){
        if(ploy==1){
            return true;
        }else{
            return false;
        }
    }
    public class Employee{
        String _name;
        String _id;
        int _grade;
        public Employee(){

        }
    }
    public class Manager extends Employee{
        public Manager(String name,String id,int grade){
            _name = name;
            _id = id;
            _grade = grade;
        }
    }
}
