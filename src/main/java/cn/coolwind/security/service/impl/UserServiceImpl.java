package cn.coolwind.security.service.impl;

import cn.coolwind.security.entity.UserEntity;
import cn.coolwind.security.repository.UserRepository;
import cn.coolwind.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity getByUsername(String username) {
        return userRepository.getByUsername(username);
    }
}
