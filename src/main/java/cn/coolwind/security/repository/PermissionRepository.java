package cn.coolwind.security.repository;

import cn.coolwind.security.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PermissionRepository extends JpaRepository<PermissionEntity,Integer>,JpaSpecificationExecutor<PermissionEntity> {

    @Query(value = "select * from sys_permission where id in(" +
            "select permission_id from sys_role_permission where role_id in( " +
            "select role_id from sys_user_role where user_id = ?))",nativeQuery = true)
    List<PermissionEntity> getByUserId(int id);

    PermissionEntity getByUrl(String url);
}
