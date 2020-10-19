package com.zxf.dao.impl;

import com.zxf.Bean.User;
import com.zxf.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author zxf
 * @date 2020/10/16-15:39
 */
public class UserDaoImpl implements UserDao {
    //集合属性注入
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
//    //普通属性注入
//    private String username;
//    private int age;
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public void save() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
//        System.out.println(username);
//        System.out.println(age);
        System.out.println("我爱你");
    }
//    public void init(){
//        System.out.println("初始化方法");
//    }
//    public void destory(){
//        System.out.println("销毁方法");
//    }
}
