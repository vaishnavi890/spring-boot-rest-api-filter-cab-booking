package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Cab;
import com.vaishnavi.cab.booking.repository.CabRepository;
import com.vaishnavi.cab.booking.service.CabService;
import com.vaishnavi.cab.booking.exceptions.CabNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoCabsFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabServiceImpl implements CabService {

    private static final Logger logger = LoggerFactory.getLogger(CabServiceImpl.class);

    @Autowired
    private CabRepository repo;

    public List<Cab> getAllCabs() throws Exception {
        logger.info("Inside CabServiceImpl.getAllCabs()");
        List<Cab> list = repo.retrieve();
        if (list.isEmpty()) throw new NoCabsFoundException();
        return list;
    }

    public boolean addCab(Cab cab) {
        logger.info("Inside CabServiceImpl.addCab()");
        return repo.store(cab);
    }

    public boolean deleteCab(int id) {
        logger.info("Inside CabServiceImpl.deleteCab()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new CabNotFoundException();
        }
        return true;
    }

    public Cab findCab(int id) throws Exception {
        logger.info("Inside CabServiceImpl.findCab()");
        Cab cab = repo.search(id);
        if (cab == null) throw new CabNotFoundException();
        return cab;
    }

    @Override
    public List<Cab> retrieveCabs() {
        return List.of();
    }

    @Override
    public boolean storeCab(Cab cab) {
        return false;
    }

    @Override
    public Cab searchCab(int id) {
        return null;
    }
}


