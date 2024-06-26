package com.flighttest.metrics.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flighttest.metrics.domain.User;




@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
