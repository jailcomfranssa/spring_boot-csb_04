package com.devsuperior.dslearnbds.controller;

import com.devsuperior.dslearnbds.model.dto.DeliverDto;
import com.devsuperior.dslearnbds.service.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/deliver")
public class DeliverResource {

    private final DeliverService deliverService;

    @Autowired
    public DeliverResource(DeliverService deliverService) {
        this.deliverService = deliverService;
    }

    @PreAuthorize("hasAnyRole('ADMIN','INSTRUCTOR')")
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody DeliverDto deliverDto){
        deliverService.saveRevision(id, deliverDto);
        return ResponseEntity.noContent().build();

    }
}
