package com.study.cloud.swaggerone;


import com.google.common.base.Predicates;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
               // .groupName("v1")
                .apiInfo(apiInfo())
                .select()
               // .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // .apis(RequestHandlerSelectors.basePackage("com.linkface.statisic.recordapi.controller"))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))// 错误路径不监控
                //.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
                //.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.cloud")))
                //.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.data.rest.webmvc")))
                //.paths(PathSelectors.regex("/*"))// 对根下所有路径进行监控
                .paths(PathSelectors.any())
               // .paths(PathSelectors.ant("/api/v1/**"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("User Manager APIs")
                //.description("--------------------------------")
                // .termsOfServiceUrl("www.linkface.cn")
                //  .contact(new Contact("huangqijun","www.linkface.cn","huangqj@linkface.cn"))
                .version("0.1.1")
                .build();
    }


}
