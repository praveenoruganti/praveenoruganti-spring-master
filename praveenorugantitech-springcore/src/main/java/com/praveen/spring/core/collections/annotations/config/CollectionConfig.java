package com.praveen.spring.core.collections.annotations.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.praveen.spring.core.collections.annotations.bean.CollectionsBean;

@Configuration
public class CollectionConfig {
 
    @Bean
    public CollectionsBean getCollectionsBean() {
        return new CollectionsBean();
    }
 
    @Bean
    public List<String> nameList() {
        return Arrays.asList("Praveen", "Prasad", "Bhaja");
    }
    
    
}