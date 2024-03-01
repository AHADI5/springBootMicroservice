package com.ushirikeduc.app;

import org.springframework.stereotype.Service;

@Service
public record  CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.name())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo

    }
}
