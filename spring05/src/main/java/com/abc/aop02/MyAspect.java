package com.abc.aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//表示当前类是切面类
public class MyAspect {

    //前置通知
   public void myBefore(){
        System.out.println("执行前置通知方法");
    }

    //前置通知
    public void myBefore(JoinPoint jp){
        System.out.println("执行前置通知方法="+jp);
    }

    //后置通知
    public void myAfterReturning(){
        System.out.println("执行后置通知方法");
    }

    //后置通知，可以获取目标方法的执行结果（返回值）
    public void myAfterReturning(Object result){
        System.out.println("执行后置通知方法result="+result);
    }

    //环绕通知，不仅可以获取目标方法的执行结果（返回值）,还可以改变其值
    public Object myAroundReturning(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("执行环绕通知--目标方法执行之前");
        //执行环绕方法
        Object proeeed = pjp.proceed();
        System.out.println("执行环绕通知--目标方法执行之后");
        if(proeeed!=null){
            proeeed = ((String)proeeed).toUpperCase();
        }
        return proeeed;
    }

    //异常通知
    public void myThrowing(){
        System.out.println("执行异常通知方法");
    }
    //异常通知
    public void myThrowing(Exception ex){
        System.out.println("执行异常通知方法ex="+ex);
    }

    //最终通知，无论是否发生异常都会执行
    public void myAfter(){
        System.out.println("执行最终通知方法");
    }

    public void myAfter2(){
        System.out.println("执行最终通知方法2");
    }

    //定义切入点，给切入点定义别名，简化代码书写
    private void doForthPointcut(){};
}
