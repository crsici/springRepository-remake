package com.sic.org.spring.remake.repository.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by pthanhtrung on 3/25/2016.
 */
public class MyJpaRepositoriesRegistrar implements ImportBeanDefinitionRegistrar, ResourceLoaderAware, EnvironmentAware {


    private ResourceLoader resourceLoader;
    private Environment environment;

    public MyJpaRepositoriesRegistrar() {

    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
