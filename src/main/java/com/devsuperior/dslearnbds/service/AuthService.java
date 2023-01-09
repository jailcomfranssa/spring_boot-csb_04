package com.devsuperior.dslearnbds.service;

import com.devsuperior.dslearnbds.model.entity.User;

public interface AuthService {

    public User authenticated();
    public void validateSelfOrAdmin(Long userId);
}
