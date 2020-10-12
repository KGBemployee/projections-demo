package com.example.demo.controller;

import com.example.demo.entity.ServiceLine;
import com.example.demo.service.ServiceLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ServiceLineController {

    @Autowired
    private ServiceLineService serviceLineService;

    @GetMapping("/getServiceLines")
    public ResponseEntity<Iterable<ServiceLine>> getAllServiceLines(){
        return ResponseEntity.status(HttpStatus.OK).body(
                serviceLineService.getAllServiceLines()
        );
    }

    @PostMapping(value = "/addServiceLine", consumes = "application/json")
    public ResponseEntity<ServiceLine> addServiceLine(@RequestBody ServiceLine serviceLine) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                serviceLineService.save(serviceLine)
        );
    }
}
