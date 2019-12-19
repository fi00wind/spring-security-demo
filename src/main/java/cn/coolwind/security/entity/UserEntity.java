package cn.coolwind.security.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "sys_user")
@Entity
@Data
public class UserEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "state")
    private Integer state;


}
