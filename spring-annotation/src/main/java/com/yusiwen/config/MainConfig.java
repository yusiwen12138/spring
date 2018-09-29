package com.yusiwen.config;

import com.yusiwen.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration  //配置类
//@ComponentScan(value = "com.yusiwen", excludeFilters = {
//        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
//})
//@ComponentScan(value = "com.yusiwen", includeFilters = {
//        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
//}, useDefaultFilters = false)


@ComponentScan(value = "com.yusiwen", includeFilters = {
        @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {Controller.class})
}, useDefaultFilters = false)
public class MainConfig {

    //注册一个bean
    @Bean("person02")
    public Person person01(){
        return new Person("yusiwen", "18702515518");
    }
}
