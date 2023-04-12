package com.shop.myapp.controller;

import com.shop.myapp.dto.DeveloperDTO;
import com.shop.myapp.dto.PageForm;
import com.shop.myapp.dto.ResponseDTO;
import com.shop.myapp.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/developer")
public class DeveloperController {
    @Autowired
    DeveloperService developerService;

    @GetMapping("/findAll")
    public ResponseDTO findAll(){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(developerService.findAll());
        return responseDTO;
    }

    @GetMapping("/findOne/{id}")
    public ResponseDTO findOne(@PathVariable("id") long id){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(developerService.findOne(id));
        return responseDTO;
    }

    @GetMapping("/delete/{id}")
    public ResponseDTO delete(@PathVariable("id") long id){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(developerService.delete(id));
        return responseDTO;
    }

    @PostMapping("/insert")
    public ResponseDTO insert(@RequestBody DeveloperDTO developerDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(developerService.insert(developerDTO));
        return responseDTO;
    }

    @PostMapping("/update")
    public ResponseDTO update(@RequestBody DeveloperDTO developerDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(developerService.update(developerDTO));
        return responseDTO;
    }

    @PostMapping("/findPage")
    public ResponseDTO findPage(@RequestBody PageForm pageForm){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(developerService.findPage(pageForm.getPage(),pageForm.getSize()));
        return responseDTO;
    }
}
