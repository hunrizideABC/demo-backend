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
	DeveloperMapper developerMapper;
	@Test
	void test() {
		DeveloperDTO res = new DeveloperDTO();
		res.setId(9);
		res.setField("ttt");
		res.setName("xxx");
		System.out.println(developerMapper.update(res));
	}

}
