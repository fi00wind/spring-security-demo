package cn.coolwind.security.service;

import cn.coolwind.security.entity.UserEntity;

public interface UserService {
    UserEntity getByUsername(String username);
}
