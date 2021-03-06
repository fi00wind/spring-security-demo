package cn.coolwind.security.service.impl;

import cn.coolwind.security.entity.PermissionEntity;
import cn.coolwind.security.entity.RoleEntity;
import cn.coolwind.security.entity.UserEntity;
import cn.coolwind.security.repository.PermissionRepository;
import cn.coolwind.security.repository.RoleRepository;
import cn.coolwind.security.repository.UserRepository;
import cn.coolwind.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<PermissionEntity> getPermissionByUserId(Integer id) {
        return permissionRepository.getByUserId(id);
    }

    @Override
    public List<RoleEntity> getRolesByUserId(Integer id) {
        return roleRepository.getByUser(id);
    }

    @Override
    public UserEntity getByUsername(String username) {
        return userRepository.getByUsername(username);
    }
}
