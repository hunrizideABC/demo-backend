package com.shop.myapp.service.impl;

import com.shop.myapp.dao.ProjectMapper;
import com.shop.myapp.dto.ProjectDTO;
import com.shop.myapp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectMapper projectMapper;
    @Override
    public List<ProjectDTO> findAll() {
        return projectMapper.findAll();
    }

    @Override
    public ProjectDTO getProject(long id) {
        return projectMapper.getProject(id);
    }

    @Override
    public int deleteProject(long id) {
        return projectMapper.deleteProject(id);
    }

    @Override
    public int update(ProjectDTO projectDTO) {
        return projectMapper.update(projectDTO);
    }

    @Override
    public int insert(ProjectDTO projectDTO) {
        return projectMapper.insert(projectDTO);
    }
}
