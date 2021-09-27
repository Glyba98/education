package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface PublicUserResourceApi extends ApiClient.Api {


  /**
   * getAllPublicUsers
   * 
   * @param page Page number of the requested page (optional)
   * @param size Size of a page (optional)
   * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;UserDTO&gt;
   */
  @RequestLine("GET /api/users?page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<UserDTO> getAllPublicUsersUsingGET(@Param("page") Integer page, @Param("size") Integer size, @Param("sort") List<String> sort);

  /**
   * getAllPublicUsers
   * 
   * Note, this is equivalent to the other <code>getAllPublicUsersUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllPublicUsersUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number of the requested page (optional)</li>
   *   <li>size - Size of a page (optional)</li>
   *   <li>sort - Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;UserDTO&gt;
   */
  @RequestLine("GET /api/users?page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<UserDTO> getAllPublicUsersUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllPublicUsersUsingGET</code> method in a fluent style.
   */
  public static class GetAllPublicUsersUsingGETQueryParams extends HashMap<String, Object> {
    public GetAllPublicUsersUsingGETQueryParams page(final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPublicUsersUsingGETQueryParams size(final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPublicUsersUsingGETQueryParams sort(final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * getAuthorities
   * 
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /api/authorities")
  @Headers({
    "Accept: */*",
  })
  List<String> getAuthoritiesUsingGET();
}
