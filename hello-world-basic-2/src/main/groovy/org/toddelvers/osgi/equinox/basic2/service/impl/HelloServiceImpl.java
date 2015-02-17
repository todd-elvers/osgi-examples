package org.toddelvers.osgi.equinox.basic2.service.impl;

import org.toddelvers.osgi.equinox.basic2.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "HelloServiceImpl: Hello!!!";
    }

}
