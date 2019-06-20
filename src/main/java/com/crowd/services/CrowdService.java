package com.crowd.services;

import com.crowd.entities.Crowd;
import com.crowd.repository.CrowdDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CrowdService {

    @Autowired
    private CrowdDAO crowdDAO;

    public List<Crowd> getAllServices() {
        return crowdDAO.findAll();
    }

    public Crowd createCrowd(Crowd crowd) {
        return crowdDAO.save(crowd);
    }
}
