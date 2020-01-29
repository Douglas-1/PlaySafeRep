package com.example.playsafeWs.service;

import com.example.playsafeWs.dto.Temperature;

public interface TemperatureService
{
  String convertCelcToKelvin(String celsius);

  String convertkelvToCelsius(String kelvin);

}
