package com.web.spring.springapp.repository;

import com.web.spring.springapp.entities.Spid;
import com.web.spring.springapp.entities.Spid;
import com.web.spring.springapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpidRepository extends JpaRepository<Spid, Long> {
    Optional<Spid> findById(long id) ;

    @Query(nativeQuery = true,value = "SELECT * FROM rest.spid WHERE createdBy LIKE %:xkasaj% ")
    List<Spid> searchSpid(@Param("xkasaj") String createdBy);


}
