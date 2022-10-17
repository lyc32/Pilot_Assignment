package server;

import com.pilot.humanresource.dao.DepartmentRepository;
import com.pilot.humanresource.model.Department;
import com.pilot.humanresource.server.DepartmentServer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DepartmentServer.class)
public class DepartmentServerTest
{
    @MockBean
    DepartmentRepository departmentRepository;

    @Autowired
    DepartmentServer departmentServer;

    @Before
    public void beforeTest()
    {
        System.out.println("DepartmentServer Test: started");
    }

    @After
    public void afterTest()
    {
        System.out.println("DepartmentServer Test: end\n");
    }

    @Test
    public void testGetDepartmentByID()
    {
        System.out.println("Test DepartmentServer.GetDepartmentByID started");
        int id = 10;
        Department mockDepartment = new Department(10, "ACCOUNTING", "NEW YORK");
        when(departmentRepository.getDepartmentByID(id)).thenReturn(mockDepartment);
        Department department = departmentServer.getDepartmentByID(id);
        Assert.assertEquals(10, department.getDeptid());
        Assert.assertEquals("ACCOUNTING",department.getName());
        Assert.assertEquals("NEW YORK", department.getLoc());
        System.out.println("Test DepartmentServer.GetDepartmentByID end");
    }

    @Test
    public void testGetAllDepartments()
    {
        System.out.println("Test DepartmentServer.GetAllDepartments started");
        int id = 10;
        List<Department> mockDepartmentList = new ArrayList<>();
        mockDepartmentList.add(new Department(10, "ACCOUNTING", "NEW YORK"));
        mockDepartmentList.add(new Department(20, "RESEARCH", "DALLAS"));
        mockDepartmentList.add(new Department(20, "RESEARCH", "DALLAS"));
        when(departmentRepository.getAllDepartments()).thenReturn(mockDepartmentList);
        List<Department> departmentList = departmentServer.getAllDepartments();
        Assert.assertEquals(mockDepartmentList.size(), departmentList.size());
        System.out.println("Test DepartmentServer.GetAllDepartments end");
    }

    @Test
    public void testAddDepartment()
    {
        System.out.println("Test DepartmentServer.AddDepartment started");
        Department mockDepartment = new Department(10, "ACCOUNTING", "NEW YORK");
        when(departmentRepository.addDepartment(mockDepartment)).thenReturn(1);
        int success = departmentServer.addDepartment(mockDepartment);
        Assert.assertEquals(1, success);
        System.out.println("Test DepartmentServer.AddDepartment end");
    }

    @Test
    public void testUpdateDepartmentByID()
    {
        System.out.println("Test DepartmentServer.UpdateDepartmentByID started");
        Department mockDepartment = new Department(10, "ACCOUNTING", "NEW YORK");
        when(departmentRepository.updateDepartmentByID(10,mockDepartment)).thenReturn(1);
        int success = departmentServer.updateDepartmentByID(10,mockDepartment);
        Assert.assertEquals(1, success);
        System.out.println("Test DepartmentServer.UpdateDepartmentByID end");
    }

    @Test
    public void testDeleteDepartmentByID()
    {
        System.out.println("Test DepartmentServer.DeleteDepartmentByID started");
        when(departmentRepository.deleteDepartmentByID(10)).thenReturn(1);
        int success = departmentServer.deleteDepartmentByID(10);
        Assert.assertEquals(1, success);
        System.out.println("Test DepartmentServer.DeleteDepartmentByID end");
    }
}
