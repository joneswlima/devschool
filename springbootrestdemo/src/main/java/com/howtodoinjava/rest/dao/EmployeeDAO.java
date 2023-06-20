package com.howtodoinjava.rest.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Employee;
import com.howtodoinjava.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Clayton", "Marchetti", "clayton.marchetti@hotmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alan", "Mestezk", "alanmestezk98@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Matheus", "Marchetti", "matheuscmarchetti@gmail.com"));
        list.getEmployeeList().add(new Employee(4, "Claudine", "Cunha", "claudinedacunhacosta@gmail.com"));
        list.getEmployeeList().add(new Employee(5, "Jones", "Willian", "jojones.willian@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
