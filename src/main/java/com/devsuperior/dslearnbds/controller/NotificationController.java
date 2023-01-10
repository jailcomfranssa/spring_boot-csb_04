package com.devsuperior.dslearnbds.controller;

import com.devsuperior.dslearnbds.model.dto.NotificationDto;
import com.devsuperior.dslearnbds.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public ResponseEntity<Page<NotificationDto>> notificationsForCurrentUser(Pageable pageable){
        Page<NotificationDto> page = notificationService.notificationsForCurrentUser(pageable);
        return ResponseEntity.ok().body(page);
    }
}
