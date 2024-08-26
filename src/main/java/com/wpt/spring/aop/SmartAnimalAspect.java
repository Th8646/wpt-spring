package com.wpt.spring.aop;/**
 * @author wpt@onlying.cn
 * @date 2024/8/26 21:56
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @projectName: wpt-spring
 * @package: com.wpt.spring.aop
 * @className: SmartAnimalAspect
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/26 21:56
 * @version: 1.0
 */
@Component
@Aspect
public class SmartAnimalAspect {


    //@Before(value = "execution(public float com.wpt.spring.aop.aspectj.SmartDog.getSum(float, float))")
    // 使用切入点表达式

    // 返回通知
    @AfterReturning(value = "execution(public float com.wpt.spring.aop.SmartDog.add(float, float))")
    public void f2(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("SmartAnimalAspect切面类方法方法执行正常结束-日志-方法名  " + signature.getName() +
                "-结果result=");//从AOP看，就是一个横切关注点--返回通知
    }

    @AfterThrowing(value = "execution(public float com.wpt.spring.aop.SmartDog.add(float, float))")
    public void f3(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("SmartAnimalAspect切面类方法-执行异常-日志-方法名  " + signature.getName());//从AOP看，就是一个横切关注点--返回通知
    }

    @After(value = "execution(public float com.wpt.spring.aop.SmartDog.add(float, float))")
    public void f4(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("SmartAnimalAspect切面类方法-最终执行完毕-日志-方法名  " + signature.getName());//从AOP看，就是一个横切关注点--返回通知
    }


    @Before(value = "execution(public float com.wpt.spring.aop.SmartDog.add(float, float))")
    public void ok(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("SmartAnimalAspect切面类的ok方法--执行的目标方法---" + signature.getName());
    }
}
