package cn.coolwind.security.repository;

import cn.coolwind.security.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<UserEntity,Integer>, JpaSpecificationExecutor<UserEntity> {

    UserEntity getByUsername(String username);
}
