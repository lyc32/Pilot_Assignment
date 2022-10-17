package com.pilot.humanresource.server;

import com.pilot.humanresource.dao.DepartmentRepository;
import com.pilot.humanresource.helper.DepartmentHelper;
import com.pilot.humanresource.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentServer
{

    @Autowired
    private DepartmentHelper departmentHelper;

    public Department getDepartmentByID(int id)
    {
        return departmentHelper.getDepartmentByID(id);
    }
    public List<Department> getAllDepartments(){
        return departmentHelper.getAllDepartments();
    }
    public int addDepartment(Department temp) {
        return departmentHelper.addDepartment(temp);
    }
    public int updateDepartmentByID(int id, Department temp) {
        return departmentHelper.updateDepartmentByID(id,temp);
    }

    public int deleteDepartmentByID(int id) {
        return departmentHelper.deleteDepartmentByID(id);
    }
}
