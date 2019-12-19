package cn.coolwind.security.security;

import cn.coolwind.security.entity.RoleEntity;
import cn.coolwind.security.entity.UserEntity;
import cn.coolwind.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserAuthService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userService.getByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("用户不存在！");
        }
        List<SimpleGrantedAuthority> roles = userService.getRolesByUserId(userEntity.getId())
        .stream()
        .map(RoleEntity::getRole)
        .map(SimpleGrantedAuthority::new)
        .collect(Collectors.toList());
        return new User(userEntity.getUsername(), userEntity.getPassword(), roles);
    }
}
