package com.zxf.service.impl;

import com.zxf.dao.UserDao;
import com.zxf.dao.impl.UserDaoImpl;
import com.zxf.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zxf
 * @date 2020/10/16-16:15
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    // 通过set方法应用
    public void setUserdao(UserDao userdao) {
        this.userDao = userdao;
    }
    //通过有参构造来引用
//
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void save() {
        userDao.save();
    }
}
