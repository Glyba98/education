package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface LocationResourceApi extends ApiClient.Api {


  /**
   * createLocation
   * 
   * @param location  (optional)
   * @return Location
   */
  @RequestLine("POST /api/locations")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Location createLocationUsingPOST(Location location);

  /**
   * deleteLocation
   * 
   * @param id id (required)
   */
  @RequestLine("DELETE /api/locations/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteLocationUsingDELETE(@Param("id") Long id);

  /**
   * getAllLocations
   * 
   * @return List&lt;Location&gt;
   */
  @RequestLine("GET /api/locations")
  @Headers({
    "Accept: */*",
  })
  List<Location> getAllLocationsUsingGET();

  /**
   * getLocation
   * 
   * @param id id (required)
   * @return Location
   */
  @RequestLine("GET /api/locations/{id}")
  @Headers({
    "Accept: */*",
  })
  Location getLocationUsingGET(@Param("id") Long id);

  /**
   * partialUpdateLocation
   * 
   * @param id id (required)
   * @param location  (optional)
   * @return Location
   */
  @RequestLine("PATCH /api/locations/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Location partialUpdateLocationUsingPATCH(@Param("id") Long id, Location location);

  /**
   * updateLocation
   * 
   * @param id id (required)
   * @param location  (optional)
   * @return Location
   */
  @RequestLine("PUT /api/locations/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Location updateLocationUsingPUT(@Param("id") Long id, Location location);
}
