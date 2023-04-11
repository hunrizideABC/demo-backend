package com.shop.myapp.controller;

import com.shop.myapp.dto.PageDTO;
import com.shop.myapp.dto.PageForm;
import com.shop.myapp.dto.ProjectDTO;
import com.shop.myapp.dto.ResponseDTO;
import com.shop.myapp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/findAll")
    public ResponseDTO findAll(){
        ResponseDTO responseDTO = new ResponseDTO();
        List<ProjectDTO> projectDTOList =  projectService.findAll();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(projectDTOList);
        return responseDTO;
    }

    @GetMapping("/getProject/{id}")
    public ResponseDTO getProject(@PathVariable long id){
        ResponseDTO responseDTO = new ResponseDTO();
        ProjectDTO projectDTO =  projectService.getProject(id);
        responseDTO.setResultCode("OK");
        responseDTO.setRes(projectDTO);
        return responseDTO;
    }

    @GetMapping("/delete/{id}")
    public ResponseDTO delete(@PathVariable long id){
        ResponseDTO responseDTO = new ResponseDTO();
        int res =  projectService.deleteProject(id);
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

    @PostMapping("/insert")
    public ResponseDTO insert(@RequestBody ProjectDTO projectDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        int res =  projectService.insert(projectDTO);
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

    @PostMapping("/update")
    public ResponseDTO update(@RequestBody ProjectDTO projectDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        int res =  projectService.update(projectDTO);
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

    @PostMapping("/page")
    public ResponseDTO page(@RequestBody PageForm pageForm){
        ResponseDTO responseDTO = new ResponseDTO();
        PageDTO<ProjectDTO> pageDTP =  projectService.findByPage(pageForm.getPage(),pageForm.getSize());
        responseDTO.setResultCode("OK");
        responseDTO.setRes(pageDTP);
        return responseDTO;

    }
}
