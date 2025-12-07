package com.example.spring_webflux.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "peoples")
public class People {
    @Id
    private Long id;
    private String name;
    private String lastName;
    private String gmail;
    private String cc;
}
