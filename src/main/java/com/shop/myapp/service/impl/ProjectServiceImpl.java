package com.shop.myapp.service.impl;

import com.shop.myapp.dao.ProjectMapper;
import com.shop.myapp.dto.PageDTO;
import com.shop.myapp.dto.ProjectDTO;
import com.shop.myapp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public PageDTO<ProjectDTO> findByPage(int page, int size) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", (page-1)*size);
        params.put("size", size);
        PageDTO<ProjectDTO> pageDTO = new PageDTO<ProjectDTO>();
        pageDTO.setPage(page);
        pageDTO.setSize(size);
        List<ProjectDTO> list = projectMapper.findByPage(params);
        pageDTO.setRows(list);
        pageDTO.setTotal(projectMapper.count());
        return pageDTO;
    }


}
