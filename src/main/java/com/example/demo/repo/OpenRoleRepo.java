package com.example.demo.repo;

import com.example.demo.entity.OpenRole;
import com.example.demo.entity.OpenRoleSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface OpenRoleRepo extends JpaRepository<OpenRole, Long> {
}
