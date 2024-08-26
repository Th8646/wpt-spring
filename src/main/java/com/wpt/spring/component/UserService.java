package com.wpt.spring.component;/**
 * @author wpt@onlying.cn
 * @date 2024/8/21 22:36
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @projectName: wpt-spring
 * @package: com.wpt.spring.component
 * @className: UserService
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/21 22:36
 * @version: 1.0
 */
@Component
public class UserService {
    @Autowired
    private UserDao userDao;
    public void  m1(){
        userDao.hi();
    }
    @PostConstruct
    public void init(){
        System.out.println("UserService里的init方法");
    }
}
