package com.univer.universitet_bt.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "university")
@Data
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "regionId", referencedColumnName = "id")
    private Region region;
}