package com.sda.javagda31.mechanics.model;

import com.sun.xml.bind.v2.model.core.ID;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String registration;
    @Enumerated(value = EnumType.STRING)
    private EngineType engineType;
    private long mileage;
    private double engineCapacity;
    private String vin;

    @OneToMany(mappedBy = "car")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<ServiceOrder> serviceOrders;
}
