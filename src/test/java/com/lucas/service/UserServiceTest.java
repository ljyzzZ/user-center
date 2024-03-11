package com.lucas.service;

import com.lucas.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 *  用户服务测试
 *
 * */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        user.setUsername("sheep");
        user.setUserAccount("123");
        user.setAvatarUrl("www");
        user.setGender(0);
        user.setUserPassword("123");
        user.setPhone("888");
        user.setEmail("777");
        user.setUserStatus(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setIsDelete(0);
        user.setUserRole(0);
        user.setPlanetCode("666");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "lucas";
        String userPassword = "";
        String checkPassword = "123456";
        String planetCode = "1";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        userAccount = "liu";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        userAccount = "lucas";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        userAccount = "lu cas";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        userAccount = "yupi";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        userAccount = "lucas";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertTrue(result > 0);
    }
}