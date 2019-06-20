package com.crowd.restControllers;

import com.crowd.entities.Founder;
import com.crowd.entities.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.crowd.services.FounderService;

import java.util.List;

@RestController
public class FounderController {

    @Autowired
    private FounderService founderService;

    @RequestMapping(value = "/founder", method= RequestMethod.GET)
    private ResponseEntity<List<Founder>> getAllFounder() {
        return new ResponseEntity<List<Founder>>(founderService.getAllServices(), HttpStatus.OK) ;
    }

    @RequestMapping(value = "/founder", method= RequestMethod.POST)
    private ResponseEntity<Founder> createFounders(@RequestBody Founder founder) {
        return new ResponseEntity<Founder>(founderService.createFounder(founder), HttpStatus.OK) ;
    }

    @RequestMapping(value = "/founder", method= RequestMethod.PUT)
    private ResponseEntity<Boolean> updateFounders(@RequestBody List<Founder> founder) {
        return new ResponseEntity<Boolean>(founderService.updateFounder(founder), HttpStatus.OK) ;
    }

    @RequestMapping(value = "/founder/{id}", method= RequestMethod.GET)
    private ResponseEntity<Founder> getFounderById(@PathVariable Long id) {
        return new ResponseEntity<Founder> (founderService.getFounderById(id), HttpStatus.OK) ;
    }

    @RequestMapping(value = "/founder/{id}", method= RequestMethod.PUT)
    private ResponseEntity<Founder> updateFounderById(@PathVariable Long id, @RequestBody Founder founder) {
        return new ResponseEntity<Founder>(founderService.updateFounderById(id, founder), HttpStatus.OK) ;
    }
}
