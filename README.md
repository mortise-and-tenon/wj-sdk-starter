# 腾讯问卷 Java SDK Spring Boot Starter

#### 介绍
Spring Boot Starter for 腾讯问卷 Java SDK

#### 快速开始

1. Spring Boot 项目依赖中引入 `Starter`，以 `maven`为例：
```xml
<dependency>
    <groupId>fun.mortnon.wj-java-sdk</groupId>
    <artifactId>wj-spring-boot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```

2. 在 Spring Boot 项目的配置文件中配置问卷的 `appId` 和 `secret`，以 `application.yaml` 为例：
```yaml
mortnon:
  wj:
    app-id: XXXXX
    app-secret: YYYYY
```

3. 在代码中使用自动注入的对象，有两种方式：
    - 第一种，引用注入的 `WjService` 对象，再通过 `WjService` 获取具体的服务对象
    ```java
    @Autowired
    private WjService wjService;
    ```

    ```java
    WjManageService wjManageService = wjService.getWjManageService();
    ```

    - 第二种（**推荐**），引用具体的服务对象，如 `WjManageService`：
    ```java
    @Autowired
    private WjManageService wjManageService;
    ```

### Demo

查看源码中的 `demo` 目录中的项目
