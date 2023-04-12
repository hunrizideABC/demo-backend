package com.shop.myapp.dao;

import com.shop.myapp.dto.DeveloperDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DeveloperMapper {
    List<DeveloperDTO> findAll();
    DeveloperDTO findOne(@Param("id") long id);
    int delete(@Param("id") long id);
    int update(DeveloperDTO developerDTO);
    int insert(DeveloperDTO developerDTO);

    List<DeveloperDTO> findPage(Map<String, Integer> params);

    int count();

}
