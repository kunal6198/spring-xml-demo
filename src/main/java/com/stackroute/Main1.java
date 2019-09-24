package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.Resource;


public class Main1 {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Movie mov = (Movie) factory.getBean("movie");
        System.out.println(mov.getActor().getName());
        
        Movie movie = new Movie();
        movie.setBeanFactory(factory);


    }
}
