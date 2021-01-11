package com.praveen.spring.core.collections.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.praveen.spring.core.collections.annotations.bean.CollectionsBean;
import com.praveen.spring.core.collections.annotations.config.CollectionConfig;

public class CollectionsTest {
	
	private static ApplicationContext context;

	public static void main(String args[]) {
		context = new AnnotationConfigApplicationContext(CollectionConfig.class);
		CollectionsBean collectionsBean = context.getBean(
		  CollectionsBean.class);
		collectionsBean.printNameList();
	}

}
