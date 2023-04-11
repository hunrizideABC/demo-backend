package com.shop.myapp.controller;

import com.shop.myapp.dto.DeveloperDTO;
import com.shop.myapp.dto.ResponseDTO;
import com.shop.myapp.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/developer")
public class DeveloperController {
    @Autowired
    DeveloperService developerService;

    @GetMapping("/findAll")
    public ResponseDTO findAll(){
        ResponseDTO responseDTO = new ResponseDTO();
        List<DeveloperDTO> developerDTOList =  developerService.findAll();
        responseDTO.setRes(developerDTOList);
        responseDTO.setResultCode("OK");
        return responseDTO;
    }

    @GetMapping("/getDeveloper/{id}")
    public ResponseDTO findDeveloper(@PathVariable long id){
        ResponseDTO responseDTO = new ResponseDTO();
        DeveloperDTO developerDTO =  developerService.getDeveloper(id);
        responseDTO.setRes(developerDTO);
        responseDTO.setResultCode("OK");
        return responseDTO;
    }

    @GetMapping("/deleteDeveloper/{id}")
    public ResponseDTO delete(@PathVariable long id){
        ResponseDTO responseDTO = new ResponseDTO();
        int res =  developerService.deleteDeveloper(id);
        responseDTO.setRes(res);
        responseDTO.setResultCode("OK");
        return responseDTO;
    }

    @PostMapping("/insert")
    public ResponseDTO insert(@RequestBody DeveloperDTO developerDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        int res =  developerService.insert(developerDTO);
        responseDTO.setRes(res);
        responseDTO.setResultCode("OK");
        return responseDTO;
    }

    @PostMapping("/update")
    public ResponseDTO update(@RequestBody DeveloperDTO developerDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        int res =  developerService.update(developerDTO);
        responseDTO.setRes(res);
        responseDTO.setResultCode("OK");
        return responseDTO;
    }
}
