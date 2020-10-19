package com.zxf.test;

import com.zxf.dao.UserDao;
import com.zxf.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zxf
 * @date 2020/10/16-15:51
 */
public class SpringTest {
    @Test
    //测试bean标签的scope属性
    public void test(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao1 = (UserDao) app.getBean("userDao");
//        UserDao userDao2 = (UserDao) app.getBean("userDao");
//        System.out.println(userDao1);
//        System.out.println(userDao2);
        userDao1.save();
    }
    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
        System.out.println(userService);
        app.close();
    }
}
