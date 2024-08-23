package com.indium.spring_boot_rest_api.lab05.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "topics")
@ToString
public class Topic {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String id;
    @Column
    private String title;
    @Column
    private int duration;
}
