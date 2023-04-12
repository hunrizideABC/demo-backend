package com.shop.myapp.dao;

import com.shop.myapp.dto.ProjectDTO;
import com.sun.org.apache.xalan.internal.xslt.Process;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


@Mapper
public interface ProjectMapper {

    List<ProjectDTO> findAll();

    ProjectDTO findOne(@Param("id") long id);

    List<ProjectDTO> findPage(Map<String,Object> params);

    long count();

    int delete(@Param("id") long id);
    int update(ProjectDTO projectDTO);

    int insert(ProjectDTO projectDTO);

}
