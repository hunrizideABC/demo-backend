package com.shop.myapp.controller;

import com.shop.myapp.dto.ResponseDTO;
import com.shop.myapp.service.DeveloperService;
import com.shop.myapp.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/developer")
public class DeveloperController {
    @Autowired
    DeveloperService developerService;

    @ResponseBody    //localhost:8095/developer/findAll
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("success");
        responseDTO.setRes(developerService.findAll());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @RequestMapping(value = "/getDevelper/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getDeveloper(@PathVariable Long id) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("success");
        responseDTO.setRes(developerService.getDeveloper(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


}
