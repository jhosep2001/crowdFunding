package com.crowd.services;

import com.crowd.entities.Founder;
import com.crowd.entities.Publisher;
import com.crowd.repository.FounderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FounderService {

    @Autowired
    private FounderDAO founderDAO;

    public List<Founder> getAllServices() {
        return founderDAO.findAll();
    }

    public Founder createFounder(Founder founder) {
        return founderDAO.save(founder);
    }

    public boolean updateFounder(List<Founder> founders) {
        founders.forEach(founder1 -> {
            Optional<Founder> forUpdate= founderDAO.findById(founder1.getId());
            if(forUpdate.isPresent()) {
                Founder founder = forUpdate.get();
                founder1.setName(founder.getName());
                founder1.setLastName(founder.getLastName());
                founder1.setCrowdList(founder.getCrowdList());
            }
        });
        return true;
    }

    public Founder getFounderById(Long id) {
        return founderDAO.getOne(id);
    }

    public Founder updateFounderById(Long id, Founder founder) {
        Optional<Founder> forUpdate= founderDAO.findById(id);
        if(forUpdate.isPresent()) {
            Founder findedFounder= forUpdate.get();
            findedFounder.setName(founder.getName());
            findedFounder.setLastName(founder.getLastName());
            findedFounder.setCrowdList(founder.getCrowdList());
            return founderDAO.save(founder);
        }
        return null;
    }
}
