package com.company;

import com.company.Abstract.BaseCustomerManager;
import com.company.Adapters.MernisServiceAdapter;
import com.company.Concrete.NeroCustomerManager;
import com.company.Concrete.StarbucksCustomerManager;
import com.company.Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //*********************************************************************
        Customer customer = new Customer();
        customer.setFirstName("dsd");
        customer.setId(23);
        customer.setNationalityId("10451669114");
        customer.setFirstName("Mahmut Eren");
        customer.setLastName("Ünal");
        customer.setDateOfBirth(LocalDate.of(2005,5,5));

        //*********************************************************************

        BaseCustomerManager nero = new NeroCustomerManager();
        BaseCustomerManager star = new StarbucksCustomerManager(new MernisServiceAdapter());
        star.Save(customer);
        nero.Save(customer);

    }
}
