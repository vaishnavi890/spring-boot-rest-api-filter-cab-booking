package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Ride;
import java.util.List;

public interface RideRepository {
    boolean store(Ride ride);
    List<Ride> retrieve() throws Exception;
    Ride search(int id) throws Exception;
    boolean delete(int id) throws Exception;
}



