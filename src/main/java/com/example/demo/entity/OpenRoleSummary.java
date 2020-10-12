package com.example.demo.entity;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "openRoleSummary", types = OpenRole.class)
public interface OpenRoleSummary {
    String getName();
}
