package com.pilot.humanresource.dao;

import com.pilot.humanresource.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;


@Repository
public class EmployeeRepository
{
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Employee getEmployeeByID(int id)
    {
        String sql = "SELECT * FROM employee WHERE empid = :id";
        SqlParameterSource input = new MapSqlParameterSource("id",id);
        return this.namedParameterJdbcTemplate.queryForObject(sql, input,  new BeanPropertyRowMapper<>(Employee.class));
    }

    public List<Employee> getAllEmployees()
    {
        String sql = "SELECT * FROM employee";
        return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper(Employee.class));
    }

    public int addEmployee(Employee employee)
    {
        String sql = "INSERT INTO employee(empid, name, job, manager, hiredate, salary, deptid) " +
                    "VALUES (:empid, :name, :job, :manager, :hiredate, :salary, :deptid)";
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("empid", employee.getEmpid());
        input.addValue("name", employee.getName());
        input.addValue("job", employee.getJob());
        input.addValue("manager", employee.getManager());
        input.addValue("hiredate", employee.getHiredate());
        input.addValue("salary", employee.getSalary());
        input.addValue("deptid", employee.getDeptid());
        try
        {
            return this.namedParameterJdbcTemplate.update(sql, input);
        }
        catch (Exception e)
        {
            System.out.println(e);
            return 0;
        }
    }

    public int updateEmployeeByID(int id, Employee employee)
    {
        String sql = "UPDATE employee SET empid =:empid, name =:name, job =:job, manager =:manager, hiredate =:hiredate, salary =:salary, deptid =:deptid WHERE empid =:id";
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("id", id);
        input.addValue("empid", employee.getEmpid());
        input.addValue("name", employee.getName());
        input.addValue("job", employee.getJob());
        input.addValue("manager", employee.getManager());
        input.addValue("hiredate", employee.getHiredate());
        input.addValue("salary", employee.getSalary());
        input.addValue("deptid", employee.getDeptid());
        try
        {
            return this.namedParameterJdbcTemplate.update(sql, input);
        }
        catch (Exception e)
        {
            System.out.println(e);
            return 0;
        }
    }

    public int deleteEmployeeByID(int id)
    {
        String sql = "DELETE FROM employee WHERE deptid =:id";
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("id", id);
        try
        {
            return this.namedParameterJdbcTemplate.update(sql, input);
        }
        catch (Exception e)
        {
            System.out.println(e);
            return 0;
        }
    }
}
