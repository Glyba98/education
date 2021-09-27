package education.app.api;

import education.app.ApiClient;
import education.app.EncodingUtils;

import education.app.model.Country;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:18:25.349920400+03:00[Europe/Moscow]")
public interface CountryResourceApi extends ApiClient.Api {


  /**
   * createCountry
   * 
   * @param country  (optional)
   * @return Country
   */
  @RequestLine("POST /api/countries")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Country createCountryUsingPOST(Country country);

  /**
   * deleteCountry
   * 
   * @param id id (required)
   */
  @RequestLine("DELETE /api/countries/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteCountryUsingDELETE(@Param("id") Long id);

  /**
   * getAllCountries
   * 
   * @return List&lt;Country&gt;
   */
  @RequestLine("GET /api/countries")
  @Headers({
    "Accept: */*",
  })
  List<Country> getAllCountriesUsingGET();

  /**
   * getCountry
   * 
   * @param id id (required)
   * @return Country
   */
  @RequestLine("GET /api/countries/{id}")
  @Headers({
    "Accept: */*",
  })
  Country getCountryUsingGET(@Param("id") Long id);

  /**
   * partialUpdateCountry
   * 
   * @param id id (required)
   * @param country  (optional)
   * @return Country
   */
  @RequestLine("PATCH /api/countries/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Country partialUpdateCountryUsingPATCH(@Param("id") Long id, Country country);

  /**
   * updateCountry
   * 
   * @param id id (required)
   * @param country  (optional)
   * @return Country
   */
  @RequestLine("PUT /api/countries/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Country updateCountryUsingPUT(@Param("id") Long id, Country country);
}
