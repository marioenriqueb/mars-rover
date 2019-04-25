package com.exercise.web.rest;

import com.exercise.web.request.RoverTransmitRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.exercise.exception.TransactionException;
import com.exercise.service.RovertService;
import com.exercise.web.response.RovertResponse;

/**
 * REST controller for managing Rovert.
 */
@RestController
@RequestMapping("/api")
public class RovertResource {

    private final Logger log = LoggerFactory.getLogger(RovertResource.class);
    
    @Autowired
    private RovertService service;

    /**
     * POST  /move/{direction} move Rovert in any direction.
     * @throws TransactionException 
     */
    @PostMapping("/move/{direction}")
    public ResponseEntity<Void> transactions(@PathVariable String direction) throws TransactionException {
        log.debug("REST request to move on direction : {}", direction);
        service.move(direction);
	    return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    /**
     * POST  /stand stand still charging its batteries.
     * @throws TransactionException
     */
    @PostMapping("/stand")
    public ResponseEntity<Void> stand() throws TransactionException {
        log.debug("REST request to stand charging batteries");
        service.stand();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    /**
     * POST  /transmit transmit texts in English.
     * @throws TransactionException
     */
    @PostMapping("/transmit")
    public ResponseEntity<Void> transmit(@RequestBody RoverTransmitRequest request) throws TransactionException {
        log.debug("REST request to transmit text '{}' in English", request.getText());
        service.transmit(request.getText());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * GET /status Obtain general status.
     * @throws TransactionException
     */
    @GetMapping("/status")
    public ResponseEntity<RovertResponse> status() throws TransactionException {
        log.debug("REST request to get status");
        RovertResponse response = service.status();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
