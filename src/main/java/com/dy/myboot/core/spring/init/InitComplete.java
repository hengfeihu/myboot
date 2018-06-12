package com.dy.myboot.core.spring.init;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * 初始化完毕后输出项目访问路径
 *
 * @author 郭胜凯
 * @time 2016年6月28日上午9:40:05
 * @email 719348277@qq.com
 */
@Component
public class InitComplete implements ApplicationListener<ApplicationEvent> {

    private static final Logger logger = LoggerFactory.getLogger(InitComplete.class);

    @Override
    public void onApplicationEvent(ApplicationEvent arg0) {
        Object source = arg0.getSource();
        if (source.getClass().getName().equals("org.springframework.web.context.support.XmlWebApplicationContext")) {
            @SuppressWarnings("resource")
            XmlWebApplicationContext application = (XmlWebApplicationContext) source;
            String line = System.getProperty("line.separator");
            if (logger.isDebugEnabled()) {
                logger.debug(line + line + "========================>>项目路径：" + application.getApplicationName() + line + line);
            }
        }
    }
}
