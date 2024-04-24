package com.stockshistory.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ticker")
@RequiredArgsConstructor
@Data
public class Ticker {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "ticker_name", nullable = false)
    private String ticker;
    @Column(name = "date_ticker")
    private LocalDateTime date;
    @Column(name = "open_value")
    private BigDecimal open;
    @Column(name = "close_value")
    private BigDecimal close;
    @Column(name = "high_value")
    private BigDecimal high;
    @Column(name = "low_value")
    private BigDecimal low;

}
