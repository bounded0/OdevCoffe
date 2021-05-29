package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.ICustomerCheckService;
import com.company.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
    ICustomerCheckService customerCheckService;


    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    @Override
    public void Save(Customer customer)
    {
        if(customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        }
        else{
            System.out.println("not a valid person");
        }



    }


}
