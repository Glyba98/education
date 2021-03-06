/*
 * app API
 * app API documentation
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package education.app.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import education.app.model.Employee;
import education.app.model.Task;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Job
 */
@JsonPropertyOrder({
  Job.JSON_PROPERTY_EMPLOYEE,
  Job.JSON_PROPERTY_ID,
  Job.JSON_PROPERTY_JOB_TITLE,
  Job.JSON_PROPERTY_MAX_SALARY,
  Job.JSON_PROPERTY_MIN_SALARY,
  Job.JSON_PROPERTY_TASKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public class Job implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EMPLOYEE = "employee";
  private Employee employee;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_JOB_TITLE = "jobTitle";
  private String jobTitle;

  public static final String JSON_PROPERTY_MAX_SALARY = "maxSalary";
  private BigDecimal maxSalary;

  public static final String JSON_PROPERTY_MIN_SALARY = "minSalary";
  private BigDecimal minSalary;

  public static final String JSON_PROPERTY_TASKS = "tasks";
  private Set<Task> tasks = null;


  public Job employee(Employee employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMPLOYEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Employee getEmployee() {
    return employee;
  }


  public void setEmployee(Employee employee) {
    this.employee = employee;
  }


  public Job id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Job jobTitle(String jobTitle) {
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_JOB_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public Job maxSalary(BigDecimal maxSalary) {
    
    this.maxSalary = maxSalary;
    return this;
  }

   /**
   * Get maxSalary
   * @return maxSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_SALARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaxSalary() {
    return maxSalary;
  }


  public void setMaxSalary(BigDecimal maxSalary) {
    this.maxSalary = maxSalary;
  }


  public Job minSalary(BigDecimal minSalary) {
    
    this.minSalary = minSalary;
    return this;
  }

   /**
   * Get minSalary
   * minimum: 12792
   * @return minSalary
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MIN_SALARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getMinSalary() {
    return minSalary;
  }


  public void setMinSalary(BigDecimal minSalary) {
    this.minSalary = minSalary;
  }


  public Job tasks(Set<Task> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public Job addTasksItem(Task tasksItem) {
    if (this.tasks == null) {
      this.tasks = new LinkedHashSet<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Task> getTasks() {
    return tasks;
  }


  public void setTasks(Set<Task> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.employee, job.employee) &&
        Objects.equals(this.id, job.id) &&
        Objects.equals(this.jobTitle, job.jobTitle) &&
        Objects.equals(this.maxSalary, job.maxSalary) &&
        Objects.equals(this.minSalary, job.minSalary) &&
        Objects.equals(this.tasks, job.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employee, id, jobTitle, maxSalary, minSalary, tasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    maxSalary: ").append(toIndentedString(maxSalary)).append("\n");
    sb.append("    minSalary: ").append(toIndentedString(minSalary)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

