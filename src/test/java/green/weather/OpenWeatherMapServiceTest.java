package green.weather;

import json.CurrentWeather;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenWeatherMapServiceTest {

    @Test
    public void currentWeather() {
        //given
        ApiKey apiKey = new ApiKey();
        OpenWeatherMapService service = new OpenWeatherMapServiceFactory().getService();

        //when
        CurrentWeather currentWeather = service.currentWeather(apiKey.toString(), "Passaic", "standard").blockingGet();

        //then
        assertNotEquals(0, currentWeather.main.temp);
        assertNotEquals(0, currentWeather.wind.gust);


    }

}