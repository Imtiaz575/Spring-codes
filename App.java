package com.marmodpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cty=new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee em=(Employee) cty.getBean("id1");
        em.printEmploye();
    }
}
