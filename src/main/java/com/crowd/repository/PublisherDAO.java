package com.crowd.repository;

import com.crowd.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherDAO extends JpaRepository<Publisher,Long> {

}
