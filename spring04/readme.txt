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
    DI:依赖注入，就是为对象的属性赋值。
1、设置注入
    调用相关属性的setter方法完成赋值的过程。
2、构造器注入
    调用相关构造器完成对象创建和属性赋值的过程。
3、命名空间注入
    p命名空间注入，设置注入的另外一种写法
    c命名空间注入，构造器注入的另外一种写法
    了解即可
4、数组和集合注入
    重点掌握
5、域属性自动注入
    byName:系统会从容器中查找与域属性同名的Bean，将其自动注入。byType:系统会从容器中查找与域属性同类型的Bean，将其自动注入。
    另外:系统会从容器中查找与域属性类型具有is-a关系的Bean，将其自动注入。与域属性类型具有is-a关系的Bean不能多于一个。
6、SPEL注入
    spring Expression Language.Spring EL表达式。

7、为应用指定多个Spring配置文件
    (1)并列关系:加载配置文件可以采用可变参数、数组、通配符。
    (2)包含关系:加载主配置文件，主配置文件包含其他配置文件

三、基于注解的DI

1)搭建环境
 (1)导入AOP的jar包
 (2)配置文件添加context约束
 (3)在配置文件中注册组件扫描器

2) @Component注解
    与@Component功能相同，意义不同的注解，还有:
    @Service:注解在Service类上
    @Respository:注解在Dao类上
    @Controller:注解在SpringMVC的处理器上

3)域属性的自动注入注解
 (1) byType: @Autowired, @Resource 任选一种都可以
 (2) byName:既可以两种@Autowired和@Qualifier同时使用，也可以只用@Resource(name = "mySchool")

4)其他注解
@scope
@PostConstruct
@PreDestroy

5)注解注入:既不是设置注入，也不是构造器注入

6)注解与XML配置，谁的优先级高?
XML配置的优先级高，目的是便于后期项目的维护。

