package com.wpt.spring.process;/**
 * @author wpt@onlying.cn
 * @date 2024/8/26 21:31
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @projectName: wpt-spring
 * @package: com.wpt.spring.process
 * @className: MyBeanPostProcessor
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/26 21:31
 * @version: 1.0
 */

public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization被调用"+beanName+"bean = " + bean.getClass());
        return bean;
    }


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization被调用"+beanName+"bean = " + bean.getClass());
        return bean;
    }
}
