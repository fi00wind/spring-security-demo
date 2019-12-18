package cn.coolwind.security.repository;

import cn.coolwind.security.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestRepository extends JpaRepository<TestEntity,Integer>, JpaSpecificationExecutor<TestEntity> {
}
