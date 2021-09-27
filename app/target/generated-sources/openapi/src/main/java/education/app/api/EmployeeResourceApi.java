package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface EmployeeResourceApi extends ApiClient.Api {


  /**
   * createEmployee
   * 
   * @param employee  (optional)
   * @return Employee
   */
  @RequestLine("POST /api/employees")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Employee createEmployeeUsingPOST(Employee employee);

  /**
   * deleteEmployee
   * 
   * @param id id (required)
   */
  @RequestLine("DELETE /api/employees/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteEmployeeUsingDELETE(@Param("id") Long id);

  /**
   * getAllEmployees
   * 
   * @param page Page number of the requested page (optional)
   * @param size Size of a page (optional)
   * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;Employee&gt;
   */
  @RequestLine("GET /api/employees?page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<Employee> getAllEmployeesUsingGET(@Param("page") Integer page, @Param("size") Integer size, @Param("sort") List<String> sort);

  /**
   * getAllEmployees
   * 
   * Note, this is equivalent to the other <code>getAllEmployeesUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllEmployeesUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number of the requested page (optional)</li>
   *   <li>size - Size of a page (optional)</li>
   *   <li>sort - Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;Employee&gt;
   */
  @RequestLine("GET /api/employees?page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<Employee> getAllEmployeesUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllEmployeesUsingGET</code> method in a fluent style.
   */
  public static class GetAllEmployeesUsingGETQueryParams extends HashMap<String, Object> {
    public GetAllEmployeesUsingGETQueryParams page(final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllEmployeesUsingGETQueryParams size(final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllEmployeesUsingGETQueryParams sort(final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * getEmployee
   * 
   * @param id id (required)
   * @return Employee
   */
  @RequestLine("GET /api/employees/{id}")
  @Headers({
    "Accept: */*",
  })
  Employee getEmployeeUsingGET(@Param("id") Long id);

  /**
   * partialUpdateEmployee
   * 
   * @param id id (required)
   * @param employee  (optional)
   * @return Employee
   */
  @RequestLine("PATCH /api/employees/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Employee partialUpdateEmployeeUsingPATCH(@Param("id") Long id, Employee employee);

  /**
   * updateEmployee
   * 
   * @param id id (required)
   * @param employee  (optional)
   * @return Employee
   */
  @RequestLine("PUT /api/employees/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Employee updateEmployeeUsingPUT(@Param("id") Long id, Employee employee);
}
