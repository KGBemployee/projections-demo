package com.example.demo.service;

import com.example.demo.entity.ServiceLine;
import com.example.demo.repo.ServiceLineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceLineService {

    @Autowired
    private ServiceLineRepo serviceLineRepo;

    public Iterable<ServiceLine> getAllServiceLines() {
        return serviceLineRepo.findAll();
    }

    public ServiceLine save(ServiceLine serviceLine){
        return serviceLineRepo.save(serviceLine);
    }

}
