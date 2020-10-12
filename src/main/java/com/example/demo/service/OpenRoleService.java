package com.example.demo.service;

import com.example.demo.entity.OpenRole;
import com.example.demo.repo.OpenRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OpenRoleService {

    @Autowired
    private OpenRoleRepo openRoleRepo;

    public OpenRole save(OpenRole openRole) {
       return openRoleRepo.save(openRole);
    }

    public Iterable<OpenRole> findAll() {
        return openRoleRepo.findAll();
    }

    public Optional<OpenRole> findById(Long id) {
       return openRoleRepo.findById(id);
    }
}
