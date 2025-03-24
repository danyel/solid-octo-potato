package com.solid.controller;

import com.solid.application.model.bookRecommendation;
import com.solid.application.usecase.GetPersonalizedBookRecommendation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class BookResource {
    private final GetPersonalizedBookRecommendation getPersonalizedBookRecommendation;
    @RequestMapping(method = RequestMethod.GET, path = "/book/get-recommendations")
    public List<bookRecommendation> getRecommendations() {
        return getPersonalizedBookRecommendation.getRecommendations();
    }
}
