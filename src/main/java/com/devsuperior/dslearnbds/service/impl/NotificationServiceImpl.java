package com.devsuperior.dslearnbds.service.impl;

import com.devsuperior.dslearnbds.model.dto.NotificationDto;
import com.devsuperior.dslearnbds.model.entity.Notification;
import com.devsuperior.dslearnbds.model.entity.User;
import com.devsuperior.dslearnbds.repository.NotificationRepository;
import com.devsuperior.dslearnbds.service.AuthService;
import com.devsuperior.dslearnbds.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository repository;
    private final AuthService authService;

    @Autowired
    public NotificationServiceImpl(NotificationRepository repository, AuthService authService) {
        this.repository = repository;
        this.authService = authService;
    }

    @Override
    public NotificationDto save(NotificationDto notificationDto) {
        return null;
    }

    @Override
    public Optional<NotificationDto> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<NotificationDto> getAll() {
        return null;
    }

    @Override
    public NotificationDto update(Long id, NotificationDto notificationDto) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    @Transactional(readOnly = true)
    public Page<NotificationDto> notificationsForCurrentUser(Pageable pageable) {
        User user = authService.authenticated();
        Page<Notification> page = pageUserNotification(user,pageable);
        return page.map(x-> new NotificationDto(x));
    }

    @Override
    public Page<Notification> pageUserNotification(User user, Pageable pageable) {
        return repository.findByUser(user,pageable);
    }

}
