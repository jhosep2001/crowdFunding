package com.crowd.services;

import com.crowd.entities.Publisher;
import com.crowd.repository.PublisherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PublisherService {

    @Autowired
    private PublisherDAO publisherDAO;

    public List<Publisher> getAllServices() {
        return publisherDAO.findAll();
    }

    public Publisher createPublisher(Publisher publisher) {
        return publisherDAO.save(publisher);
    }

    public boolean updatePublisher(List<Publisher> publisher) {
        publisher.forEach(publisher1 -> {
            Optional<Publisher> forUpdate= publisherDAO.findById(publisher1.getId());
            if(forUpdate.isPresent()) {
                Publisher publish = forUpdate.get();
                publisher1.setName(publish.getName());
                publisher1.setLastName(publish.getLastName());
                publisher1.setCrowdList(publish.getCrowdList());
            }
        });
        return true;
    }

    public Publisher getFounderById(Long id) {
        return publisherDAO.getOne(id);
    }

    public Publisher updatePublisherById(Long id, Publisher publisher) {
        Optional<Publisher> forUpdate= publisherDAO.findById(id);
        if(forUpdate.isPresent()) {
            Publisher publish = forUpdate.get();
            publish.setName(publisher.getName());
            publish.setLastName(publisher.getLastName());
            publish.setCrowdList(publisher.getCrowdList());
            return publisherDAO.save(publish);
        }
        return null;
    }
}
