package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.JobHistory;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface JobHistoryResourceApi extends ApiClient.Api {


  /**
   * countJobHistories
   * 
   * @param departmentIdEquals  (optional)
   * @param departmentIdGreaterThan  (optional)
   * @param departmentIdGreaterThanOrEqual  (optional)
   * @param departmentIdIn  (optional)
   * @param departmentIdLessThan  (optional)
   * @param departmentIdLessThanOrEqual  (optional)
   * @param departmentIdNotEquals  (optional)
   * @param departmentIdNotIn  (optional)
   * @param departmentIdSpecified  (optional)
   * @param distinct  (optional)
   * @param employeeIdEquals  (optional)
   * @param employeeIdGreaterThan  (optional)
   * @param employeeIdGreaterThanOrEqual  (optional)
   * @param employeeIdIn  (optional)
   * @param employeeIdLessThan  (optional)
   * @param employeeIdLessThanOrEqual  (optional)
   * @param employeeIdNotEquals  (optional)
   * @param employeeIdNotIn  (optional)
   * @param employeeIdSpecified  (optional)
   * @param endDateEquals  (optional)
   * @param endDateGreaterThan  (optional)
   * @param endDateGreaterThanOrEqual  (optional)
   * @param endDateIn0EpochSecond  (optional)
   * @param endDateIn0Nano  (optional)
   * @param endDateLessThan  (optional)
   * @param endDateLessThanOrEqual  (optional)
   * @param endDateNotEquals  (optional)
   * @param endDateNotIn0EpochSecond  (optional)
   * @param endDateNotIn0Nano  (optional)
   * @param endDateSpecified  (optional)
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
   * @param languageEquals  (optional)
   * @param languageIn  (optional)
   * @param languageNotEquals  (optional)
   * @param languageNotIn  (optional)
   * @param languageSpecified  (optional)
   * @param startDateEquals  (optional)
   * @param startDateGreaterThan  (optional)
   * @param startDateGreaterThanOrEqual  (optional)
   * @param startDateIn0EpochSecond  (optional)
   * @param startDateIn0Nano  (optional)
   * @param startDateLessThan  (optional)
   * @param startDateLessThanOrEqual  (optional)
   * @param startDateNotEquals  (optional)
   * @param startDateNotIn0EpochSecond  (optional)
   * @param startDateNotIn0Nano  (optional)
   * @param startDateSpecified  (optional)
   * @return Long
   */
  @RequestLine("GET /api/job-histories/count?departmentId.equals={departmentIdEquals}&departmentId.greaterThan={departmentIdGreaterThan}&departmentId.greaterThanOrEqual={departmentIdGreaterThanOrEqual}&departmentId.in={departmentIdIn}&departmentId.lessThan={departmentIdLessThan}&departmentId.lessThanOrEqual={departmentIdLessThanOrEqual}&departmentId.notEquals={departmentIdNotEquals}&departmentId.notIn={departmentIdNotIn}&departmentId.specified={departmentIdSpecified}&distinct={distinct}&employeeId.equals={employeeIdEquals}&employeeId.greaterThan={employeeIdGreaterThan}&employeeId.greaterThanOrEqual={employeeIdGreaterThanOrEqual}&employeeId.in={employeeIdIn}&employeeId.lessThan={employeeIdLessThan}&employeeId.lessThanOrEqual={employeeIdLessThanOrEqual}&employeeId.notEquals={employeeIdNotEquals}&employeeId.notIn={employeeIdNotIn}&employeeId.specified={employeeIdSpecified}&endDate.equals={endDateEquals}&endDate.greaterThan={endDateGreaterThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.in[0].epochSecond={endDateIn0EpochSecond}&endDate.in[0].nano={endDateIn0Nano}&endDate.lessThan={endDateLessThan}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.notEquals={endDateNotEquals}&endDate.notIn[0].epochSecond={endDateNotIn0EpochSecond}&endDate.notIn[0].nano={endDateNotIn0Nano}&endDate.specified={endDateSpecified}&id.equals={idEquals}&id.greaterThan={idGreaterThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.in={idIn}&id.lessThan={idLessThan}&id.lessThanOrEqual={idLessThanOrEqual}&id.notEquals={idNotEquals}&id.notIn={idNotIn}&id.specified={idSpecified}&jobId.equals={jobIdEquals}&jobId.greaterThan={jobIdGreaterThan}&jobId.greaterThanOrEqual={jobIdGreaterThanOrEqual}&jobId.in={jobIdIn}&jobId.lessThan={jobIdLessThan}&jobId.lessThanOrEqual={jobIdLessThanOrEqual}&jobId.notEquals={jobIdNotEquals}&jobId.notIn={jobIdNotIn}&jobId.specified={jobIdSpecified}&language.equals={languageEquals}&language.in={languageIn}&language.notEquals={languageNotEquals}&language.notIn={languageNotIn}&language.specified={languageSpecified}&startDate.equals={startDateEquals}&startDate.greaterThan={startDateGreaterThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.in[0].epochSecond={startDateIn0EpochSecond}&startDate.in[0].nano={startDateIn0Nano}&startDate.lessThan={startDateLessThan}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.notEquals={startDateNotEquals}&startDate.notIn[0].epochSecond={startDateNotIn0EpochSecond}&startDate.notIn[0].nano={startDateNotIn0Nano}&startDate.specified={startDateSpecified}")
  @Headers({
    "Accept: */*",
  })
  Long countJobHistoriesUsingGET(@Param("departmentIdEquals") Long departmentIdEquals, @Param("departmentIdGreaterThan") Long departmentIdGreaterThan, @Param("departmentIdGreaterThanOrEqual") Long departmentIdGreaterThanOrEqual, @Param("departmentIdIn") List<Long> departmentIdIn, @Param("departmentIdLessThan") Long departmentIdLessThan, @Param("departmentIdLessThanOrEqual") Long departmentIdLessThanOrEqual, @Param("departmentIdNotEquals") Long departmentIdNotEquals, @Param("departmentIdNotIn") List<Long> departmentIdNotIn, @Param("departmentIdSpecified") Boolean departmentIdSpecified, @Param("distinct") Boolean distinct, @Param("employeeIdEquals") Long employeeIdEquals, @Param("employeeIdGreaterThan") Long employeeIdGreaterThan, @Param("employeeIdGreaterThanOrEqual") Long employeeIdGreaterThanOrEqual, @Param("employeeIdIn") List<Long> employeeIdIn, @Param("employeeIdLessThan") Long employeeIdLessThan, @Param("employeeIdLessThanOrEqual") Long employeeIdLessThanOrEqual, @Param("employeeIdNotEquals") Long employeeIdNotEquals, @Param("employeeIdNotIn") List<Long> employeeIdNotIn, @Param("employeeIdSpecified") Boolean employeeIdSpecified, @Param("endDateEquals") OffsetDateTime endDateEquals, @Param("endDateGreaterThan") OffsetDateTime endDateGreaterThan, @Param("endDateGreaterThanOrEqual") OffsetDateTime endDateGreaterThanOrEqual, @Param("endDateIn0EpochSecond") Long endDateIn0EpochSecond, @Param("endDateIn0Nano") Integer endDateIn0Nano, @Param("endDateLessThan") OffsetDateTime endDateLessThan, @Param("endDateLessThanOrEqual") OffsetDateTime endDateLessThanOrEqual, @Param("endDateNotEquals") OffsetDateTime endDateNotEquals, @Param("endDateNotIn0EpochSecond") Long endDateNotIn0EpochSecond, @Param("endDateNotIn0Nano") Integer endDateNotIn0Nano, @Param("endDateSpecified") Boolean endDateSpecified, @Param("idEquals") Long idEquals, @Param("idGreaterThan") Long idGreaterThan, @Param("idGreaterThanOrEqual") Long idGreaterThanOrEqual, @Param("idIn") List<Long> idIn, @Param("idLessThan") Long idLessThan, @Param("idLessThanOrEqual") Long idLessThanOrEqual, @Param("idNotEquals") Long idNotEquals, @Param("idNotIn") List<Long> idNotIn, @Param("idSpecified") Boolean idSpecified, @Param("jobIdEquals") Long jobIdEquals, @Param("jobIdGreaterThan") Long jobIdGreaterThan, @Param("jobIdGreaterThanOrEqual") Long jobIdGreaterThanOrEqual, @Param("jobIdIn") List<Long> jobIdIn, @Param("jobIdLessThan") Long jobIdLessThan, @Param("jobIdLessThanOrEqual") Long jobIdLessThanOrEqual, @Param("jobIdNotEquals") Long jobIdNotEquals, @Param("jobIdNotIn") List<Long> jobIdNotIn, @Param("jobIdSpecified") Boolean jobIdSpecified, @Param("languageEquals") String languageEquals, @Param("languageIn") List<String> languageIn, @Param("languageNotEquals") String languageNotEquals, @Param("languageNotIn") List<String> languageNotIn, @Param("languageSpecified") Boolean languageSpecified, @Param("startDateEquals") OffsetDateTime startDateEquals, @Param("startDateGreaterThan") OffsetDateTime startDateGreaterThan, @Param("startDateGreaterThanOrEqual") OffsetDateTime startDateGreaterThanOrEqual, @Param("startDateIn0EpochSecond") Long startDateIn0EpochSecond, @Param("startDateIn0Nano") Integer startDateIn0Nano, @Param("startDateLessThan") OffsetDateTime startDateLessThan, @Param("startDateLessThanOrEqual") OffsetDateTime startDateLessThanOrEqual, @Param("startDateNotEquals") OffsetDateTime startDateNotEquals, @Param("startDateNotIn0EpochSecond") Long startDateNotIn0EpochSecond, @Param("startDateNotIn0Nano") Integer startDateNotIn0Nano, @Param("startDateSpecified") Boolean startDateSpecified);

  /**
   * countJobHistories
   * 
   * Note, this is equivalent to the other <code>countJobHistoriesUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountJobHistoriesUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>departmentIdEquals -  (optional)</li>
   *   <li>departmentIdGreaterThan -  (optional)</li>
   *   <li>departmentIdGreaterThanOrEqual -  (optional)</li>
   *   <li>departmentIdIn -  (optional)</li>
   *   <li>departmentIdLessThan -  (optional)</li>
   *   <li>departmentIdLessThanOrEqual -  (optional)</li>
   *   <li>departmentIdNotEquals -  (optional)</li>
   *   <li>departmentIdNotIn -  (optional)</li>
   *   <li>departmentIdSpecified -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   <li>employeeIdEquals -  (optional)</li>
   *   <li>employeeIdGreaterThan -  (optional)</li>
   *   <li>employeeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>employeeIdIn -  (optional)</li>
   *   <li>employeeIdLessThan -  (optional)</li>
   *   <li>employeeIdLessThanOrEqual -  (optional)</li>
   *   <li>employeeIdNotEquals -  (optional)</li>
   *   <li>employeeIdNotIn -  (optional)</li>
   *   <li>employeeIdSpecified -  (optional)</li>
   *   <li>endDateEquals -  (optional)</li>
   *   <li>endDateGreaterThan -  (optional)</li>
   *   <li>endDateGreaterThanOrEqual -  (optional)</li>
   *   <li>endDateIn0EpochSecond -  (optional)</li>
   *   <li>endDateIn0Nano -  (optional)</li>
   *   <li>endDateLessThan -  (optional)</li>
   *   <li>endDateLessThanOrEqual -  (optional)</li>
   *   <li>endDateNotEquals -  (optional)</li>
   *   <li>endDateNotIn0EpochSecond -  (optional)</li>
   *   <li>endDateNotIn0Nano -  (optional)</li>
   *   <li>endDateSpecified -  (optional)</li>
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
   *   <li>languageEquals -  (optional)</li>
   *   <li>languageIn -  (optional)</li>
   *   <li>languageNotEquals -  (optional)</li>
   *   <li>languageNotIn -  (optional)</li>
   *   <li>languageSpecified -  (optional)</li>
   *   <li>startDateEquals -  (optional)</li>
   *   <li>startDateGreaterThan -  (optional)</li>
   *   <li>startDateGreaterThanOrEqual -  (optional)</li>
   *   <li>startDateIn0EpochSecond -  (optional)</li>
   *   <li>startDateIn0Nano -  (optional)</li>
   *   <li>startDateLessThan -  (optional)</li>
   *   <li>startDateLessThanOrEqual -  (optional)</li>
   *   <li>startDateNotEquals -  (optional)</li>
   *   <li>startDateNotIn0EpochSecond -  (optional)</li>
   *   <li>startDateNotIn0Nano -  (optional)</li>
   *   <li>startDateSpecified -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/job-histories/count?departmentId.equals={departmentIdEquals}&departmentId.greaterThan={departmentIdGreaterThan}&departmentId.greaterThanOrEqual={departmentIdGreaterThanOrEqual}&departmentId.in={departmentIdIn}&departmentId.lessThan={departmentIdLessThan}&departmentId.lessThanOrEqual={departmentIdLessThanOrEqual}&departmentId.notEquals={departmentIdNotEquals}&departmentId.notIn={departmentIdNotIn}&departmentId.specified={departmentIdSpecified}&distinct={distinct}&employeeId.equals={employeeIdEquals}&employeeId.greaterThan={employeeIdGreaterThan}&employeeId.greaterThanOrEqual={employeeIdGreaterThanOrEqual}&employeeId.in={employeeIdIn}&employeeId.lessThan={employeeIdLessThan}&employeeId.lessThanOrEqual={employeeIdLessThanOrEqual}&employeeId.notEquals={employeeIdNotEquals}&employeeId.notIn={employeeIdNotIn}&employeeId.specified={employeeIdSpecified}&endDate.equals={endDateEquals}&endDate.greaterThan={endDateGreaterThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.in[0].epochSecond={endDateIn0EpochSecond}&endDate.in[0].nano={endDateIn0Nano}&endDate.lessThan={endDateLessThan}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.notEquals={endDateNotEquals}&endDate.notIn[0].epochSecond={endDateNotIn0EpochSecond}&endDate.notIn[0].nano={endDateNotIn0Nano}&endDate.specified={endDateSpecified}&id.equals={idEquals}&id.greaterThan={idGreaterThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.in={idIn}&id.lessThan={idLessThan}&id.lessThanOrEqual={idLessThanOrEqual}&id.notEquals={idNotEquals}&id.notIn={idNotIn}&id.specified={idSpecified}&jobId.equals={jobIdEquals}&jobId.greaterThan={jobIdGreaterThan}&jobId.greaterThanOrEqual={jobIdGreaterThanOrEqual}&jobId.in={jobIdIn}&jobId.lessThan={jobIdLessThan}&jobId.lessThanOrEqual={jobIdLessThanOrEqual}&jobId.notEquals={jobIdNotEquals}&jobId.notIn={jobIdNotIn}&jobId.specified={jobIdSpecified}&language.equals={languageEquals}&language.in={languageIn}&language.notEquals={languageNotEquals}&language.notIn={languageNotIn}&language.specified={languageSpecified}&startDate.equals={startDateEquals}&startDate.greaterThan={startDateGreaterThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.in[0].epochSecond={startDateIn0EpochSecond}&startDate.in[0].nano={startDateIn0Nano}&startDate.lessThan={startDateLessThan}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.notEquals={startDateNotEquals}&startDate.notIn[0].epochSecond={startDateNotIn0EpochSecond}&startDate.notIn[0].nano={startDateNotIn0Nano}&startDate.specified={startDateSpecified}")
  @Headers({
  "Accept: */*",
  })
  Long countJobHistoriesUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>countJobHistoriesUsingGET</code> method in a fluent style.
   */
  public static class CountJobHistoriesUsingGETQueryParams extends HashMap<String, Object> {
    public CountJobHistoriesUsingGETQueryParams departmentIdEquals(final Long value) {
      put("departmentId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams departmentIdGreaterThan(final Long value) {
      put("departmentId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams departmentIdGreaterThanOrEqual(final Long value) {
      put("departmentId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams departmentIdIn(final List<Long> value) {
      put("departmentId.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams departmentIdLessThan(final Long value) {
      put("departmentId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams departmentIdLessThanOrEqual(final Long value) {
      put("departmentId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams departmentIdNotEquals(final Long value) {
      put("departmentId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams departmentIdNotIn(final List<Long> value) {
      put("departmentId.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams departmentIdSpecified(final Boolean value) {
      put("departmentId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams distinct(final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams employeeIdEquals(final Long value) {
      put("employeeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams employeeIdGreaterThan(final Long value) {
      put("employeeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams employeeIdGreaterThanOrEqual(final Long value) {
      put("employeeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams employeeIdIn(final List<Long> value) {
      put("employeeId.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams employeeIdLessThan(final Long value) {
      put("employeeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams employeeIdLessThanOrEqual(final Long value) {
      put("employeeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams employeeIdNotEquals(final Long value) {
      put("employeeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams employeeIdNotIn(final List<Long> value) {
      put("employeeId.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams employeeIdSpecified(final Boolean value) {
      put("employeeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateEquals(final OffsetDateTime value) {
      put("endDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateGreaterThan(final OffsetDateTime value) {
      put("endDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateGreaterThanOrEqual(final OffsetDateTime value) {
      put("endDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateIn0EpochSecond(final Long value) {
      put("endDate.in[0].epochSecond", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateIn0Nano(final Integer value) {
      put("endDate.in[0].nano", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateLessThan(final OffsetDateTime value) {
      put("endDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateLessThanOrEqual(final OffsetDateTime value) {
      put("endDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateNotEquals(final OffsetDateTime value) {
      put("endDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateNotIn0EpochSecond(final Long value) {
      put("endDate.notIn[0].epochSecond", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateNotIn0Nano(final Integer value) {
      put("endDate.notIn[0].nano", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams endDateSpecified(final Boolean value) {
      put("endDate.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams idEquals(final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams idGreaterThan(final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams idGreaterThanOrEqual(final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams idIn(final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams idLessThan(final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams idLessThanOrEqual(final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams idNotEquals(final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams idNotIn(final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams idSpecified(final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams jobIdEquals(final Long value) {
      put("jobId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams jobIdGreaterThan(final Long value) {
      put("jobId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams jobIdGreaterThanOrEqual(final Long value) {
      put("jobId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams jobIdIn(final List<Long> value) {
      put("jobId.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams jobIdLessThan(final Long value) {
      put("jobId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams jobIdLessThanOrEqual(final Long value) {
      put("jobId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams jobIdNotEquals(final Long value) {
      put("jobId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams jobIdNotIn(final List<Long> value) {
      put("jobId.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams jobIdSpecified(final Boolean value) {
      put("jobId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams languageEquals(final String value) {
      put("language.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams languageIn(final List<String> value) {
      put("language.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams languageNotEquals(final String value) {
      put("language.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams languageNotIn(final List<String> value) {
      put("language.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams languageSpecified(final Boolean value) {
      put("language.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateEquals(final OffsetDateTime value) {
      put("startDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateGreaterThan(final OffsetDateTime value) {
      put("startDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateGreaterThanOrEqual(final OffsetDateTime value) {
      put("startDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateIn0EpochSecond(final Long value) {
      put("startDate.in[0].epochSecond", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateIn0Nano(final Integer value) {
      put("startDate.in[0].nano", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateLessThan(final OffsetDateTime value) {
      put("startDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateLessThanOrEqual(final OffsetDateTime value) {
      put("startDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateNotEquals(final OffsetDateTime value) {
      put("startDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateNotIn0EpochSecond(final Long value) {
      put("startDate.notIn[0].epochSecond", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateNotIn0Nano(final Integer value) {
      put("startDate.notIn[0].nano", EncodingUtils.encode(value));
      return this;
    }
    public CountJobHistoriesUsingGETQueryParams startDateSpecified(final Boolean value) {
      put("startDate.specified", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * createJobHistory
   * 
   * @param jobHistory  (optional)
   * @return JobHistory
   */
  @RequestLine("POST /api/job-histories")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  JobHistory createJobHistoryUsingPOST(JobHistory jobHistory);

  /**
   * deleteJobHistory
   * 
   * @param id id (required)
   */
  @RequestLine("DELETE /api/job-histories/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteJobHistoryUsingDELETE(@Param("id") Long id);

  /**
   * getAllJobHistories
   * 
   * @param departmentIdEquals  (optional)
   * @param departmentIdGreaterThan  (optional)
   * @param departmentIdGreaterThanOrEqual  (optional)
   * @param departmentIdIn  (optional)
   * @param departmentIdLessThan  (optional)
   * @param departmentIdLessThanOrEqual  (optional)
   * @param departmentIdNotEquals  (optional)
   * @param departmentIdNotIn  (optional)
   * @param departmentIdSpecified  (optional)
   * @param distinct  (optional)
   * @param employeeIdEquals  (optional)
   * @param employeeIdGreaterThan  (optional)
   * @param employeeIdGreaterThanOrEqual  (optional)
   * @param employeeIdIn  (optional)
   * @param employeeIdLessThan  (optional)
   * @param employeeIdLessThanOrEqual  (optional)
   * @param employeeIdNotEquals  (optional)
   * @param employeeIdNotIn  (optional)
   * @param employeeIdSpecified  (optional)
   * @param endDateEquals  (optional)
   * @param endDateGreaterThan  (optional)
   * @param endDateGreaterThanOrEqual  (optional)
   * @param endDateIn0EpochSecond  (optional)
   * @param endDateIn0Nano  (optional)
   * @param endDateLessThan  (optional)
   * @param endDateLessThanOrEqual  (optional)
   * @param endDateNotEquals  (optional)
   * @param endDateNotIn0EpochSecond  (optional)
   * @param endDateNotIn0Nano  (optional)
   * @param endDateSpecified  (optional)
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
   * @param languageEquals  (optional)
   * @param languageIn  (optional)
   * @param languageNotEquals  (optional)
   * @param languageNotIn  (optional)
   * @param languageSpecified  (optional)
   * @param page Page number of the requested page (optional)
   * @param size Size of a page (optional)
   * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @param startDateEquals  (optional)
   * @param startDateGreaterThan  (optional)
   * @param startDateGreaterThanOrEqual  (optional)
   * @param startDateIn0EpochSecond  (optional)
   * @param startDateIn0Nano  (optional)
   * @param startDateLessThan  (optional)
   * @param startDateLessThanOrEqual  (optional)
   * @param startDateNotEquals  (optional)
   * @param startDateNotIn0EpochSecond  (optional)
   * @param startDateNotIn0Nano  (optional)
   * @param startDateSpecified  (optional)
   * @return List&lt;JobHistory&gt;
   */
  @RequestLine("GET /api/job-histories?departmentId.equals={departmentIdEquals}&departmentId.greaterThan={departmentIdGreaterThan}&departmentId.greaterThanOrEqual={departmentIdGreaterThanOrEqual}&departmentId.in={departmentIdIn}&departmentId.lessThan={departmentIdLessThan}&departmentId.lessThanOrEqual={departmentIdLessThanOrEqual}&departmentId.notEquals={departmentIdNotEquals}&departmentId.notIn={departmentIdNotIn}&departmentId.specified={departmentIdSpecified}&distinct={distinct}&employeeId.equals={employeeIdEquals}&employeeId.greaterThan={employeeIdGreaterThan}&employeeId.greaterThanOrEqual={employeeIdGreaterThanOrEqual}&employeeId.in={employeeIdIn}&employeeId.lessThan={employeeIdLessThan}&employeeId.lessThanOrEqual={employeeIdLessThanOrEqual}&employeeId.notEquals={employeeIdNotEquals}&employeeId.notIn={employeeIdNotIn}&employeeId.specified={employeeIdSpecified}&endDate.equals={endDateEquals}&endDate.greaterThan={endDateGreaterThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.in[0].epochSecond={endDateIn0EpochSecond}&endDate.in[0].nano={endDateIn0Nano}&endDate.lessThan={endDateLessThan}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.notEquals={endDateNotEquals}&endDate.notIn[0].epochSecond={endDateNotIn0EpochSecond}&endDate.notIn[0].nano={endDateNotIn0Nano}&endDate.specified={endDateSpecified}&id.equals={idEquals}&id.greaterThan={idGreaterThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.in={idIn}&id.lessThan={idLessThan}&id.lessThanOrEqual={idLessThanOrEqual}&id.notEquals={idNotEquals}&id.notIn={idNotIn}&id.specified={idSpecified}&jobId.equals={jobIdEquals}&jobId.greaterThan={jobIdGreaterThan}&jobId.greaterThanOrEqual={jobIdGreaterThanOrEqual}&jobId.in={jobIdIn}&jobId.lessThan={jobIdLessThan}&jobId.lessThanOrEqual={jobIdLessThanOrEqual}&jobId.notEquals={jobIdNotEquals}&jobId.notIn={jobIdNotIn}&jobId.specified={jobIdSpecified}&language.equals={languageEquals}&language.in={languageIn}&language.notEquals={languageNotEquals}&language.notIn={languageNotIn}&language.specified={languageSpecified}&page={page}&size={size}&sort={sort}&startDate.equals={startDateEquals}&startDate.greaterThan={startDateGreaterThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.in[0].epochSecond={startDateIn0EpochSecond}&startDate.in[0].nano={startDateIn0Nano}&startDate.lessThan={startDateLessThan}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.notEquals={startDateNotEquals}&startDate.notIn[0].epochSecond={startDateNotIn0EpochSecond}&startDate.notIn[0].nano={startDateNotIn0Nano}&startDate.specified={startDateSpecified}")
  @Headers({
    "Accept: */*",
  })
  List<JobHistory> getAllJobHistoriesUsingGET(@Param("departmentIdEquals") Long departmentIdEquals, @Param("departmentIdGreaterThan") Long departmentIdGreaterThan, @Param("departmentIdGreaterThanOrEqual") Long departmentIdGreaterThanOrEqual, @Param("departmentIdIn") List<Long> departmentIdIn, @Param("departmentIdLessThan") Long departmentIdLessThan, @Param("departmentIdLessThanOrEqual") Long departmentIdLessThanOrEqual, @Param("departmentIdNotEquals") Long departmentIdNotEquals, @Param("departmentIdNotIn") List<Long> departmentIdNotIn, @Param("departmentIdSpecified") Boolean departmentIdSpecified, @Param("distinct") Boolean distinct, @Param("employeeIdEquals") Long employeeIdEquals, @Param("employeeIdGreaterThan") Long employeeIdGreaterThan, @Param("employeeIdGreaterThanOrEqual") Long employeeIdGreaterThanOrEqual, @Param("employeeIdIn") List<Long> employeeIdIn, @Param("employeeIdLessThan") Long employeeIdLessThan, @Param("employeeIdLessThanOrEqual") Long employeeIdLessThanOrEqual, @Param("employeeIdNotEquals") Long employeeIdNotEquals, @Param("employeeIdNotIn") List<Long> employeeIdNotIn, @Param("employeeIdSpecified") Boolean employeeIdSpecified, @Param("endDateEquals") OffsetDateTime endDateEquals, @Param("endDateGreaterThan") OffsetDateTime endDateGreaterThan, @Param("endDateGreaterThanOrEqual") OffsetDateTime endDateGreaterThanOrEqual, @Param("endDateIn0EpochSecond") Long endDateIn0EpochSecond, @Param("endDateIn0Nano") Integer endDateIn0Nano, @Param("endDateLessThan") OffsetDateTime endDateLessThan, @Param("endDateLessThanOrEqual") OffsetDateTime endDateLessThanOrEqual, @Param("endDateNotEquals") OffsetDateTime endDateNotEquals, @Param("endDateNotIn0EpochSecond") Long endDateNotIn0EpochSecond, @Param("endDateNotIn0Nano") Integer endDateNotIn0Nano, @Param("endDateSpecified") Boolean endDateSpecified, @Param("idEquals") Long idEquals, @Param("idGreaterThan") Long idGreaterThan, @Param("idGreaterThanOrEqual") Long idGreaterThanOrEqual, @Param("idIn") List<Long> idIn, @Param("idLessThan") Long idLessThan, @Param("idLessThanOrEqual") Long idLessThanOrEqual, @Param("idNotEquals") Long idNotEquals, @Param("idNotIn") List<Long> idNotIn, @Param("idSpecified") Boolean idSpecified, @Param("jobIdEquals") Long jobIdEquals, @Param("jobIdGreaterThan") Long jobIdGreaterThan, @Param("jobIdGreaterThanOrEqual") Long jobIdGreaterThanOrEqual, @Param("jobIdIn") List<Long> jobIdIn, @Param("jobIdLessThan") Long jobIdLessThan, @Param("jobIdLessThanOrEqual") Long jobIdLessThanOrEqual, @Param("jobIdNotEquals") Long jobIdNotEquals, @Param("jobIdNotIn") List<Long> jobIdNotIn, @Param("jobIdSpecified") Boolean jobIdSpecified, @Param("languageEquals") String languageEquals, @Param("languageIn") List<String> languageIn, @Param("languageNotEquals") String languageNotEquals, @Param("languageNotIn") List<String> languageNotIn, @Param("languageSpecified") Boolean languageSpecified, @Param("page") Integer page, @Param("size") Integer size, @Param("sort") List<String> sort, @Param("startDateEquals") OffsetDateTime startDateEquals, @Param("startDateGreaterThan") OffsetDateTime startDateGreaterThan, @Param("startDateGreaterThanOrEqual") OffsetDateTime startDateGreaterThanOrEqual, @Param("startDateIn0EpochSecond") Long startDateIn0EpochSecond, @Param("startDateIn0Nano") Integer startDateIn0Nano, @Param("startDateLessThan") OffsetDateTime startDateLessThan, @Param("startDateLessThanOrEqual") OffsetDateTime startDateLessThanOrEqual, @Param("startDateNotEquals") OffsetDateTime startDateNotEquals, @Param("startDateNotIn0EpochSecond") Long startDateNotIn0EpochSecond, @Param("startDateNotIn0Nano") Integer startDateNotIn0Nano, @Param("startDateSpecified") Boolean startDateSpecified);

  /**
   * getAllJobHistories
   * 
   * Note, this is equivalent to the other <code>getAllJobHistoriesUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllJobHistoriesUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>departmentIdEquals -  (optional)</li>
   *   <li>departmentIdGreaterThan -  (optional)</li>
   *   <li>departmentIdGreaterThanOrEqual -  (optional)</li>
   *   <li>departmentIdIn -  (optional)</li>
   *   <li>departmentIdLessThan -  (optional)</li>
   *   <li>departmentIdLessThanOrEqual -  (optional)</li>
   *   <li>departmentIdNotEquals -  (optional)</li>
   *   <li>departmentIdNotIn -  (optional)</li>
   *   <li>departmentIdSpecified -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   <li>employeeIdEquals -  (optional)</li>
   *   <li>employeeIdGreaterThan -  (optional)</li>
   *   <li>employeeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>employeeIdIn -  (optional)</li>
   *   <li>employeeIdLessThan -  (optional)</li>
   *   <li>employeeIdLessThanOrEqual -  (optional)</li>
   *   <li>employeeIdNotEquals -  (optional)</li>
   *   <li>employeeIdNotIn -  (optional)</li>
   *   <li>employeeIdSpecified -  (optional)</li>
   *   <li>endDateEquals -  (optional)</li>
   *   <li>endDateGreaterThan -  (optional)</li>
   *   <li>endDateGreaterThanOrEqual -  (optional)</li>
   *   <li>endDateIn0EpochSecond -  (optional)</li>
   *   <li>endDateIn0Nano -  (optional)</li>
   *   <li>endDateLessThan -  (optional)</li>
   *   <li>endDateLessThanOrEqual -  (optional)</li>
   *   <li>endDateNotEquals -  (optional)</li>
   *   <li>endDateNotIn0EpochSecond -  (optional)</li>
   *   <li>endDateNotIn0Nano -  (optional)</li>
   *   <li>endDateSpecified -  (optional)</li>
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
   *   <li>languageEquals -  (optional)</li>
   *   <li>languageIn -  (optional)</li>
   *   <li>languageNotEquals -  (optional)</li>
   *   <li>languageNotIn -  (optional)</li>
   *   <li>languageSpecified -  (optional)</li>
   *   <li>page - Page number of the requested page (optional)</li>
   *   <li>size - Size of a page (optional)</li>
   *   <li>sort - Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   <li>startDateEquals -  (optional)</li>
   *   <li>startDateGreaterThan -  (optional)</li>
   *   <li>startDateGreaterThanOrEqual -  (optional)</li>
   *   <li>startDateIn0EpochSecond -  (optional)</li>
   *   <li>startDateIn0Nano -  (optional)</li>
   *   <li>startDateLessThan -  (optional)</li>
   *   <li>startDateLessThanOrEqual -  (optional)</li>
   *   <li>startDateNotEquals -  (optional)</li>
   *   <li>startDateNotIn0EpochSecond -  (optional)</li>
   *   <li>startDateNotIn0Nano -  (optional)</li>
   *   <li>startDateSpecified -  (optional)</li>
   *   </ul>
   * @return List&lt;JobHistory&gt;
   */
  @RequestLine("GET /api/job-histories?departmentId.equals={departmentIdEquals}&departmentId.greaterThan={departmentIdGreaterThan}&departmentId.greaterThanOrEqual={departmentIdGreaterThanOrEqual}&departmentId.in={departmentIdIn}&departmentId.lessThan={departmentIdLessThan}&departmentId.lessThanOrEqual={departmentIdLessThanOrEqual}&departmentId.notEquals={departmentIdNotEquals}&departmentId.notIn={departmentIdNotIn}&departmentId.specified={departmentIdSpecified}&distinct={distinct}&employeeId.equals={employeeIdEquals}&employeeId.greaterThan={employeeIdGreaterThan}&employeeId.greaterThanOrEqual={employeeIdGreaterThanOrEqual}&employeeId.in={employeeIdIn}&employeeId.lessThan={employeeIdLessThan}&employeeId.lessThanOrEqual={employeeIdLessThanOrEqual}&employeeId.notEquals={employeeIdNotEquals}&employeeId.notIn={employeeIdNotIn}&employeeId.specified={employeeIdSpecified}&endDate.equals={endDateEquals}&endDate.greaterThan={endDateGreaterThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.in[0].epochSecond={endDateIn0EpochSecond}&endDate.in[0].nano={endDateIn0Nano}&endDate.lessThan={endDateLessThan}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.notEquals={endDateNotEquals}&endDate.notIn[0].epochSecond={endDateNotIn0EpochSecond}&endDate.notIn[0].nano={endDateNotIn0Nano}&endDate.specified={endDateSpecified}&id.equals={idEquals}&id.greaterThan={idGreaterThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.in={idIn}&id.lessThan={idLessThan}&id.lessThanOrEqual={idLessThanOrEqual}&id.notEquals={idNotEquals}&id.notIn={idNotIn}&id.specified={idSpecified}&jobId.equals={jobIdEquals}&jobId.greaterThan={jobIdGreaterThan}&jobId.greaterThanOrEqual={jobIdGreaterThanOrEqual}&jobId.in={jobIdIn}&jobId.lessThan={jobIdLessThan}&jobId.lessThanOrEqual={jobIdLessThanOrEqual}&jobId.notEquals={jobIdNotEquals}&jobId.notIn={jobIdNotIn}&jobId.specified={jobIdSpecified}&language.equals={languageEquals}&language.in={languageIn}&language.notEquals={languageNotEquals}&language.notIn={languageNotIn}&language.specified={languageSpecified}&page={page}&size={size}&sort={sort}&startDate.equals={startDateEquals}&startDate.greaterThan={startDateGreaterThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.in[0].epochSecond={startDateIn0EpochSecond}&startDate.in[0].nano={startDateIn0Nano}&startDate.lessThan={startDateLessThan}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.notEquals={startDateNotEquals}&startDate.notIn[0].epochSecond={startDateNotIn0EpochSecond}&startDate.notIn[0].nano={startDateNotIn0Nano}&startDate.specified={startDateSpecified}")
  @Headers({
  "Accept: */*",
  })
  List<JobHistory> getAllJobHistoriesUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllJobHistoriesUsingGET</code> method in a fluent style.
   */
  public static class GetAllJobHistoriesUsingGETQueryParams extends HashMap<String, Object> {
    public GetAllJobHistoriesUsingGETQueryParams departmentIdEquals(final Long value) {
      put("departmentId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams departmentIdGreaterThan(final Long value) {
      put("departmentId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams departmentIdGreaterThanOrEqual(final Long value) {
      put("departmentId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams departmentIdIn(final List<Long> value) {
      put("departmentId.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams departmentIdLessThan(final Long value) {
      put("departmentId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams departmentIdLessThanOrEqual(final Long value) {
      put("departmentId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams departmentIdNotEquals(final Long value) {
      put("departmentId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams departmentIdNotIn(final List<Long> value) {
      put("departmentId.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams departmentIdSpecified(final Boolean value) {
      put("departmentId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams distinct(final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams employeeIdEquals(final Long value) {
      put("employeeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams employeeIdGreaterThan(final Long value) {
      put("employeeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams employeeIdGreaterThanOrEqual(final Long value) {
      put("employeeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams employeeIdIn(final List<Long> value) {
      put("employeeId.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams employeeIdLessThan(final Long value) {
      put("employeeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams employeeIdLessThanOrEqual(final Long value) {
      put("employeeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams employeeIdNotEquals(final Long value) {
      put("employeeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams employeeIdNotIn(final List<Long> value) {
      put("employeeId.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams employeeIdSpecified(final Boolean value) {
      put("employeeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateEquals(final OffsetDateTime value) {
      put("endDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateGreaterThan(final OffsetDateTime value) {
      put("endDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateGreaterThanOrEqual(final OffsetDateTime value) {
      put("endDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateIn0EpochSecond(final Long value) {
      put("endDate.in[0].epochSecond", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateIn0Nano(final Integer value) {
      put("endDate.in[0].nano", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateLessThan(final OffsetDateTime value) {
      put("endDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateLessThanOrEqual(final OffsetDateTime value) {
      put("endDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateNotEquals(final OffsetDateTime value) {
      put("endDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateNotIn0EpochSecond(final Long value) {
      put("endDate.notIn[0].epochSecond", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateNotIn0Nano(final Integer value) {
      put("endDate.notIn[0].nano", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams endDateSpecified(final Boolean value) {
      put("endDate.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams idEquals(final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams idGreaterThan(final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams idGreaterThanOrEqual(final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams idIn(final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams idLessThan(final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams idLessThanOrEqual(final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams idNotEquals(final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams idNotIn(final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams idSpecified(final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams jobIdEquals(final Long value) {
      put("jobId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams jobIdGreaterThan(final Long value) {
      put("jobId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams jobIdGreaterThanOrEqual(final Long value) {
      put("jobId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams jobIdIn(final List<Long> value) {
      put("jobId.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams jobIdLessThan(final Long value) {
      put("jobId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams jobIdLessThanOrEqual(final Long value) {
      put("jobId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams jobIdNotEquals(final Long value) {
      put("jobId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams jobIdNotIn(final List<Long> value) {
      put("jobId.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams jobIdSpecified(final Boolean value) {
      put("jobId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams languageEquals(final String value) {
      put("language.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams languageIn(final List<String> value) {
      put("language.in", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams languageNotEquals(final String value) {
      put("language.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams languageNotIn(final List<String> value) {
      put("language.notIn", EncodingUtils.encodeCollection(value, "pipes"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams languageSpecified(final Boolean value) {
      put("language.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams page(final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams size(final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams sort(final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateEquals(final OffsetDateTime value) {
      put("startDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateGreaterThan(final OffsetDateTime value) {
      put("startDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateGreaterThanOrEqual(final OffsetDateTime value) {
      put("startDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateIn0EpochSecond(final Long value) {
      put("startDate.in[0].epochSecond", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateIn0Nano(final Integer value) {
      put("startDate.in[0].nano", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateLessThan(final OffsetDateTime value) {
      put("startDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateLessThanOrEqual(final OffsetDateTime value) {
      put("startDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateNotEquals(final OffsetDateTime value) {
      put("startDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateNotIn0EpochSecond(final Long value) {
      put("startDate.notIn[0].epochSecond", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateNotIn0Nano(final Integer value) {
      put("startDate.notIn[0].nano", EncodingUtils.encode(value));
      return this;
    }
    public GetAllJobHistoriesUsingGETQueryParams startDateSpecified(final Boolean value) {
      put("startDate.specified", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * getJobHistory
   * 
   * @param id id (required)
   * @return JobHistory
   */
  @RequestLine("GET /api/job-histories/{id}")
  @Headers({
    "Accept: */*",
  })
  JobHistory getJobHistoryUsingGET(@Param("id") Long id);

  /**
   * partialUpdateJobHistory
   * 
   * @param id id (required)
   * @param jobHistory  (optional)
   * @return JobHistory
   */
  @RequestLine("PATCH /api/job-histories/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  JobHistory partialUpdateJobHistoryUsingPATCH(@Param("id") Long id, JobHistory jobHistory);

  /**
   * updateJobHistory
   * 
   * @param id id (required)
   * @param jobHistory  (optional)
   * @return JobHistory
   */
  @RequestLine("PUT /api/job-histories/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  JobHistory updateJobHistoryUsingPUT(@Param("id") Long id, JobHistory jobHistory);
}
