package com.solid.adapters.out;

import com.solid.application.model.Customer;
import com.solid.application.model.bookRecommendation;
import com.solid.application.port.out.GetBookRecommendationOutPort;

import java.util.List;

public class GetBookRecommendationOutAdapter implements GetBookRecommendationOutPort {
    @Override
    public List<bookRecommendation> getRecommendation(Customer customer) {
        if (customer == null) {
            throw new NullPointerException("Customer cannot be null");
        }

        return List.of();
    }
}
