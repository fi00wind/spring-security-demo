package cn.coolwind.security.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "test")
@Entity
@Data
public class TestEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private String value;
}