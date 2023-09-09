package com.summer.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.security.NoSuchAlgorithmException;

/**
 * 启动类测试
 *
 * @author <a href="https://github.com/zijiFirst">summer</a>
 * @from <a href="https://github.com/zijiFirst">学习</a>
 */
@SpringBootTest
class UserCenterApplicationTests {

    // https://github.com/zijiFirst/

    @Test
    void testDigest() throws NoSuchAlgorithmException {
        String newPassword = DigestUtils.md5DigestAsHex(("abcd" + "mypassword").getBytes());
        System.out.println(newPassword);
    }


    @Test
    void contextLoads() {

    }

}

