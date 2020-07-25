package com.praveen.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.praveen.controller.HomeController;

public class HomeControllerTest {
	
	 private MockMvc mockMvc;

	    private HomeController homeController;
	    
	    @Before
	    public void setup(){
	    	homeController = new HomeController();
	        mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();

	    }

	    @Test
	    public void testHomeInit() throws Exception{
	        mockMvc.perform(get("/returnHelloWorld"))
	                .andExpect(status().isOk());
	            
	    }
	    
	   

}
