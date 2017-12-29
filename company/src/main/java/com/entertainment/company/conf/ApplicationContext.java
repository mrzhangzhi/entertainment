package com.entertainment.company.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * Created by zhi.zhang
 * Date: 2017/12/29
 * Time: 14:06
 * Description: 把参数放入application(全局容器)给页面使用
 */
@Component
public class ApplicationContext implements ServletContextAware {

    private static Logger LOGGER = LoggerFactory.getLogger(ApplicationContext.class);

    @Override
    public void setServletContext(ServletContext context){
        String contextPath = context.getContextPath();

        context.setAttribute("ctx",contextPath);
    }

}
