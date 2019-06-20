package com.crowd.repository;

import com.crowd.entities.Founder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FounderDAO extends JpaRepository<Founder,Long> {

}
