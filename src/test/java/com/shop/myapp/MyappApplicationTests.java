package com.shop.myapp;

import com.shop.myapp.dao.DeveloperMapper;
import com.shop.myapp.dto.DeveloperDTO;
import com.shop.myapp.service.DeveloperService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyappApplicationTests {
	@Autowired
	DeveloperService developerService;
	@Test
	void test() {
		DeveloperDTO res = developerService.getDeveloper(9);
		System.out.println(res.getName());
	}

}
