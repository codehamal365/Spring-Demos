
# OpenAPI Generator

用于代码生成，试用于maven/gradle插件或cli工具,来构建model和interface。

请参考[https://openapi-generator.tech/docs/installation]

## use jakarta instead of javax
在<configOptions>里配置
```xml
<useJakartaEe>true</useJakartaEe>
```

## springDoc ui用于启动本地swagger-ui
```xml
 <dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>1.8.0</version>
</dependency>
```