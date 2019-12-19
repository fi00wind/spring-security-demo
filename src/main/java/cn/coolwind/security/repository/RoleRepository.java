package cn.coolwind.security.repository;

import cn.coolwind.security.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<RoleEntity,Integer>, JpaSpecificationExecutor<RoleEntity> {

    @Query(value = "select * from sys_role where id in " +
            "(select role_id from sys_user_role where user_id = ?)",nativeQuery = true)
    List<RoleEntity> getByUser(Integer username);
}
