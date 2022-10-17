package com.pilot.humanresource.controller;

import com.pilot.humanresource.dao.DepartmentRepository;
import com.pilot.humanresource.model.Department;
import com.pilot.humanresource.server.DepartmentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class DepartmentController
{
    @Autowired
    private DepartmentServer departmentServer;

    @GetMapping(value = "/get_department/{id}")
    public Department getUserByID(@PathVariable int id)
    { return this.departmentServer.getDepartmentByID(id);}

    @GetMapping("/get_department/all")
    public List<Department> getAllUsers()
    { return this.departmentServer.getAllDepartments();}

    @PostMapping("/add_department")
    public int addUser(@RequestBody Department department)
    { return this.departmentServer.addDepartment(department); }

    @PutMapping(value = "/update_department/{id}")
    public int updateEmployeeByID(@PathVariable int id, @RequestBody Department department)
    { return this.departmentServer.updateDepartmentByID(id, department); }

    @DeleteMapping(value = "/delete_department/{id}")
    public int deleteEmployeeByID(@PathVariable int id)
    { return this.departmentServer.deleteDepartmentByID(id); }

}
