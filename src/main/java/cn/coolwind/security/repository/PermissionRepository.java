package cn.coolwind.security.repository;

import cn.coolwind.security.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PermissionRepository extends JpaRepository<PermissionEntity,Integer>,JpaSpecificationExecutor<PermissionEntity> {
}
