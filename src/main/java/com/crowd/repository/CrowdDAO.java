package com.crowd.repository;

import com.crowd.entities.Crowd;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrowdDAO extends JpaRepository<Crowd,Long> {

}
