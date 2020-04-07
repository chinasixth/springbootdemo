package com.sixth.springboot.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/7 16:34
 * @ 切面
 */
@Component
@Aspect
public class EmployeeAspect {

    /**
     * 格式：
     * <p>
     * execution(modifiers-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern) throws-pattern?)
     * <p>
     * 括号中各个pattern分别表示：
     * <p>
     * 修饰符匹配（modifier-pattern?）
     * 返回值匹配（ret-type-pattern）可以为*表示任何返回值,全路径的类名等
     * 类路径匹配（declaring-type-pattern?）
     * 方法名匹配（name-pattern）可以指定方法名 或者 *代表所有, set* 代表以set开头的所有方法
     * 参数匹配（(param-pattern)）可以指定具体的参数类型，多个参数间用“,”隔开，各个参数也可以用“*”来表示匹配任意类型的参数，如(String)表示匹配一个String参数的方法；(*,String) 表示匹配有两个参数的方法，第一个参数可以是任意类型，而第二个参数是String类型；可以用(..)表示零个或多个任意参数
     * 异常类型匹配（throws-pattern?）
     * 其中后面跟着“?”的是可选项
     */
    @Pointcut(value = "execution(public * com.sixth.springboot.controller.EmployeeController.*(..))")
    public void executeEmployeeController() {

    }

    /**
     * 前置通知，在目标方法被调用前调用
     *
     * @param joinPoint 连接点。在程序执行过程中某个特定的点，比如某方法调用的时候或者处理异常的时候。在Spring AOP中，一个连接点总是表示一个方法的执行。
     */
    @Before("executeEmployeeController()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("======前置通知======");
        Signature signature = joinPoint.getSignature();
        System.out.println("返回目标方法的签名：" + signature);
        System.out.println("代理的方法是：" + signature.getName());
        Object[] args = joinPoint.getArgs();
        System.out.println("目标方法的参数信息：" + Arrays.asList(args));
    }

    /**
     * 目标方法执行后执行
     */
    @After("executeEmployeeController()")
    public void afterAdvice() {
        System.out.println("======后置通知======");
    }

    @AfterReturning(pointcut = "executeEmployeeController()", returning = "keys")
    public void afterReturningAdvice(String keys) {
        System.out.println("======后置返回通知======");
        System.out.println("后置返回通知  返回值：" + keys);
    }

    /**
     * 后置异常通知
     * 定义一个名字，该名字用于匹配通知实现方法的一个参数名，当目标方法抛出异常返回后，将把目标方法抛出的异常传给通知方法；
     * throwing 只有目标方法抛出的异常与通知方法相应参数异常类型时才能执行后置异常通知，否则不执行，
     *
     * @param joinPoint
     * @param exception
     */
    @AfterThrowing(value = "executeEmployeeController()", throwing = "exception")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception exception) {
        System.out.println("======后置异常通知======");
    }

    /**
     * 环绕通知：
     * 环绕通知非常强大，可以决定目标方法是否执行，什么时候执行，执行时是否需要替换方法参数，执行完毕是否需要替换返回值。
     * 环绕通知第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型
     */
    @Around(value = "executeEmployeeController()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("- - - - - 环绕通知 - - - -");
        System.out.println("环绕通知的目标方法名：" + proceedingJoinPoint.getSignature().getName());
        try {
            //obj之前可以写目标方法执行前的逻辑
            //调用执行目标方法
            Object obj = proceedingJoinPoint.proceed();
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println("- - - - - 环绕通知 end - - - -");
        }
        return null;
    }

}
