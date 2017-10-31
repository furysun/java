package com.company.builder;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.lang.reflect.Type;

public interface Builder {
     void setType(Type type);
     void setSeats(int seats);
     void setEngine (Engine engine);

     void setTransmission(Transmission transmission);
     void setTripComputer(TripComputer tripComputer);
     void setGPSNavigator(GPSNavigator gpsNavigator);
}
