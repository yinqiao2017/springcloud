
使用说明：
1.启动配置中心 config-server，其他工程需要它来加载自己的配置文件。

2.启动服务注册中心 eureka-server，用来发现其他服务。启动工程后，
  访问：http://localhost:1111/
  可以看到服务注册中心主页。
    
3.执行spring-cloud目录下的sql文件，创建数据库。
  启动项目 goods-service1
  访问：http://localhost:1111/
  可以看到我们的服务（compute-service:2224）在注册中心被注册了。
  访问：http://localhost:2224/goods/ 
  页面显示了数据库中保存的数据，算是实现了基本的服务功能。

4.启动服务 goods-service2
  访问：http://localhost:1111/
  可以看到COMPUTE-SERVICE服务有两个单元正在运行：
  compute-service:2224
  compute-service:2223
  这是两个相同的项目，只是端口不一样。用来演示负载均衡和断路器
  
5.启动项目eureka-feign 
  快速访问两次：http://localhost:3333/goods
  然后查看compute-service的两个服务项目的后台，分别输出了日志内容。表示它们分别处理了一次请求。实现了对服务调用的均衡负载
  
6.