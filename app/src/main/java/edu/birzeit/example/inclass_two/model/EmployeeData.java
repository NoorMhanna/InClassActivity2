package edu.birzeit.example.inclass_two.model;

import java.util.ArrayList;

public class EmployeeData {

    public ArrayList<Employee> AllEmp = new ArrayList<>() ;

    public void addEmp (String name , double salary , String type){
        AllEmp.add(new Employee(name,salary,type)) ;
    }

    public ArrayList<Employee> AllEmp(){
        return AllEmp ;
    }

}
