package com.devsuperior.dslearnbds.service.impl;

import com.devsuperior.dslearnbds.exceptions.ForbiddenException;
import com.devsuperior.dslearnbds.exceptions.UnauthorizedException;
import com.devsuperior.dslearnbds.model.entity.User;
import com.devsuperior.dslearnbds.repository.UserRepository;
import com.devsuperior.dslearnbds.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthenticatedImpl implements AuthService {

    private final UserRepository userRepository;

    @Autowired
    public AuthenticatedImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public User authenticated() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(username);
        }catch (Exception e){
            throw new UnauthorizedException("Usuario Invalido");
        }
    }

    @Override
    public void validateSelfOrAdmin(Long userId){
        User user = authenticated();
        if(!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")){
            throw new ForbiddenException("Acesso Negado!");
        }
    }
}
