package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Cab;
import java.util.List;

public interface CabService {
    List<Cab> getAllCabs() throws Exception;
    boolean addCab(Cab cab);
    boolean deleteCab(int id);
    Cab findCab(int id) throws Exception;

    List<Cab> retrieveCabs();

    boolean storeCab(Cab cab);

    Cab searchCab(int id);
}


