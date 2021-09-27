package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.Job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface JobResourceApi extends ApiClient.Api {


  /**
   * createJob
   * 
   * @param job  (optional)
   * @return Job
   */
  @RequestLine("POST /api/jobs")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Job createJobUsingPOST(Job job);

  /**
   * deleteJob
   * 
   * @param id id (required)
   */
  @RequestLine("DELETE /api/jobs/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteJobUsingDELETE(@Param("id") Long id);

  /**
   * getAllJobs
   * 
   * @param eagerload eagerload (optional)
   * @param page Page number of the requested page (optional)
   * @param size Size of a page (optional)
   * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;Job&gt;
   */
  @RequestLine("GET /api/jobs?eagerload={eagerload}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<Job> getAllJobsUsingGET(@Param("eagerload") Boolean eagerload, @Param("page") Integer page, @Param("size") Integer size, @Param("sort") List<String> sort);

  /**
   * getAllJobs
   * 
   * Note, this is equivalent to the other <code>getAllJobsUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllJobsUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>eagerload - eagerload (optional)</li>
   *   <li>page - Page number of the requested page (optional)</li>
   *   <li>size - Size of a page (optional)</li>
   *   <li>sort - Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;Job&gt;
   */
  @RequestLine("GET /api/jobs?eagerload={eagerload}&page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<Job> getAllJobsUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllJobsUsingGET</code> method in a fluent style.
   */
  public static class GetAllJobsUsingGETQueryParams extends HashMap<String, Object> {
    public GetAllJobsUsingGETQueryParams eagerload(final Boolean value) {
      put("eagerload", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobsUsingGETQueryParams page(final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobsUsingGETQueryParams size(final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobsUsingGETQueryParams sort(final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * getJob
   * 
   * @param id id (required)
   * @return Job
   */
  @RequestLine("GET /api/jobs/{id}")
  @Headers({
    "Accept: */*",
  })
  Job getJobUsingGET(@Param("id") Long id);

  /**
   * partialUpdateJob
   * 
   * @param id id (required)
   * @param job  (optional)
   * @return Job
   */
  @RequestLine("PATCH /api/jobs/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Job partialUpdateJobUsingPATCH(@Param("id") Long id, Job job);

  /**
   * updateJob
   * 
   * @param id id (required)
   * @param job  (optional)
   * @return Job
   */
  @RequestLine("PUT /api/jobs/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Job updateJobUsingPUT(@Param("id") Long id, Job job);
}
