package com.example.playsafeWs.service;

import com.example.playsafeWs.dto.Temperature;
import org.springframework.stereotype.Service;



@Service
public class TemperatureServiceImpl implements TemperatureService
{
  /*method to convert celsius to kelvin and try catch an exception if invalid input was inserted*/
  @Override
  public String convertCelcToKelvin(String celsius)
  {
    try
    {
      double kelvin = Double.valueOf(celsius) + 273.15;
      return String.valueOf(kelvin);
    }
    catch (Exception e){
      return "Invalid input";
    }

  }
/*method to convert kelvin to celsius and try catch an exception if invalid input was inserted*/
  @Override
  public String convertkelvToCelsius(String kelvin)
  {
    try
    {
      double celsius = Double.valueOf(kelvin) + (-273.15);
      return String.valueOf(celsius);
    }
    catch (Exception e)
    {
      return "Invalid input";
    }

  }

}
