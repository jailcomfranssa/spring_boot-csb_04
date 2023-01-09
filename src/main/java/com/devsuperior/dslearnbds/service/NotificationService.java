package com.devsuperior.dslearnbds.service;

import com.devsuperior.dslearnbds.model.dto.NotificationDto;
import com.devsuperior.dslearnbds.model.entity.Notification;
import com.devsuperior.dslearnbds.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface NotificationService {

    NotificationDto save(NotificationDto notificationDto);
    Optional<NotificationDto> getById(Long id);
    List<NotificationDto> getAll();
    NotificationDto update(Long id, NotificationDto notificationDto);
    void deletar(Long id);

    Page<NotificationDto> notificationsForCurrentUser(Pageable pageable);

    Page<Notification> pageUserNotification(User user, Pageable pageable);
}




























