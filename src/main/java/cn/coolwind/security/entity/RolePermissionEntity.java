package cn.coolwind.security.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "sys_role_permission")
@Entity
@Data
public class RolePermissionEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "permission")
    private Integer permissionId;
}
