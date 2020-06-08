package com.mm.blog.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootConfiguration       //这个表示的是当前是一个配置文件就类似于XML文件
@EnableSwagger2      //使能这个Swagger的配置
public class SwaggerConfig {
    /**
     * bean注解：表示的意思是将下面的方法生成的对象放到IOC容器中去
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // .apis(RequestHandlerSelectors.basePackage("com.mm.blog.controller")) ：表示要扫描的Controller的地址
                .apis(RequestHandlerSelectors.basePackage("com.mm.blog.controller")) // 注意修改此处的包名
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        System.out.println("执行了:ApiInfo");
        return new ApiInfoBuilder()
                .title("mmBlog接口") // 这个表示的是接口文档的名字
                .description("接口测试") // 这个表示的是说明
                //.termsOfServiceUrl("http://localhost:8080/swagger-ui.html") // //表示的是生成接口的地址的访问地址
                .contact("zhou") // 当前接口的作者是谁
                .version("1.0")      //当前接口文档的版本号
                .build();            //调用构建的方法进行构建
    }
}