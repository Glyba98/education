package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.AdminUserDTO;
import education.app.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface UserResourceApi extends ApiClient.Api {


  /**
   * createUser
   * 
   * @param adminUserDTO  (optional)
   * @return User
   */
  @RequestLine("POST /api/admin/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  User createUserUsingPOST(AdminUserDTO adminUserDTO);

  /**
   * deleteUser
   * 
   * @param login login (required)
   */
  @RequestLine("DELETE /api/admin/users/{login}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUserUsingDELETE(@Param("login") String login);

  /**
   * getAllUsers
   * 
   * @param page Page number of the requested page (optional)
   * @param size Size of a page (optional)
   * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;AdminUserDTO&gt;
   */
  @RequestLine("GET /api/admin/users?page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<AdminUserDTO> getAllUsersUsingGET(@Param("page") Integer page, @Param("size") Integer size, @Param("sort") List<String> sort);

  /**
   * getAllUsers
   * 
   * Note, this is equivalent to the other <code>getAllUsersUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllUsersUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number of the requested page (optional)</li>
   *   <li>size - Size of a page (optional)</li>
   *   <li>sort - Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;AdminUserDTO&gt;
   */
  @RequestLine("GET /api/admin/users?page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<AdminUserDTO> getAllUsersUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllUsersUsingGET</code> method in a fluent style.
   */
  public static class GetAllUsersUsingGETQueryParams extends HashMap<String, Object> {
    public GetAllUsersUsingGETQueryParams page(final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUsersUsingGETQueryParams size(final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUsersUsingGETQueryParams sort(final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * getUser
   * 
   * @param login login (required)
   * @return AdminUserDTO
   */
  @RequestLine("GET /api/admin/users/{login}")
  @Headers({
    "Accept: */*",
  })
  AdminUserDTO getUserUsingGET(@Param("login") String login);

  /**
   * updateUser
   * 
   * @param adminUserDTO  (optional)
   * @return AdminUserDTO
   */
  @RequestLine("PUT /api/admin/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  AdminUserDTO updateUserUsingPUT(AdminUserDTO adminUserDTO);
}
