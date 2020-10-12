package com.example.demo.controller;

import com.example.demo.entity.OpenRole;
import com.example.demo.repo.OpenRoleRepo;
import com.example.demo.service.OpenRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
public class OpenRoleController {

    @Autowired
    private OpenRoleService openRoleService;

    @GetMapping("/getOpenRoles")
    public ResponseEntity<Iterable<OpenRole>> getAllOpenRoles() {
        return ResponseEntity.status(HttpStatus.OK).body(openRoleService.findAll());
    }

    @PostMapping("/addOpenRole")
    public ResponseEntity<OpenRole> addOpenRole(@RequestBody OpenRole openRole) {
        return ResponseEntity.status(HttpStatus.CREATED).body(openRoleService.save(openRole));
    }

    @GetMapping("/getOpenRoleById/{id}")
    public ResponseEntity<OpenRole> getRoleById(@PathVariable Long id) {
        OpenRole openRole = openRoleService.findById(id).orElse(OpenRole.builder().build());
        if (openRole.getId() != null) {
            return ResponseEntity.status(HttpStatus.OK).body(openRole);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(openRole);
        }
    }
}
