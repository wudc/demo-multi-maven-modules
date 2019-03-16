package com.demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
