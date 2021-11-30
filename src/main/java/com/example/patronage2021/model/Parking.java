package com.example.patronage2021.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Parking {

    @Id
    @JoinColumn(name = "status")
    private Long id;
    private int number;
    private int storey;
    private String type;
    private boolean status;

}
