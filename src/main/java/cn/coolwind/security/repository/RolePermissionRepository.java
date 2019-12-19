package cn.coolwind.security.repository;

import cn.coolwind.security.entity.RolePermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RolePermissionRepository extends JpaRepository<RolePermissionEntity,Integer>, JpaSpecificationExecutor<RolePermissionEntity> {
}
