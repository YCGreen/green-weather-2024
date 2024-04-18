package green.weather;

import io.reactivex.rxjava3.core.Single;
import json.CurrentWeather;
import retrofit2.http.GET;
import retrofit2.http.Query;

/*
 * https://openweathermap.org/current
 */
public interface OpenWeatherMapService {

    @GET("/data/2.5/weather")
    Single<CurrentWeather> currentWeather(
            @Query("appid") String appId,
            @Query("q") String city,
            @Query("units") String units);
}
