package com.capco.noc2020.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@ToString
@Entity(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    @ManyToOne
    private User payer;
    @ManyToOne
    private User receiver;
    private BigDecimal amount;
}
