package com.company.Concrete;

import com.company.Abstract.ICostumerService;
import com.company.Abstract.ICustomerCheckService;
import com.company.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;

    }
}
