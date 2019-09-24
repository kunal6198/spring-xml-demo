package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public void Init()
    {
        System.out.println("init");
    }
    public void destroy()
    {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties");
    }
}
