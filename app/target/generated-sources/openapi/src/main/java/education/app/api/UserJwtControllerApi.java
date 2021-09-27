package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.JWTToken;
import education.app.model.LoginVM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface UserJwtControllerApi extends ApiClient.Api {


  /**
   * authorize
   * 
   * @param loginVM  (optional)
   * @return JWTToken
   */
  @RequestLine("POST /api/authenticate")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  JWTToken authorizeUsingPOST(LoginVM loginVM);
}
