package com.example.playsafeWs.service;


import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService

  {
    @Override
    public String convertMilesToKilos(String miles)
    {
      try
      {
        double kilometer = Double.valueOf(miles) * 0.621371;
        return String.valueOf(kilometer);
      }
      catch (Exception e)
      {
        return "Invalid input";
      }
    }

    @Override
    public String convertKillosToMiles (String kilometer)
    {
      try
      {
        double miles = Double.valueOf(kilometer) * 1.60934;
        return String.valueOf(miles);
      }
      catch (Exception e)
      {
        return "Invalid input";
      }

    }
  }
