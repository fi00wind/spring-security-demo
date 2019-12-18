package cn.coolwind.security;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyTest {

    @Test
    public void test() {
        System.out.println(new BCryptPasswordEncoder().encode("111"));
    }
}
