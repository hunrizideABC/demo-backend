package com.shop.myapp.service.impl;

import java.util.List;

import com.shop.myapp.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.myapp.dao.SampleMapper;
import com.shop.myapp.dto.SampleDTO;


@Service
public class SampleServiceImpl implements SampleService {
	@Autowired
	SampleMapper sampleMapper;

	@Override
	public List<SampleDTO> findAll() {
		return sampleMapper.findAll();
	}

	@Override
	public SampleDTO getSample(String id) {
		return sampleMapper.getSample(id);
	}
}
