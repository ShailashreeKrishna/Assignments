package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.Matchers.hasSize;

import com.example.demo.entity.CabDriver;
import com.example.demo.service.CabDriverService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@SpringBootTest
@AutoConfigureMockMvc
@TestInstance(Lifecycle.PER_CLASS)
public class CabDriverTest {

	
	@Autowired
	MockMvc mock;
	
	@Autowired
	ObjectMapper mapper;
	
    @MockBean
    CabDriverService service;
    
    private CabDriver driver1;
    private CabDriver driver2;
    private CabDriver driver3;
    private CabDriver driver4;
    
    @BeforeAll
     void init() {
    	 driver1= new CabDriver(11,"Abi",578893743L,"Chennai",LocalDate.of(2000, 10, 13),4.5);
    	 driver2= new CabDriver(12,"Anu",473893743L,"Bangalore",LocalDate.of(2001, 11, 11),3.5);
    	 driver3= new CabDriver(13,"Arthi",673893743L,"Mysore",LocalDate.of(2001, 9, 9),4);
    }
    
	@DisplayName("Test FindAll method return an Array")
	@Test
	void findAll()  throws Exception{
		
		List<CabDriver> list=new ArrayList<>();
		list.add(driver1);
		list.add(driver2);
		list.add(driver3);
		//stubbing
		given(service.findAll()).willReturn(list);

		mock.perform(MockMvcRequestBuilders
                .get("/api/v1/drivers")
               .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[1].driverName", is("Anu")));
 
		
	}
	
	@DisplayName("Test add Method return status code 201 and returns the element Added")
	@Test
	void testAdd() throws Exception{
		
		 driver4 = new CabDriver(14,"Akshay",673897843L,"Shimla",LocalDate.of(2004,8,9),3.5);

		   given(service.add(driver4)).willReturn(driver4);
	       mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers")
	               .contentType(MediaType.APPLICATION_JSON)
	       .content(asJsonString(driver4)))
	     .andExpect(status().isCreated())
	     .andExpect(content().contentType(MediaType.APPLICATION_JSON))
	     .andExpect(jsonPath("$.driverName", is("Akshay")));     }


	
	public static String asJsonString(CabDriver  entity) {
		try {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(entity);
		} catch(Exception e) {
		throw new RuntimeException(e);
		}
		}

	
	@Test
	@DisplayName("Checking findById method")
	void testFindById() throws  Exception{
		
		Optional<CabDriver> item=Optional.of(driver4);
		
		given(service.findById(14)).willReturn(item);
		
		mock.perform(MockMvcRequestBuilders.get("/api/v1/drivers/14"))
		.andExpect(jsonPath("$.driverName", is("Akshay")));
		}


 

	
}
