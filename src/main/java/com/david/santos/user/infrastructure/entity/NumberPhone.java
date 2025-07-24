package com.david.santos.user.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name="tb_number_phone")
public class NumberPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="number", length = 10)
    private String number;
    @Column(name="ddd", length = 3)
    private String ddd;

}
