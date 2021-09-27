package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.Department;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface DepartmentResourceApi extends ApiClient.Api {


  /**
   * createDepartment
   * 
   * @param department  (optional)
   * @return Department
   */
  @RequestLine("POST /api/departments")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Department createDepartmentUsingPOST(Department department);

  /**
   * deleteDepartment
   * 
   * @param id id (required)
   */
  @RequestLine("DELETE /api/departments/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDepartmentUsingDELETE(@Param("id") Long id);

  /**
   * getAllDepartments
   * 
   * @return List&lt;Department&gt;
   */
  @RequestLine("GET /api/departments")
  @Headers({
    "Accept: */*",
  })
  List<Department> getAllDepartmentsUsingGET();

  /**
   * getDepartment
   * 
   * @param id id (required)
   * @return Department
   */
  @RequestLine("GET /api/departments/{id}")
  @Headers({
    "Accept: */*",
  })
  Department getDepartmentUsingGET(@Param("id") Long id);

  /**
   * partialUpdateDepartment
   * 
   * @param id id (required)
   * @param department  (optional)
   * @return Department
   */
  @RequestLine("PATCH /api/departments/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Department partialUpdateDepartmentUsingPATCH(@Param("id") Long id, Department department);

  /**
   * updateDepartment
   * 
   * @param id id (required)
   * @param department  (optional)
   * @return Department
   */
  @RequestLine("PUT /api/departments/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Department updateDepartmentUsingPUT(@Param("id") Long id, Department department);
}
