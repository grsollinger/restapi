package com.grsollinger;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@AutoConfigureMockMvc
@SpringBootTest
public class TestRestApplication {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testMain() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/customer/all")).andDo(MockMvcResultHandlers.print());
	}

}
