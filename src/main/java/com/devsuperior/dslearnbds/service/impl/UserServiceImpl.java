package com.devsuperior.dslearnbds.service.impl;

import com.devsuperior.dslearnbds.exceptions.ResourceNotFoundException;
import com.devsuperior.dslearnbds.model.dto.UserDto;
import com.devsuperior.dslearnbds.model.entity.User;
import com.devsuperior.dslearnbds.repository.UserRepository;
import com.devsuperior.dslearnbds.service.AuthService;
import com.devsuperior.dslearnbds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;
    private final AuthService service;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, AuthService service) {
        this.userRepository = userRepository;
        this.service = service;
    }

    @Override
    public UserDto save(UserDto userDto) {
        return null;
    }

    @Override
    public List<UserDto> getAll() {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<UserDto> getById(Long id) {
        service.validateSelfOrAdmin(id);
        Optional<User> user = userRepository.findById(id);
        User entity = user.orElseThrow(()-> new ResourceNotFoundException("Entity not found"));
        return Optional.of(new UserDto(entity));
    }

    @Override
    public UserDto update(Long id, UserDto userDto) {
        return null;
    }

    @Override
    public UserDto findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        if (user == null){
            throw new ResourceNotFoundException("Entity not found");
        }
        return new UserDto(user);
    }

//    @Override
//    public Optional<UserDto> findByEmail(String email) {
//        Optional<User> user = Optional.ofNullable(userRepository.findByEmail(email));
//        User entity = user.orElseThrow(()-> new ResourceNotFoundException("Entity not found"));
//        return Optional.of(new UserDto(entity));
//    }

    @Override
    public Page<UserDto> getPage(Integer page, Integer linesPerPage, String direction, String orderBy) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(username);
        if (user == null) {
            logger.error("User not found: " + username);
            throw new UsernameNotFoundException("Email not found");
        }
        logger.info("User found: " + username);
        return user;
    }
}
