package com.example.patronage2021.repository;

import com.example.patronage2021.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingRepository extends JpaRepository <Parking, Long> {

    @Query(value = "select i from Parking i where i.status = true ")
     List<Parking> findAllByStatus(Boolean status);
    }
