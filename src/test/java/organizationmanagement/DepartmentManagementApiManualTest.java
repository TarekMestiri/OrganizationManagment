package organizationmanagement;

import org.junit.jupiter.api.Test;
import org.openapitools.client.api.DepartmentManagementApi;
import org.openapitools.client.model.Department;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentManagementApiManualTest {

    private final DepartmentManagementApi api = new DepartmentManagementApi();

    @Test
    public void testGetDepartments() throws Exception {
        List<Department> departments = api.departmentsGet();
        assertNotNull(departments);
        System.out.println("Departments count: " + departments.size());
    }
}
