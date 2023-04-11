package com.shop.myapp.service;

import com.shop.myapp.dto.ProjectDTO;


import java.util.List;

public interface ProjectService {
    List<ProjectDTO> findAll();
    ProjectDTO getProject( long id);
    int deleteProject(long id);
    int update(ProjectDTO projectDTO);
    int insert(ProjectDTO projectDTO);
}
