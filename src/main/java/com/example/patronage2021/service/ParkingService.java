package com.example.patronage2021.service;

import com.example.patronage2021.model.Parking;
import com.example.patronage2021.repository.ParkingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ParkingService {

    private final ParkingRepository parkingRepository;


    public List<Parking> getParking() {
        return parkingRepository.findAll();
    }
    public Parking getSinglePlace(Long id) {
        return parkingRepository.findById(id)
                .orElseThrow();
    }
    public List<Parking> findAllByStatus(Boolean status) {
        return parkingRepository.findAllByStatus(status);
    }
    public Parking createReservation(Parking parking) {
        return parkingRepository.save(parking);

    }

    public void deleteReservation(Long id) {

    }
}
