package com.example.demo.repo;

import com.example.demo.entity.ServiceLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceLineRepo extends CrudRepository<ServiceLine, Long> {
}
