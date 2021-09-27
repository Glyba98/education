package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.Region;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface RegionResourceApi extends ApiClient.Api {


  /**
   * createRegion
   * 
   * @param region  (optional)
   * @return Region
   */
  @RequestLine("POST /api/regions")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Region createRegionUsingPOST(Region region);

  /**
   * deleteRegion
   * 
   * @param id id (required)
   */
  @RequestLine("DELETE /api/regions/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteRegionUsingDELETE(@Param("id") Long id);

  /**
   * getAllRegions
   * 
   * @return List&lt;Region&gt;
   */
  @RequestLine("GET /api/regions")
  @Headers({
    "Accept: */*",
  })
  List<Region> getAllRegionsUsingGET();

  /**
   * getRegion
   * 
   * @param id id (required)
   * @return Region
   */
  @RequestLine("GET /api/regions/{id}")
  @Headers({
    "Accept: */*",
  })
  Region getRegionUsingGET(@Param("id") Long id);

  /**
   * partialUpdateRegion
   * 
   * @param id id (required)
   * @param region  (optional)
   * @return Region
   */
  @RequestLine("PATCH /api/regions/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Region partialUpdateRegionUsingPATCH(@Param("id") Long id, Region region);

  /**
   * updateRegion
   * 
   * @param id id (required)
   * @param region  (optional)
   * @return Region
   */
  @RequestLine("PUT /api/regions/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Region updateRegionUsingPUT(@Param("id") Long id, Region region);
}
