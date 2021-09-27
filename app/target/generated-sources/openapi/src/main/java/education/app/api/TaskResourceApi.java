package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface TaskResourceApi extends ApiClient.Api {


  /**
   * countTasks
   * 
   * @param descriptionContains  (optional)
   * @param descriptionDoesNotContain  (optional)
   * @param descriptionEquals  (optional)
   * @param descriptionIn  (optional)
   * @param descriptionNotEquals  (optional)
   * @param descriptionNotIn  (optional)
   * @param descriptionSpecified  (optional)
   * @param distinct  (optional)
   * @param idEquals  (optional)
   * @param idGreaterThan  (optional)
   * @param idGreaterThanOrEqual  (optional)
   * @param idIn  (optional)
   * @param idLessThan  (optional)
   * @param idLessThanOrEqual  (optional)
   * @param idNotEquals  (optional)
   * @param idNotIn  (optional)
   * @param idSpecified  (optional)
   * @param jobIdEquals  (optional)
   * @param jobIdGreaterThan  (optional)
   * @param jobIdGreaterThanOrEqual  (optional)
   * @param jobIdIn  (optional)
   * @param jobIdLessThan  (optional)
   * @param jobIdLessThanOrEqual  (optional)
   * @param jobIdNotEquals  (optional)
   * @param jobIdNotIn  (optional)
   * @param jobIdSpecified  (optional)
   * @param titleContains  (optional)
   * @param titleDoesNotContain  (optional)
   * @param titleEquals  (optional)
   * @param titleIn  (optional)
   * @param titleNotEquals  (optional)
   * @param titleNotIn  (optional)
   * @param titleSpecified  (optional)
   * @return Long
   */
  @RequestLine("GET /api/tasks/count?description.contains={descriptionContains}&description.doesNotContain={descriptionDoesNotContain}&description.equals={descriptionEquals}&description.in={descriptionIn}&description.notEquals={descriptionNotEquals}&description.notIn={descriptionNotIn}&description.specified={descriptionSpecified}&distinct={distinct}&id.equals={idEquals}&id.greaterThan={idGreaterThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.in={idIn}&id.lessThan={idLessThan}&id.lessThanOrEqual={idLessThanOrEqual}&id.notEquals={idNotEquals}&id.notIn={idNotIn}&id.specified={idSpecified}&jobId.equals={jobIdEquals}&jobId.greaterThan={jobIdGreaterThan}&jobId.greaterThanOrEqual={jobIdGreaterThanOrEqual}&jobId.in={jobIdIn}&jobId.lessThan={jobIdLessThan}&jobId.lessThanOrEqual={jobIdLessThanOrEqual}&jobId.notEquals={jobIdNotEquals}&jobId.notIn={jobIdNotIn}&jobId.specified={jobIdSpecified}&title.contains={titleContains}&title.doesNotContain={titleDoesNotContain}&title.equals={titleEquals}&title.in={titleIn}&title.notEquals={titleNotEquals}&title.notIn={titleNotIn}&title.specified={titleSpecified}")
  @Headers({
    "Accept: */*",
  })
  Long countTasksUsingGET(@Param("descriptionContains") String descriptionContains, @Param("descriptionDoesNotContain") String descriptionDoesNotContain, @Param("descriptionEquals") String descriptionEquals, @Param("descriptionIn") List<String> descriptionIn, @Param("descriptionNotEquals") String descriptionNotEquals, @Param("descriptionNotIn") List<String> descriptionNotIn, @Param("descriptionSpecified") Boolean descriptionSpecified, @Param("distinct") Boolean distinct, @Param("idEquals") Long idEquals, @Param("idGreaterThan") Long idGreaterThan, @Param("idGreaterThanOrEqual") Long idGreaterThanOrEqual, @Param("idIn") List<Long> idIn, @Param("idLessThan") Long idLessThan, @Param("idLessThanOrEqual") Long idLessThanOrEqual, @Param("idNotEquals") Long idNotEquals, @Param("idNotIn") List<Long> idNotIn, @Param("idSpecified") Boolean idSpecified, @Param("jobIdEquals") Long jobIdEquals, @Param("jobIdGreaterThan") Long jobIdGreaterThan, @Param("jobIdGreaterThanOrEqual") Long jobIdGreaterThanOrEqual, @Param("jobIdIn") List<Long> jobIdIn, @Param("jobIdLessThan") Long jobIdLessThan, @Param("jobIdLessThanOrEqual") Long jobIdLessThanOrEqual, @Param("jobIdNotEquals") Long jobIdNotEquals, @Param("jobIdNotIn") List<Long> jobIdNotIn, @Param("jobIdSpecified") Boolean jobIdSpecified, @Param("titleContains") String titleContains, @Param("titleDoesNotContain") String titleDoesNotContain, @Param("titleEquals") String titleEquals, @Param("titleIn") List<String> titleIn, @Param("titleNotEquals") String titleNotEquals, @Param("titleNotIn") List<String> titleNotIn, @Param("titleSpecified") Boolean titleSpecified);

  /**
   * countTasks
   * 
   * Note, this is equivalent to the other <code>countTasksUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountTasksUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>descriptionContains -  (optional)</li>
   *   <li>descriptionDoesNotContain -  (optional)</li>
   *   <li>descriptionEquals -  (optional)</li>
   *   <li>descriptionIn -  (optional)</li>
   *   <li>descriptionNotEquals -  (optional)</li>
   *   <li>descriptionNotIn -  (optional)</li>
   *   <li>descriptionSpecified -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   <li>idEquals -  (optional)</li>
   *   <li>idGreaterThan -  (optional)</li>
   *   <li>idGreaterThanOrEqual -  (optional)</li>
   *   <li>idIn -  (optional)</li>
   *   <li>idLessThan -  (optional)</li>
   *   <li>idLessThanOrEqual -  (optional)</li>
   *   <li>idNotEquals -  (optional)</li>
   *   <li>idNotIn -  (optional)</li>
   *   <li>idSpecified -  (optional)</li>
   *   <li>jobIdEquals -  (optional)</li>
   *   <li>jobIdGreaterThan -  (optional)</li>
   *   <li>jobIdGreaterThanOrEqual -  (optional)</li>
   *   <li>jobIdIn -  (optional)</li>
   *   <li>jobIdLessThan -  (optional)</li>
   *   <li>jobIdLessThanOrEqual -  (optional)</li>
   *   <li>jobIdNotEquals -  (optional)</li>
   *   <li>jobIdNotIn -  (optional)</li>
   *   <li>jobIdSpecified -  (optional)</li>
   *   <li>titleContains -  (optional)</li>
   *   <li>titleDoesNotContain -  (optional)</li>
   *   <li>titleEquals -  (optional)</li>
   *   <li>titleIn -  (optional)</li>
   *   <li>titleNotEquals -  (optional)</li>
   *   <li>titleNotIn -  (optional)</li>
   *   <li>titleSpecified -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/tasks/count?description.contains={descriptionContains}&description.doesNotContain={descriptionDoesNotContain}&description.equals={descriptionEquals}&description.in={descriptionIn}&description.notEquals={descriptionNotEquals}&description.notIn={descriptionNotIn}&description.specified={descriptionSpecified}&distinct={distinct}&id.equals={idEquals}&id.greaterThan={idGreaterThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.in={idIn}&id.lessThan={idLessThan}&id.lessThanOrEqual={idLessThanOrEqual}&id.notEquals={idNotEquals}&id.notIn={idNotIn}&id.specified={idSpecified}&jobId.equals={jobIdEquals}&jobId.greaterThan={jobIdGreaterThan}&jobId.greaterThanOrEqual={jobIdGreaterThanOrEqual}&jobId.in={jobIdIn}&jobId.lessThan={jobIdLessThan}&jobId.lessThanOrEqual={jobIdLessThanOrEqual}&jobId.notEquals={jobIdNotEquals}&jobId.notIn={jobIdNotIn}&jobId.specified={jobIdSpecified}&title.contains={titleContains}&title.doesNotContain={titleDoesNotContain}&title.equals={titleEquals}&title.in={titleIn}&title.notEquals={titleNotEquals}&title.notIn={titleNotIn}&title.specified={titleSpecified}")
  @Headers({
  "Accept: */*",
  })
  Long countTasksUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>countTasksUsingGET</code> method in a fluent style.
   */
  public static class CountTasksUsingGETQueryParams extends HashMap<String, Object> {
    public CountTasksUsingGETQueryParams descriptionContains(final String value) {
      put("description.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams descriptionDoesNotContain(final String value) {
      put("description.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams descriptionEquals(final String value) {
      put("description.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams descriptionIn(final List<String> value) {
      put("description.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountTasksUsingGETQueryParams descriptionNotEquals(final String value) {
      put("description.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams descriptionNotIn(final List<String> value) {
      put("description.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountTasksUsingGETQueryParams descriptionSpecified(final Boolean value) {
      put("description.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams distinct(final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams idEquals(final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams idGreaterThan(final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams idGreaterThanOrEqual(final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams idIn(final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountTasksUsingGETQueryParams idLessThan(final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams idLessThanOrEqual(final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams idNotEquals(final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams idNotIn(final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountTasksUsingGETQueryParams idSpecified(final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams jobIdEquals(final Long value) {
      put("jobId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams jobIdGreaterThan(final Long value) {
      put("jobId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams jobIdGreaterThanOrEqual(final Long value) {
      put("jobId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams jobIdIn(final List<Long> value) {
      put("jobId.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountTasksUsingGETQueryParams jobIdLessThan(final Long value) {
      put("jobId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams jobIdLessThanOrEqual(final Long value) {
      put("jobId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams jobIdNotEquals(final Long value) {
      put("jobId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams jobIdNotIn(final List<Long> value) {
      put("jobId.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountTasksUsingGETQueryParams jobIdSpecified(final Boolean value) {
      put("jobId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams titleContains(final String value) {
      put("title.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams titleDoesNotContain(final String value) {
      put("title.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams titleEquals(final String value) {
      put("title.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams titleIn(final List<String> value) {
      put("title.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountTasksUsingGETQueryParams titleNotEquals(final String value) {
      put("title.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTasksUsingGETQueryParams titleNotIn(final List<String> value) {
      put("title.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountTasksUsingGETQueryParams titleSpecified(final Boolean value) {
      put("title.specified", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * createTask
   * 
   * @param task  (optional)
   * @return Task
   */
  @RequestLine("POST /api/tasks")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Task createTaskUsingPOST(Task task);

  /**
   * deleteTask
   * 
   * @param id id (required)
   */
  @RequestLine("DELETE /api/tasks/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTaskUsingDELETE(@Param("id") Long id);

  /**
   * getAllTasks
   * 
   * @param descriptionContains  (optional)
   * @param descriptionDoesNotContain  (optional)
   * @param descriptionEquals  (optional)
   * @param descriptionIn  (optional)
   * @param descriptionNotEquals  (optional)
   * @param descriptionNotIn  (optional)
   * @param descriptionSpecified  (optional)
   * @param distinct  (optional)
   * @param idEquals  (optional)
   * @param idGreaterThan  (optional)
   * @param idGreaterThanOrEqual  (optional)
   * @param idIn  (optional)
   * @param idLessThan  (optional)
   * @param idLessThanOrEqual  (optional)
   * @param idNotEquals  (optional)
   * @param idNotIn  (optional)
   * @param idSpecified  (optional)
   * @param jobIdEquals  (optional)
   * @param jobIdGreaterThan  (optional)
   * @param jobIdGreaterThanOrEqual  (optional)
   * @param jobIdIn  (optional)
   * @param jobIdLessThan  (optional)
   * @param jobIdLessThanOrEqual  (optional)
   * @param jobIdNotEquals  (optional)
   * @param jobIdNotIn  (optional)
   * @param jobIdSpecified  (optional)
   * @param titleContains  (optional)
   * @param titleDoesNotContain  (optional)
   * @param titleEquals  (optional)
   * @param titleIn  (optional)
   * @param titleNotEquals  (optional)
   * @param titleNotIn  (optional)
   * @param titleSpecified  (optional)
   * @return List&lt;Task&gt;
   */
  @RequestLine("GET /api/tasks?description.contains={descriptionContains}&description.doesNotContain={descriptionDoesNotContain}&description.equals={descriptionEquals}&description.in={descriptionIn}&description.notEquals={descriptionNotEquals}&description.notIn={descriptionNotIn}&description.specified={descriptionSpecified}&distinct={distinct}&id.equals={idEquals}&id.greaterThan={idGreaterThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.in={idIn}&id.lessThan={idLessThan}&id.lessThanOrEqual={idLessThanOrEqual}&id.notEquals={idNotEquals}&id.notIn={idNotIn}&id.specified={idSpecified}&jobId.equals={jobIdEquals}&jobId.greaterThan={jobIdGreaterThan}&jobId.greaterThanOrEqual={jobIdGreaterThanOrEqual}&jobId.in={jobIdIn}&jobId.lessThan={jobIdLessThan}&jobId.lessThanOrEqual={jobIdLessThanOrEqual}&jobId.notEquals={jobIdNotEquals}&jobId.notIn={jobIdNotIn}&jobId.specified={jobIdSpecified}&title.contains={titleContains}&title.doesNotContain={titleDoesNotContain}&title.equals={titleEquals}&title.in={titleIn}&title.notEquals={titleNotEquals}&title.notIn={titleNotIn}&title.specified={titleSpecified}")
  @Headers({
    "Accept: */*",
  })
  List<Task> getAllTasksUsingGET(@Param("descriptionContains") String descriptionContains, @Param("descriptionDoesNotContain") String descriptionDoesNotContain, @Param("descriptionEquals") String descriptionEquals, @Param("descriptionIn") List<String> descriptionIn, @Param("descriptionNotEquals") String descriptionNotEquals, @Param("descriptionNotIn") List<String> descriptionNotIn, @Param("descriptionSpecified") Boolean descriptionSpecified, @Param("distinct") Boolean distinct, @Param("idEquals") Long idEquals, @Param("idGreaterThan") Long idGreaterThan, @Param("idGreaterThanOrEqual") Long idGreaterThanOrEqual, @Param("idIn") List<Long> idIn, @Param("idLessThan") Long idLessThan, @Param("idLessThanOrEqual") Long idLessThanOrEqual, @Param("idNotEquals") Long idNotEquals, @Param("idNotIn") List<Long> idNotIn, @Param("idSpecified") Boolean idSpecified, @Param("jobIdEquals") Long jobIdEquals, @Param("jobIdGreaterThan") Long jobIdGreaterThan, @Param("jobIdGreaterThanOrEqual") Long jobIdGreaterThanOrEqual, @Param("jobIdIn") List<Long> jobIdIn, @Param("jobIdLessThan") Long jobIdLessThan, @Param("jobIdLessThanOrEqual") Long jobIdLessThanOrEqual, @Param("jobIdNotEquals") Long jobIdNotEquals, @Param("jobIdNotIn") List<Long> jobIdNotIn, @Param("jobIdSpecified") Boolean jobIdSpecified, @Param("titleContains") String titleContains, @Param("titleDoesNotContain") String titleDoesNotContain, @Param("titleEquals") String titleEquals, @Param("titleIn") List<String> titleIn, @Param("titleNotEquals") String titleNotEquals, @Param("titleNotIn") List<String> titleNotIn, @Param("titleSpecified") Boolean titleSpecified);

  /**
   * getAllTasks
   * 
   * Note, this is equivalent to the other <code>getAllTasksUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllTasksUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>descriptionContains -  (optional)</li>
   *   <li>descriptionDoesNotContain -  (optional)</li>
   *   <li>descriptionEquals -  (optional)</li>
   *   <li>descriptionIn -  (optional)</li>
   *   <li>descriptionNotEquals -  (optional)</li>
   *   <li>descriptionNotIn -  (optional)</li>
   *   <li>descriptionSpecified -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   <li>idEquals -  (optional)</li>
   *   <li>idGreaterThan -  (optional)</li>
   *   <li>idGreaterThanOrEqual -  (optional)</li>
   *   <li>idIn -  (optional)</li>
   *   <li>idLessThan -  (optional)</li>
   *   <li>idLessThanOrEqual -  (optional)</li>
   *   <li>idNotEquals -  (optional)</li>
   *   <li>idNotIn -  (optional)</li>
   *   <li>idSpecified -  (optional)</li>
   *   <li>jobIdEquals -  (optional)</li>
   *   <li>jobIdGreaterThan -  (optional)</li>
   *   <li>jobIdGreaterThanOrEqual -  (optional)</li>
   *   <li>jobIdIn -  (optional)</li>
   *   <li>jobIdLessThan -  (optional)</li>
   *   <li>jobIdLessThanOrEqual -  (optional)</li>
   *   <li>jobIdNotEquals -  (optional)</li>
   *   <li>jobIdNotIn -  (optional)</li>
   *   <li>jobIdSpecified -  (optional)</li>
   *   <li>titleContains -  (optional)</li>
   *   <li>titleDoesNotContain -  (optional)</li>
   *   <li>titleEquals -  (optional)</li>
   *   <li>titleIn -  (optional)</li>
   *   <li>titleNotEquals -  (optional)</li>
   *   <li>titleNotIn -  (optional)</li>
   *   <li>titleSpecified -  (optional)</li>
   *   </ul>
   * @return List&lt;Task&gt;
   */
  @RequestLine("GET /api/tasks?description.contains={descriptionContains}&description.doesNotContain={descriptionDoesNotContain}&description.equals={descriptionEquals}&description.in={descriptionIn}&description.notEquals={descriptionNotEquals}&description.notIn={descriptionNotIn}&description.specified={descriptionSpecified}&distinct={distinct}&id.equals={idEquals}&id.greaterThan={idGreaterThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.in={idIn}&id.lessThan={idLessThan}&id.lessThanOrEqual={idLessThanOrEqual}&id.notEquals={idNotEquals}&id.notIn={idNotIn}&id.specified={idSpecified}&jobId.equals={jobIdEquals}&jobId.greaterThan={jobIdGreaterThan}&jobId.greaterThanOrEqual={jobIdGreaterThanOrEqual}&jobId.in={jobIdIn}&jobId.lessThan={jobIdLessThan}&jobId.lessThanOrEqual={jobIdLessThanOrEqual}&jobId.notEquals={jobIdNotEquals}&jobId.notIn={jobIdNotIn}&jobId.specified={jobIdSpecified}&title.contains={titleContains}&title.doesNotContain={titleDoesNotContain}&title.equals={titleEquals}&title.in={titleIn}&title.notEquals={titleNotEquals}&title.notIn={titleNotIn}&title.specified={titleSpecified}")
  @Headers({
  "Accept: */*",
  })
  List<Task> getAllTasksUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllTasksUsingGET</code> method in a fluent style.
   */
  public static class GetAllTasksUsingGETQueryParams extends HashMap<String, Object> {
    public GetAllTasksUsingGETQueryParams descriptionContains(final String value) {
      put("description.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams descriptionDoesNotContain(final String value) {
      put("description.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams descriptionEquals(final String value) {
      put("description.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams descriptionIn(final List<String> value) {
      put("description.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllTasksUsingGETQueryParams descriptionNotEquals(final String value) {
      put("description.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams descriptionNotIn(final List<String> value) {
      put("description.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllTasksUsingGETQueryParams descriptionSpecified(final Boolean value) {
      put("description.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams distinct(final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams idEquals(final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams idGreaterThan(final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams idGreaterThanOrEqual(final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams idIn(final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllTasksUsingGETQueryParams idLessThan(final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams idLessThanOrEqual(final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams idNotEquals(final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams idNotIn(final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllTasksUsingGETQueryParams idSpecified(final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams jobIdEquals(final Long value) {
      put("jobId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams jobIdGreaterThan(final Long value) {
      put("jobId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams jobIdGreaterThanOrEqual(final Long value) {
      put("jobId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams jobIdIn(final List<Long> value) {
      put("jobId.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllTasksUsingGETQueryParams jobIdLessThan(final Long value) {
      put("jobId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams jobIdLessThanOrEqual(final Long value) {
      put("jobId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams jobIdNotEquals(final Long value) {
      put("jobId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams jobIdNotIn(final List<Long> value) {
      put("jobId.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllTasksUsingGETQueryParams jobIdSpecified(final Boolean value) {
      put("jobId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams titleContains(final String value) {
      put("title.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams titleDoesNotContain(final String value) {
      put("title.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams titleEquals(final String value) {
      put("title.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams titleIn(final List<String> value) {
      put("title.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllTasksUsingGETQueryParams titleNotEquals(final String value) {
      put("title.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTasksUsingGETQueryParams titleNotIn(final List<String> value) {
      put("title.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllTasksUsingGETQueryParams titleSpecified(final Boolean value) {
      put("title.specified", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * getTask
   * 
   * @param id id (required)
   * @return Task
   */
  @RequestLine("GET /api/tasks/{id}")
  @Headers({
    "Accept: */*",
  })
  Task getTaskUsingGET(@Param("id") Long id);

  /**
   * partialUpdateTask
   * 
   * @param id id (required)
   * @param task  (optional)
   * @return Task
   */
  @RequestLine("PATCH /api/tasks/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Task partialUpdateTaskUsingPATCH(@Param("id") Long id, Task task);

  /**
   * updateTask
   * 
   * @param id id (required)
   * @param task  (optional)
   * @return Task
   */
  @RequestLine("PUT /api/tasks/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Task updateTaskUsingPUT(@Param("id") Long id, Task task);
}
