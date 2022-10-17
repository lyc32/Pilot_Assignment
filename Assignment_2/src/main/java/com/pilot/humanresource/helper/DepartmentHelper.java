package com.pilot.humanresource.helper;

import com.pilot.humanresource.dao.DepartmentRepository;
import com.pilot.humanresource.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentHelper
{
    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentHelper(DepartmentRepository departmentRepository)
    {
        this.departmentRepository = departmentRepository;
    }

    public Department getDepartmentByID(int id)
    {
        return departmentRepository.getDepartmentByID(id);
    }
    public List<Department> getAllDepartments(){
        return departmentRepository.getAllDepartments();
    }
    public int addDepartment(Department temp) {
        return departmentRepository.addDepartment(temp);
    }
    public int updateDepartmentByID(int id, Department temp) {
        return departmentRepository.updateDepartmentByID(id,temp);
    }

    public int deleteDepartmentByID(int id) {
        return departmentRepository.deleteDepartmentByID(id);
    }
}
