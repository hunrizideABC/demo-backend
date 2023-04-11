package com.shop.myapp.dao;

import com.shop.myapp.dto.ProjectDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectMapper {

    List<ProjectDTO> findAll();
    ProjectDTO getProject(@Param("id") long id);
    int deleteProject(@Param("id") long id);
    int update(ProjectDTO projectDTO);
    int insert(ProjectDTO projectDTO);

    public List<ProjectDTO> findByPage(Map<String, Object> params);

    public long count();

}
