IoC
    Inversion of contorl(控制翻转）。将原来由代码操纵的对象控制权，交由第三方容器，即翻转给了第三方容器。
这种对象的依赖关系管理方式，称为IoC。
    Ioc是一种思想。有很多实现方式，比较出名的两种:
DL: Dependency Lookup（依赖查找）。最典型的应用是JNDI，Java Naming and Directory Interface (Java 名称与目录接口)JDNI就是一个第三方容器。
DI: Dependency Injection(依赖注入）。目前最优秀的解耦方式，典型应用是Spring.

一、Bean的装配
Bean的装配，简单说就是对象的创建。容器根据代码的要求，创建好对象后，再将对象传递给代码的过程。
1、默认方式
容器调用Bean的无参构造器创建对象。
2、动态工厂Bean
3、静态工厂Bean
4、Bean的作用范围
5、Bean后处理器
它是被系统自动调用的。
6、Bean的生命周期

二、基于XML的DI

三、基于注解的DI
