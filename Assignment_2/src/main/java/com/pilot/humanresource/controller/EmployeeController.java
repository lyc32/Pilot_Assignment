package com.pilot.humanresource.controller;

import com.pilot.humanresource.dao.EmployeeRepository;
import com.pilot.humanresource.model.Employee;
import com.pilot.humanresource.server.EmployeeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeServer employeeServer;

    @RequestMapping(value = "/get_employee/{id}", method = RequestMethod.GET)
    public Employee getUserByID(@PathVariable int id)
    { return employeeServer.getEmployeeByID(id);}

    @GetMapping("/get_employee/all")
    public List<Employee> getAllUsers()
    { return employeeServer.getAllEmployees();}

    @PostMapping("/add_employee")
    public int addUser(@RequestBody Employee employee)
    { return this.employeeServer.addEmployee(employee); }

    @PutMapping(value = "/update_employee/{id}")
    public int updateEmployeeByID(@PathVariable int id, @RequestBody Employee employee)
    { return this.employeeServer.updateEmployeeByID(id, employee); }

    @DeleteMapping(value = "/delete_employee/{id}")
    public int deleteEmployeeByID(@PathVariable int id)
    { return this.employeeServer.deleteEmployeeByID(id); }
}
