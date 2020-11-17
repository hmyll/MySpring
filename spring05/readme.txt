1、AOP简介
    AOP ,Aspect orient Programming,面向切面编程。它是一种思想，实现者很多，Spring就是其中之一。
    AOP是OOP的一种补充。OOP是从静态角度考虑程序的结构，而AOP是从动态角度考虑程序的运行过程。
    Spring用于降低代码耦合度。IoC用于降低的是主业务逻辑之间的耦合度，AOP用于降低主业务逻辑和系统级服务（交叉业务逻辑)
间的耦合度，将系统级服务在运行时织入到主业务逻辑之中。
    Spring的AOP底层工作原理，是使用动态代理对主业务进行增强。

2、AOP相关概念
(1)切面(Aspect)
    切面就是交叉业务逻辑，就是要对主业务逻辑进行增强的部分。AOP中常见的切面有2种:通知、顾问。
(2)织入(weaving)
    将切面切入到主业务逻辑中的过程。
(3)连接点( oinPoint)
    可以织入切面的目标类的目标方法。
(4)切入点(Pointcut)
    真正织入切面的目标类的目标方法。切入点一定是连接点，连接点未必是切入点。
(5)目标对象(Target)
    目标类创建的对象就是目标对象。
    主业务逻辑所在的类的对象是目标对象。
    用于被增强的对象是目标对象。
(6)通知(Advice)
    是一种切面，可以完成简单的织入功能。

3、Aspect]对AOP的实现
1) Aspect概述
 (1) Aspect]是什么?
    AspectJ是一个面向切面的框架，它扩展了Java语言。AspectJ定义了AOP语法，它有一个专门的编译器用来生成遵守Java字节编码规范的class文件
 (2)AspectJ、Spring与AOP的关系
   AspectJ，Spring都是AOP的实现框架。AspectJ和spring没有任何关系。

下面讲述基于spring环境下的Aspect3对AOP的实现。
(3) Aspect的通知类型
    前置通知
    后置通知
    环绕通知
    异常通知
    最终通知
(4)切入点表达式用于指定切入点。
 execution(访问权限 返回值类型︰全限定类名(接口名) 方法名(参数列表) 抛出异常)

举例;
execution(* com.abc.service.*.*(..)):表示com.abc.service包下的所有方法都是切入点。
execution(* com.abc.service.*.open*(..)):表示com.abc.service包下的所有以open开头的方法都是切入点。
execution(* *.service.*.*(..)):表示service包下的所有方法都是切入点。
com.abc.service.ISomeService.doFirst()不是切入点，而com.service.ISomeservice.doFirst()是切入点。
execution(* *..service.*.*(..)):表示service包下的所有方法都是切入点。
com.abc.service.ISomeservice.doFirst()是切入点，而com.service.ISomeService.doFirst()也是切入点。

 2)搭建Aspect]编程环境
 (1)导入jar包
    除了spring的基本jar包，还需要四个jar包:
    Aspect的核心包、Spring与Aspect3的整合包、AOP联盟的包、Spring对AoP的实现包
  (2)引入AOP约束
 (3)注册自动代理生成器

3）基于注解的Aspect编程

4) 基于XML配置文件的AspectJ编程
