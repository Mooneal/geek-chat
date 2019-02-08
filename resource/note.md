## 项目目标
- 掌握基于Netty的websocket开放
- 掌握BIO/NIO/AIO基础知识
- MUI与H5Plus(H5+)相关知识点开发
- 掌握NGINX+fastdfs分布式文件系统搭建与使用
- 掌握全栈式混合app开发
- 掌握项目的部署

## Netty
- Netty是一个提供了易于使用的API的客户端/服务器框架
- 并发高 - NIO（非阻塞IO）
- 传输块 - 零拷贝

### 阻塞和非阻塞
- 线程访问资源，该资源是否准备就绪的一种处理方式

![](https://github.com/geekerstar/geek-chat/blob/master/img/1.png)

### 同步和异步
- 同步和异步是指访问数据的一种机制

![](https://github.com/geekerstar/geek-chat/blob/master/img/2.png)


### BIO
- 同步阻塞IO，Block IO

![](https://github.com/geekerstar/geek-chat/blob/master/img/3.png)

### NIO
- 同步非阻塞IO，New IO(Non-Block IO)


![](https://github.com/geekerstar/geek-chat/blob/master/img/4.png)


### AIO
- 异步非阻塞IO

### 生活实例
- BIO：去上厕所，坑全满，此时我一直光等着，主动观察哪个坑位好了，只要有坑位释放了，我就立马去占坑
- NIO：厕所坑全满，此时我跑出去抽烟或者做别的事，然后时不时再主动的去厕所有没有坑位释放，如果有坑了自己去占坑
- 异步阻塞：我在厕所，等有人好了之后来通知后，然后再去占坑
- AIO：我在厕所外抽烟玩手机，等有人好了之后来通知我去占坑

### BIO、NIO、AIO
- BIO：发起请求 --> 一直阻塞 --> 处理完成
- NIO：Selector主动轮询channel --> 处理请求 --> 处理完成
- AIO：发起请求 --> 通知回调

### 常见问题
- BIO、NIO、AIO的区别是什么
- 什么是同步阻塞BIO
- 什么是同步非阻塞NIO
- 什么是异步非阻塞AIO

### Reactor线程模型
- 单线程模型：所有的IO操作都由同一个NIO线程处理的

![](https://github.com/geekerstar/geek-chat/blob/master/img/5.png)

- 多线程模型：由一组NIO线程处理IO操作

![](https://github.com/geekerstar/geek-chat/blob/master/img/6.png)

- 主从线程模型：一组线程池接受请求，一组线程池处理IO

![](https://github.com/geekerstar/geek-chat/blob/master/img/7.png)


## 实时通信相关概念
- ajax轮询
- Long pull
- websocket

### websocket api
- var socket = new WebSocket("ws://[ip]:[port]");
- 生命周期：onopen() onmessage() onerror() onclose()
- 主动方法：Socket.send() Socket.close()
