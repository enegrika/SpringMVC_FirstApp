package org.sergei.spring.lesson.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

///этот класс:  AbstractAnnotationConfigDispatcherServletInitialize (начиная со СПРИНГ 3.2)
// ЗАМЕНА WEB.XML
//  вместо нас он реализует интерфейс WebApplicationInitializer (начиная со СПРИНГ 3.0)
// для этого класса подкачиваем еще одну зависимость из мавен репозитория - java servlet api!


public class SpringConfigDispatcherInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    /// здесь подставляем наш СПРИНГ Конфиг КЛАСС

//    ЭКВИВАЛЕНТ из web.xml

//    <servlet>
//    <servlet-name>dispatcher</servlet-name>
//    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//    <init-param>
//      <param-name>contextConfigLocation</param-name>
//      <param-value>/WEB-INF/applicationContextMVC.xml</param-value>
//    </init-param>
//    <load-on-startup>1</load-on-startup>
//  </servlet>

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }


    // ЭКВИВАЛЕНТ Маппинга из WEB.XML
//    <servlet-mapping>
//    <servlet-name>dispatcher</servlet-name>
//    <url-pattern>/</url-pattern> /// УКАЗЫВАЕМ верхний уровень нашего
//  </servlet-mapping>

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}