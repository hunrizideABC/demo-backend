package com.shop.myapp;

import com.shop.myapp.dao.ProjectMapper;
import com.shop.myapp.dto.ProjectDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Tests {
    @Autowired
    ProjectMapper projectMapper;
    @Test
    void test(){
        ProjectDTO projectDTO = projectMapper.getProject(9);

        System.out.println(projectDTO.getField());
    }
}
