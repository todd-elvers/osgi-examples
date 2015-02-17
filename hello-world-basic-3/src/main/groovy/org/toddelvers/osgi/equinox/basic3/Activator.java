package org.toddelvers.osgi.equinox.basic3;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.toddelvers.osgi.equinox.basic2.service.HelloService;

public class Activator implements BundleActivator {

    ServiceReference helloServiceReference;

    public void start(BundleContext context) throws Exception {
        System.out.println("Activator: Executing .start()...");

        /**
         * If multiple services are registered under the same interface, the service with the
         * highest priority is selected. This priority is defined as the service reference with the highest ranking
         * (as specified in its {@link org.osgi.framework.Constants#SERVICE_RANKING} property) is returned.
         */
        System.out.println("Activator:   Requesting reference to service that implements, and is registered under, HelloService...");
        helloServiceReference = context.getServiceReference(HelloService.class.getName());

        System.out.println("Activator:   Requesting the actual HelloService implementation from the service reference...");
        HelloService helloService = (HelloService) context.getService(helloServiceReference);

        System.out.println("Activator:   Invoking helloService.sayHello()...");
        System.out.println(helloService.sayHello());

        System.out.println("Activator: Finished .start().");
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("Activator: Stopping...");
        context.ungetService(helloServiceReference);
    }
}