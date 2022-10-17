package com.pilot.humanresource.server;

import com.pilot.humanresource.dao.EmployeeRepository;
import com.pilot.humanresource.helper.EmployeeHelper;
import com.pilot.humanresource.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServer
{
    @Autowired
    EmployeeHelper employeeHelper;

    public Employee getEmployeeByID(int id)
    { return this.employeeHelper.getEmployeeByID(id); }

    public List<Employee> getAllEmployees()
    { return this.employeeHelper.getAllEmployees(); }

    public int addEmployee(Employee employee)
    { return this.employeeHelper.addEmployee(employee); }

    public int updateEmployeeByID(int id, Employee employee)
    { return this.employeeHelper.updateEmployeeByID(id,employee); }

    public int deleteEmployeeByID(int id)
    { return this.employeeHelper.deleteEmployeeByID(id); }
}
