package cn.coolwind.security.controller;

import cn.coolwind.security.entity.RolePermissionEntity;
import cn.coolwind.security.repository.RolePermissionRepository;
import cn.coolwind.security.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestRepository testRepository;
    @Autowired
    private RolePermissionRepository rolePermissionRepository;

    @GetMapping("/test")
    public Object test() {
        return testRepository.findAll();
    }

    @GetMapping("add")
    public Object add() {
        RolePermissionEntity role = new RolePermissionEntity();
        role.setPermissionId(1);
        role.setRoleId(1);
        rolePermissionRepository.save(role);
        return "ok";
    }

    @GetMapping("/p1")
    public Object p1(){
        return "p1 Page";
    }
    @GetMapping("/p2")
    public Object p2(){
        return "p2 Page";
    }
}
