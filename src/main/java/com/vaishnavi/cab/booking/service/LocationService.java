package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Location;
import java.util.List;

public interface LocationService {
    List<Location> getAllLocations() throws Exception;
    boolean addLocation(Location location);
    boolean deleteLocation(int id);
    Location findLocation(int id) throws Exception;

    List<Location> retrieveLocations();

    boolean storeLocation(Location location);

    Location searchLocation(int id);
}

