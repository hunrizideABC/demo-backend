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
    public ProjectDTO findOne(long id) {
        return projectMapper.findOne(id);
    }

    @Override
    public PageDTO<ProjectDTO> findPage(int page, int size) {
        PageDTO<ProjectDTO> pageDTO = new PageDTO<ProjectDTO>();
        pageDTO.setPage(page);
        pageDTO.setSize(size);
        pageDTO.setTotal(projectMapper.count());
        Map<String,Object> map = new HashMap<>();
        map.put("page",(page-1)*size);
        map.put("size",size);
        pageDTO.setRows(projectMapper.findPage(map));
        return pageDTO;
    }

    @Override
    public int delete(long id) {
        return projectMapper.delete(id);
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
