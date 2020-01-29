package com.example.playsafeWs.restservice;

import com.example.playsafeWs.service.TemperatureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureConversionController
{

  @Autowired
  private TemperatureServiceImpl service;

  @GetMapping("/conversions/ktoc")
  public String temperatureCelc(@RequestParam(value = "celsius" , defaultValue = "invalid input") String celsius)
  {
    return service.convertCelcToKelvin(celsius);

  }

  @GetMapping("/conversions/ctok")
  public String temperatureKelv(@RequestParam(value = "kelvin" , defaultValue = "invalid input") String kelvin)
  {
    return service.convertkelvToCelsius(kelvin);

  }
}
