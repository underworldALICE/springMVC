1.加入依赖
springMVC spring mybatis三个框架的依赖,jackson依赖 mysql驱动 druid连接池 jsp servlet依赖
2.写web.xml
    1)注册DispatcherServlet,目的
        1.创建spring的容器对象,才能创建Controller类对象
        2.创建的是Servlet,才能接受用户的请求
    2)注册spring的监听器ContextLoaderListener,目的
        1.创建spring的容器对象,才能创建service,dao等对象
    3)注册字符集过滤器,解决post请求乱码的问题
5.写springMVC spring mybatis的配置文件
    1)springMVC配置文件
    2)spring配置文件
    3)mybatis配置文件
    4)数据库的属性配置文件
6.写代码,dao接口和mapper文件,service和实现类,controller,实体类
6.写jsp页面
