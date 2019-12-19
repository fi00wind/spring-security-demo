package cn.coolwind.security.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "sys_permission")
@Entity
@Data
public class PermissionEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "type")
    private String type;

    @Column(name = "url")
    private String url;

    @Column(name = "parent_id")
    private Integer parentId;
}
