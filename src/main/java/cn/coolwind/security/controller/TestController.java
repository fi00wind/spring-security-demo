package cn.coolwind.security.controller;

import cn.coolwind.security.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/test")
    public Object test() {
        return testRepository.findAll();
    }
}
