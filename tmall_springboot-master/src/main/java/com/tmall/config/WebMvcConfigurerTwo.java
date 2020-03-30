//package com.tmall.config;
//
//import com.tmall.interceptor.AdminLoginInterceptor;
//import com.tmall.interceptor.LoginInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//public class WebMvcConfigurerTwo extends WebMvcConfigurerAdapter {
//    @Bean
//    public AdminLoginInterceptor getLoginIntercepter() {
//        return new AdminLoginInterceptor();
//    }
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(getLoginIntercepter())
//                .addPathPatterns("/**");
//    }
//}
