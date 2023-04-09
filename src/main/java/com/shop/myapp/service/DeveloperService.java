package com.shop.myapp.service;

import com.shop.myapp.dto.DeveloperDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DeveloperService {

    List<DeveloperDTO> findAll();

    DeveloperDTO getDeveloper(long id);

    int deleteDeveloper(@Param("id") long id);

    int insert(DeveloperDTO developerDTO);

    int update(DeveloperDTO developerDTO);

}
