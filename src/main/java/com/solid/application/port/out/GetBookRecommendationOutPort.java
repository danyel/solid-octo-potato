package com.solid.application.port.out;

import com.solid.application.model.Customer;
import com.solid.application.model.bookRecommendation;

import java.util.List;

public interface GetBookRecommendationOutPort {
    List<bookRecommendation> getRecommendation(Customer customer);
}
