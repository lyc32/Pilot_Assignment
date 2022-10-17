package com.pilot.humanresource.helper;

import com.pilot.humanresource.dao.EmployeeRepository;
import com.pilot.humanresource.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeHelper
{
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeByID(int id)
    { return this.employeeRepository.getEmployeeByID(id); }

    public List<Employee> getAllEmployees()
    { return this.employeeRepository.getAllEmployees(); }

    public int addEmployee(Employee employee)
    { return this.employeeRepository.addEmployee(employee); }

    public int updateEmployeeByID(int id, Employee employee)
    { return this.employeeRepository.updateEmployeeByID(id,employee); }

    public int deleteEmployeeByID(int id)
    { return this.employeeRepository.deleteEmployeeByID(id); }
}
