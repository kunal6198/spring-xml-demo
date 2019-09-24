package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        Movie movie = new Movie();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie m=(Movie) context.getBean("movie");
        System.out.println(m.getActor().getName());

        movie.setApplicationContext(context);


        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean = (BeanLifecycleDemoBean) context1.getBean("cycle");



//        Movie m2=(Movie) context.getBean("movie2");
//        System.out.println(m==m2);
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
//        Movie m1=(Movie) context1.getBean("movie1");
//        System.out.println(m1.getActor().getName());

//       Actor m1=(Actor) context.getBean("actor1");
//      System.out.println(m1.getName());
  }
}
