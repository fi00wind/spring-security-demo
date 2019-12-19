package cn.coolwind.security.service;

import cn.coolwind.security.entity.RoleEntity;
import cn.coolwind.security.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity getByUsername(String username);

    List<RoleEntity> getRolesByUserId(Integer id);
}
