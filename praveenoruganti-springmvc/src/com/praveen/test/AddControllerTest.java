package com.praveen.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.praveen.controller.AddController;

public class AddControllerTest {
	
	 private MockMvc mockMvc;

	    private AddController addController;
	    
	    @Before
	    public void setup(){
	    	addController = new AddController();
	        mockMvc = MockMvcBuilders.standaloneSetup(addController).build();

	    }

	    @Test
	    public void testAdd() throws Exception{
	        mockMvc.perform(post("/process").param("num1", "10").param("num2","20").param("add", ""))
	                .andExpect(status().isOk())
	                .andExpect(view().name("display"));
	    }
	    
	    @Test
	    public void testDuplicate() throws Exception{
	        mockMvc.perform(post("/process").param("num1", "20").param("num2","20").param("duplicate", ""))
	                .andExpect(status().isOk())
	                .andExpect(view().name("error"));
	    }
	    
	    @Test
	    public void testNoDuplicate() throws Exception{
	        mockMvc.perform(post("/process").param("num1", "20").param("num2","30").param("duplicate", ""))
	                .andExpect(status().isOk())
	                .andExpect(view().name("display"));
	    }

}
