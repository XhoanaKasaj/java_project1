package com.web.spring.springapp.repository;

import com.web.spring.springapp.entities.Spid;
import com.web.spring.springapp.entities.Spid;
import com.web.spring.springapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpidRepository extends JpaRepository<Spid, Long> {
    Optional<Spid> findById(long id) ;

}
