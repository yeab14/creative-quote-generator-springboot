package com.example.creativequotes.controller;

import com.example.creativequotes.model.Quote;
import com.example.creativequotes.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuoteController {

    @Autowired
    private QuoteRepository quoteRepository;

    // Home page that shows a random quote
    @GetMapping("/")
    public String home(Model model) {
        Quote randomQuote = quoteRepository.findRandomQuote();
        model.addAttribute("quote", randomQuote);
        return "index";  // Render index.html
    }

    // Route to add a new quote
    @PostMapping("/add-quote")
    public String addQuote(@RequestParam String text, @RequestParam String author) {
        Quote newQuote = new Quote(null, text, author);
        quoteRepository.save(newQuote);  // Save the quote to the database
        return "redirect:/";  // Redirect back to home page
    }
}
