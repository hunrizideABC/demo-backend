package com.shop.myapp.dao;

import com.shop.myapp.dto.DeveloperDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeveloperMapper {
	List<DeveloperDTO> findAll();
	DeveloperDTO getDeveloper(@Param("id") long id);
}
