package com.pilot.humanresource.dao;

import com.pilot.humanresource.model.Department;
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
public class DepartmentRepository
{
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Department getDepartmentByID(int id)
    {
        String sql = "SELECT * FROM department WHERE deptid = :id";
        SqlParameterSource input = new MapSqlParameterSource("id",id);
        return this.namedParameterJdbcTemplate.queryForObject(sql, input,  new BeanPropertyRowMapper<>(Department.class));
    }

    public List<Department> getAllDepartments()
    {
        String sql = "SELECT * FROM department";
        return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper(Department.class));
    }

    public int addDepartment(Department department)
    {
        String sql = "INSERT INTO department(deptid, name, loc) " +
                "VALUES (:deptid, :name, :loc)";
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("deptid", department.getDeptid());
        input.addValue("name"  , department.getName());
        input.addValue("loc"   , department.getLoc());
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
    public int updateDepartmentByID(int id, Department department)
    {
        String sql = "UPDATE department SET deptid =:deptid, name =:name, loc =:loc WHERE deptid =:id";
        MapSqlParameterSource input = new MapSqlParameterSource();
        input.addValue("id", id);
        input.addValue("deptid", department.getDeptid());
        input.addValue("name"  , department.getName());
        input.addValue("loc"   , department.getLoc());
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
    public int deleteDepartmentByID(int id)
    {
        String sql = "DELETE FROM department WHERE deptid =:id";
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
