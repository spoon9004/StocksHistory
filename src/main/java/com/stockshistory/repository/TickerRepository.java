package com.stockshistory.repository;

import com.stockshistory.entity.Ticker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.UUID;
@Repository
public interface TickerRepository extends JpaRepository<Ticker, UUID> {
    List<Ticker> findbyUserId(Long userId);
}
