package com.crowd.restControllers;

import com.crowd.entities.Crowd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.crowd.services.CrowdService;

import java.util.List;

@RestController
public class CrowdController {

    @Autowired
    private CrowdService crowdService;

    @RequestMapping(value = "/crowd", method= RequestMethod.GET)
    private ResponseEntity<List<Crowd>> getAllCrowd() {
        return new ResponseEntity<List<Crowd>>(crowdService.getAllServices(), HttpStatus.OK);
    }

    @RequestMapping(value = "/crowd", method= RequestMethod.POST)
    private ResponseEntity<Crowd> createCrowd(@RequestBody Crowd crowd) {
        return new ResponseEntity<Crowd>(crowdService.createCrowd(crowd), HttpStatus.OK);
    }
}
