package com.crowd.restControllers;

import com.crowd.entities.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.crowd.services.PublisherService;

import java.util.List;

@RestController
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @RequestMapping(value = "/publisher", method= RequestMethod.GET)
    private ResponseEntity<List<Publisher>> getAllFounder() {
        return new ResponseEntity<List<Publisher>>(publisherService.getAllServices(), HttpStatus.OK) ;
    }

    @RequestMapping(value = "/publisher", method= RequestMethod.POST)
    private ResponseEntity<Publisher> createPublisher(@RequestBody Publisher publisher) {
        return new ResponseEntity<Publisher>(publisherService.createPublisher(publisher), HttpStatus.OK) ;
    }

    @RequestMapping(value = "/publisher", method= RequestMethod.PUT)
    private ResponseEntity<Boolean> updatePublisher(@RequestBody List<Publisher> publisher) {
        return new ResponseEntity<Boolean>(publisherService.updatePublisher(publisher), HttpStatus.OK) ;
    }

    @RequestMapping(value = "/publisher/{id}", method= RequestMethod.GET)
    private ResponseEntity<Publisher> getFounderById(@PathVariable Long id) {
        return new ResponseEntity<Publisher> (publisherService.getFounderById(id), HttpStatus.OK) ;
    }

    @RequestMapping(value = "/publisher/{id}", method= RequestMethod.PUT)
    private ResponseEntity<Publisher> updatePublisher(@PathVariable Long id, @RequestBody Publisher publisher) {
        return new ResponseEntity<Publisher>(publisherService.updatePublisherById(id, publisher), HttpStatus.OK) ;
    }
}
