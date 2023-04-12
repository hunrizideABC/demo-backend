package com.shop.myapp.controller;

import com.shop.myapp.dto.PageForm;
import com.shop.myapp.dto.ProjectDTO;
import com.shop.myapp.dto.ResponseDTO;
import com.shop.myapp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/findAll")
    public ResponseDTO findAll(){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setRes(projectService.findAll());
        responseDTO.setResultCode("OK");
        return responseDTO;
    }

    @GetMapping("/findOne/{id}")
    public ResponseDTO findOne(@PathVariable("id") long id){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setRes(projectService.findOne(id));
        responseDTO.setResultCode("OK");
        return responseDTO;
    }

    @GetMapping("/delete/{id}")
    public ResponseDTO delete(@PathVariable("id") long id){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setRes(projectService.delete(id));
        responseDTO.setResultCode("OK");
        return responseDTO;
    }

    @PostMapping("/insert")
    public ResponseDTO insert(@RequestBody ProjectDTO projectDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setRes(projectService.insert(projectDTO));
        responseDTO.setResultCode("OK");
        return responseDTO;
    }

    @PostMapping("/update")
    public ResponseDTO update(@RequestBody ProjectDTO projectDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setRes(projectService.update(projectDTO));
        responseDTO.setResultCode("OK");
        return responseDTO;
    }

    @PostMapping("/findPage")
    public ResponseDTO findPage(@RequestBody PageForm pageForm){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setRes(projectService.findPage(pageForm.getPage(),pageForm.getSize()));
        responseDTO.setResultCode("OK");
        return responseDTO;
    }

}
