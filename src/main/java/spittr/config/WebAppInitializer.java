package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    } // end getRootConfigClasses

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    } // end method getServletConfigClasses

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    } // end method getServletMappings
} // end method WebAppInitializer
