package com.mm.blog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: z_houx
 * @create: 2020-06-02 20:22
 * @Description:主配置类
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.mm.blog"})
@MapperScan(basePackages = {"com.mm.blog.mapper"})
public class BlogConfig {

}
