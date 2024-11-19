package com.example.creativequotes.repository;

import com.example.creativequotes.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
    // Custom query to fetch a random quote
    Quote findRandomQuote();
}

