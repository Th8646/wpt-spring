package com.wpt.spring.component;/**
 * @author wpt@onlying.cn
 * @date 2024/8/21 22:35
 */

import org.springframework.stereotype.Component;

/**
 * @projectName: wpt-spring
 * @package: com.wpt.spring.component
 * @className: UserDao
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/21 22:35
 * @version: 1.0
 */
@Component
public class UserDao {
    public void hi(){
        System.out.println("UserDao-hi()----");
    }
}
