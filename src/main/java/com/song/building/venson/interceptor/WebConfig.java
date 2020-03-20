package com.song.building.venson.interceptor;

import org.h2.engine.SessionInterface;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //registry.addInterceptor(new SessionInterfaceptor()).addPathPatterns("/**");
    }

}
