package com.company.Abstract;

import com.company.Entities.Customer;

public abstract class BaseCustomerManager implements ICostumerService {


    @Override
    public void Save(Customer customer) {
        System.out.println("Saved to DB".concat(" ") + customer.getFirstName());

    }
}
