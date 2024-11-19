package com.example.creativequotes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quote {

    @Id
    private Long id;  // Unique ID for each quote
    private String text;  // Quote text
    private String author;  // Author of the quote
}
