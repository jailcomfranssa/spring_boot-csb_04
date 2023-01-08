package com.devsuperior.dslearnbds.service;

import com.devsuperior.dslearnbds.model.dto.UserDto;
import com.devsuperior.dslearnbds.model.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserDto save(UserDto userDto);
    List<UserDto> getAll();
    Optional<UserDto> getById(Long id);
    UserDto update(Long id, UserDto userDto);

    Page<UserDto> getPage(Integer page, Integer linesPerPage, String direction, String orderBy);



}
