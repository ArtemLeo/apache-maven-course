package com.artemdev.service.service;

import com.artemdev.database.dao.UserDao;
import com.artemdev.service.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(it -> new UserDto());
    }
}
