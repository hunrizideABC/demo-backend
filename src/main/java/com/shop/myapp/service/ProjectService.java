package com.shop.myapp.service;

import com.shop.myapp.dto.PageDTO;
import com.shop.myapp.dto.ProjectDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProjectService {
    List<ProjectDTO> findAll();

    ProjectDTO findOne(@Param("id") long id);

    PageDTO<ProjectDTO> findPage(int page, int size);

    int delete(@Param("id") long id);
    int update(ProjectDTO projectDTO);

    int insert(ProjectDTO projectDTO);
}
