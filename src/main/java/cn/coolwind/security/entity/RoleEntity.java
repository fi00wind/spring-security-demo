package cn.coolwind.security.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "sys_role")
@Entity
@Data
public class RoleEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role")
    private String role;

}
