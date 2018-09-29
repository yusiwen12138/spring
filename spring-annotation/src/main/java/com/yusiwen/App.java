package com.yusiwen;

import com.yusiwen.bean.Person;
import com.yusiwen.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        //xml配置文件
        ApplicationContext context1 = new ClassPathXmlApplicationContext("bean.xml");
        Person person1 = (Person) context1.getBean("person");
        System.out.println( person1 );

        //注解
        ApplicationContext context2 = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person2 = context2.getBean(Person.class);
        System.out.println( person2 );

        String[] names = context2.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }


    }
}
