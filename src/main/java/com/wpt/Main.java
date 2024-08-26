package com.wpt;

import com.wpt.spring.aop.SmartAnimalable;
import com.wpt.spring.component.UserAction;
import com.wpt.spring.component.UserDao;
import com.wpt.spring.component.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wpt@onlying.cn
 * @date 2024/8/21 21:58
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        UserAction userAction = (UserAction) ioc.getBean("userAction");
        UserAction userAction2 = (UserAction) ioc.getBean("userAction");
        System.out.println("userAction = " + userAction);
        System.out.println("userAction = " + userAction2);

        UserDao userDao = (UserDao) ioc.getBean("userDao");
        System.out.println("userDao = " + userDao);

        UserService userService = (UserService) ioc.getBean("userService");
        System.out.println("userService = " + userService);

        userService.m1();

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        SmartAnimalable smartDog = ioc.getBean(SmartAnimalable.class);
        smartDog.add(10, 2);

    }
}