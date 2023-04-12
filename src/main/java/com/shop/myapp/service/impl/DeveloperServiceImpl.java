package com.shop.myapp.service.impl;

import com.shop.myapp.dao.DeveloperMapper;
import com.shop.myapp.dto.DeveloperDTO;
import com.shop.myapp.dto.PageDTO;
import com.shop.myapp.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DeveloperServiceImpl implements DeveloperService {
    @Autowired
    DeveloperMapper developerMapper;
    @Override
    public List<DeveloperDTO> findAll() {
        return developerMapper.findAll();
    }

    @Override
    public DeveloperDTO findOne(long id) {
        return developerMapper.findOne(id);
    }

    @Override
    public int delete(long id) {
        return developerMapper.delete(id);
    }

    @Override
    public int update(DeveloperDTO developerDTO) {
        return developerMapper.update(developerDTO);
    }

    @Override
    public int insert(DeveloperDTO developerDTO) {
        return developerMapper.insert(developerDTO);
    }

    @Override
    public PageDTO<DeveloperDTO> findPage(int page, int size) {
        PageDTO<DeveloperDTO> pageDTO = new PageDTO<>();
        pageDTO.setSize(size);
        pageDTO.setPage(page);
        pageDTO.setTotal(developerMapper.count());
        Map<String, Integer> map = new HashMap<>();
        map.put("page",size*(page-1));
        map.put("size",size);
        pageDTO.setRows(developerMapper.findPage(map));
        return pageDTO;
    }
}
