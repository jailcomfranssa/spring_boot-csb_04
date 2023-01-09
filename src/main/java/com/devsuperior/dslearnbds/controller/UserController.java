package com.devsuperior.dslearnbds.controller;

import com.devsuperior.dslearnbds.model.dto.UserDto;
import com.devsuperior.dslearnbds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserDto>> getById(@PathVariable Long id){
        Optional<UserDto> dto = userService.getById(id);
        return ResponseEntity.ok().body(dto);
    }
}































