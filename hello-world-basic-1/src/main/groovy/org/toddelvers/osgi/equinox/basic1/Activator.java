package org.toddelvers.osgi.equinox.basic1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * This class MUST have a public, no-arg constructor so that the OSGi
 * framework can instantiate it with: <code>Class.newInstance()</code>
 */
public class Activator implements BundleActivator {

    /**
     * This method is called when the OSGi container starts your bundle and is about
     * to put it into service. The <code>context</code> passed into here is how your
     * bundle interacts with the OSGi framework (requesting services, interfaces, etc.) <br/><br/>
     *
     * This method is typically used for resource initialization (e.g. get a database connection, etc.) <br/><br/>
     *
     * If an exception occurs at this stage, the container will mark the bundle
     * as <i>stopped</i> and will not put it into service.
     */
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Hello world!");
    }

    /**
     * This is called when the OSGi container is shutting down your bundle.
     * This is the place to perform cleanup tasks (e.g. releasing a database connection)
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Goodbye world!");
    }
}
