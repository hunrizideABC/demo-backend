package com.shop.myapp.service.impl;

import com.shop.myapp.dao.DeveloperMapper;
import com.shop.myapp.dto.DeveloperDTO;
import com.shop.myapp.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperServiceImpl implements DeveloperService {
    @Autowired
    DeveloperMapper developerMapper;
    @Override
    public List<DeveloperDTO> findAll() {
        return developerMapper.findAll();
    }

    @Override
    public DeveloperDTO getDeveloper(long id) {
        return developerMapper.getDeveloper(id);
    }

    @Override
    public int deleteDeveloper(long id) {
        return developerMapper.deleteDeveloper(id);
    }

    @Override
    public int insert(DeveloperDTO developerDTO) {
        return developerMapper.insert(developerDTO);
    }

    @Override
    public int update(DeveloperDTO developerDTO) {
        return developerMapper.update(developerDTO);
    }
}
