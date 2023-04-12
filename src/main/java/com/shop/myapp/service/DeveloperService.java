package com.shop.myapp.service;

import com.shop.myapp.dto.DeveloperDTO;
import com.shop.myapp.dto.PageDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeveloperService {
    List<DeveloperDTO> findAll();
    DeveloperDTO findOne(long id);
    int delete(long id);
    int update(DeveloperDTO developerDTO);
    int insert(DeveloperDTO developerDTO);
    PageDTO<DeveloperDTO> findPage(int page, int size);


}
