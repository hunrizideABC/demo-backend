package com.shop.myapp.service;

import com.shop.myapp.dto.DeveloperDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DeveloperService {

    List<DeveloperDTO> findAll();

    DeveloperDTO getDeveloper(long id);
}
