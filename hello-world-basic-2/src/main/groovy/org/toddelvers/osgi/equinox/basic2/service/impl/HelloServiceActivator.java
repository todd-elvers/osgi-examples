package org.toddelvers.osgi.equinox.basic2.service.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.toddelvers.osgi.equinox.basic2.service.HelloService;

public class HelloServiceActivator implements BundleActivator {

    ServiceRegistration helloServiceRegistration;

    public void start(BundleContext context) throws Exception {
        System.out.println("HelloServiceActivator: Instantiating an instance of HelloServiceImpl");
        HelloService helloService = new HelloServiceImpl();

        System.out.println("HelloServiceActivator: Registering HelloServiceImpl under the HelloService interface");
        helloServiceRegistration = context.registerService(
                HelloService.class.getName(),   // Name of the interface to register this under
                helloService,                   // The object to register as a service
                null                            // Properties of the object (a Dictionary object) used to filter out which impl. a user wants
        );
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("HelloServiceActivator: Unregistering HelloServiceImpl under the HelloService interface");
        helloServiceRegistration.unregister();
    }
}