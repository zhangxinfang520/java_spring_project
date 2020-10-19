package com.zxf.demo;

import com.zxf.service.UserService;
import com.zxf.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zxf
 * @date 2020/10/16-16:23
 */
public class UseController {
    public static void main(String[] args) {
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.save();
        //二者等价

        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
