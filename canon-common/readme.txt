2019-12-04
正式开始自己的项目

后面的项目维护就放在这里进行了;
目前来说,这个项目一穷二白;但是没有关系后续持续的维护就好了;

公寓项目有一些问题,就是将model和api这些分的太散了;
对于中大型项目来说,这样分层更加清晰;
但是因为有dubbo的存在,导致了maven的依赖很不明确,依赖关系混乱;
所以,我觉得将所有model和对内api都放在同一个地方进行维护,这样维护的成本相对来说低很多


首先我自己先构建一个单点登录;采用springboot的方式去构建,尽量采用新的技术;这样会让自己有更多的提升


构建:
    common
    cas-web
    cas-core


首先要搭建一个单点登录
这个应该不难
分析一下,
    目前来说,业界的流行方法是使用cas进行单点登录
    cas作为一台独立的单点登录服务器
    服务端通过拦截请求的方式,验证用户是否已经登录;
    如果未登录,那么转跳至登录页面


    实现的难点是什么?
    主要我没有一个具体的代码思路方案;
    对着别人的参考当然可以,不过还是要结合自己的方式去构建



    springboot 参考配置文件
    https://eirunye.github.io/2018/08/20/Spring-Boot-%E9%85%8D%E7%BD%AE%E6%96%87%E4%BB%B6%E8%AE%BE%E7%BD%AE-%E4%B8%89/

    springboot 配置文档
    https://github.com/eirunye/SpringBoot_Property/blob/master/src/main/resources/application.properties

    springboot官方配置文档
    https://docs.spring.io/spring-boot/docs/2.0.4.RELEASE/reference/htmlsingle/#common-application-properties



2019-12-05 11:22
目前来说,我已经初步完成了spring集成,以及json的转换;
spring上下文设置;
因为springboot的单元测试很简单,我就不弄了;


那么现在开始集成springcould

集成springcould有几点不是很明白
1.注册中心的搭建,
2.服务提供者的搭建
3.服务消费者的搭建

这三者怎么结合到一起

# springcould 参考文件
https://www.cnblogs.com/edisonchou/p/java_spring_cloud_foundation_sample_list.html

1.首先我需要搭建一个注册中心
2.消费者
2.服务提供者

已经搭建完成,不过觉得这个很弱智
后面再继续看


https://segmentfault.com/a/1190000015804295#item-2-3









