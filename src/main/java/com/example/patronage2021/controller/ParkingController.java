package com.example.patronage2021.controller;

import com.example.patronage2021.model.Parking;
import com.example.patronage2021.service.ParkingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }


    @GetMapping("/parking")
    public List<Parking> getParkingPlaces() {
        return parkingService.getParking();

    }

    @GetMapping("/parking/{id}")
    public Parking getSinglePlace(@PathVariable Long id) {
        return parkingService.getSinglePlace(id);
    }

    @GetMapping("parking/{status}")
    public List<Parking> findALlByStatus(@PathVariable Boolean status) {
        return parkingService.findAllByStatus(status);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Parking createReservation(@RequestBody Parking parking) {
        return parkingService.createReservation(parking);

    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteReservation(@PathVariable Long id) {
        parkingService.deleteReservation(id);
    }

}