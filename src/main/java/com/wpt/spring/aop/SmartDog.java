package com.wpt.spring.aop;/**
 * @author wpt@onlying.cn
 * @date 2024/8/26 21:54
 */

import org.springframework.stereotype.Component;

/**
 * @projectName: wpt-spring
 * @package: com.wpt.spring.aop
 * @className: SmartDog
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/26 21:54
 * @version: 1.0
 */
@Component
public class SmartDog implements SmartAnimalable {

    @Override
    public float add(float a, float b) {
        float res = a + b;
        System.out.println("SmartDog-add-res = " + res);
        return res;
    }

    @Override
    public float sub(float a, float b) {
        float res = a - b;
        System.out.println("SmartDog-sub-res = " + res);
        return res;
    }
}
