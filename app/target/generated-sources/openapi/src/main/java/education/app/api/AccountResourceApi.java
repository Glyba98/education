package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.AdminUserDTO;
import education.app.model.KeyAndPasswordVM;
import education.app.model.ManagedUserVM;
import education.app.model.PasswordChangeDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface AccountResourceApi extends ApiClient.Api {


  /**
   * activateAccount
   * 
   * @param key key (required)
   */
  @RequestLine("GET /api/activate?key={key}")
  @Headers({
    "Accept: application/json",
  })
  void activateAccountUsingGET(@Param("key") String key);

  /**
   * activateAccount
   * 
   * Note, this is equivalent to the other <code>activateAccountUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ActivateAccountUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>key - key (required)</li>
   *   </ul>
   */
  @RequestLine("GET /api/activate?key={key}")
  @Headers({
  "Accept: application/json",
  })
  void activateAccountUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>activateAccountUsingGET</code> method in a fluent style.
   */
  public static class ActivateAccountUsingGETQueryParams extends HashMap<String, Object> {
    public ActivateAccountUsingGETQueryParams key(final String value) {
      put("key", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * changePassword
   * 
   * @param passwordChangeDTO  (optional)
   */
  @RequestLine("POST /api/account/change-password")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void changePasswordUsingPOST(PasswordChangeDTO passwordChangeDTO);

  /**
   * finishPasswordReset
   * 
   * @param keyAndPasswordVM  (optional)
   */
  @RequestLine("POST /api/account/reset-password/finish")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void finishPasswordResetUsingPOST(KeyAndPasswordVM keyAndPasswordVM);

  /**
   * getAccount
   * 
   * @return AdminUserDTO
   */
  @RequestLine("GET /api/account")
  @Headers({
    "Accept: */*",
  })
  AdminUserDTO getAccountUsingGET();

  /**
   * isAuthenticated
   * 
   * @return String
   */
  @RequestLine("GET /api/authenticate")
  @Headers({
    "Accept: */*",
  })
  String isAuthenticatedUsingGET();

  /**
   * registerAccount
   * 
   * @param managedUserVM  (optional)
   */
  @RequestLine("POST /api/register")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void registerAccountUsingPOST(ManagedUserVM managedUserVM);

  /**
   * requestPasswordReset
   * 
   * @param body  (optional)
   */
  @RequestLine("POST /api/account/reset-password/init")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void requestPasswordResetUsingPOST(String body);

  /**
   * saveAccount
   * 
   * @param adminUserDTO  (optional)
   */
  @RequestLine("POST /api/account")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void saveAccountUsingPOST(AdminUserDTO adminUserDTO);
}
