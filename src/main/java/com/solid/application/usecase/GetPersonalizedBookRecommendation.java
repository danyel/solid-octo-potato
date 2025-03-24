package com.solid.application.usecase;

import com.solid.application.model.Customer;
import com.solid.application.model.bookRecommendation;
import com.solid.application.port.in.GetCurrentCustomerInPort;
import com.solid.application.port.out.GetBookRecommendationOutPort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetPersonalizedBookRecommendation {
    private final GetCurrentCustomerInPort getCurrentCustomerInPort;
    private final GetBookRecommendationOutPort getBookRecommendationOutPort;

    List<bookRecommendation> getRecommendations() {
        Customer currentCustomer = getCurrentCustomerInPort.getCurrentCustomer();
        return getBookRecommendationOutPort.getRecommendation(currentCustomer);
    }
}
