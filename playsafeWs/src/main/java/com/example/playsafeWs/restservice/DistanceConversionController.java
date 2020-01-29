package com.example.playsafeWs.restservice;

import com.example.playsafeWs.service.DistanceServiceImpl;
import com.example.playsafeWs.service.TemperatureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistanceConversionController
{
  @Autowired
  private DistanceServiceImpl service;

  public DistanceConversionController(DistanceServiceImpl service)
  {
    this.service = service;
  }

  @GetMapping("/conversions/ktom")
  public String distanceMiles(@RequestParam(value = "miles" , defaultValue = "invalid input") String miles)
  {
    return service.convertMilesToKilos(miles);

  }

  @GetMapping("/conversions/mtok")
  public String distanceKilos(@RequestParam(value = "kilometer" , defaultValue = "invalid input") String kilometer)
  {
    return service.convertKillosToMiles(kilometer);

  }

}
