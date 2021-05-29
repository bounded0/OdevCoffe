package com.company.Adapters;

import com.company.Abstract.ICustomerCheckService;
import com.company.Entities.Customer;

import com.company.MernisSerivce.CJDKPSPublicSoap;



public class MernisServiceAdapter implements ICustomerCheckService {
    CJDKPSPublicSoap client = new CJDKPSPublicSoap();

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        try{
            return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId())
                    ,customer.getFirstName().toUpperCase()
                    ,customer.getLastName().toUpperCase()
                    ,customer.getDateOfBirth().getYear());
        }

        catch (Exception e ){
            e.printStackTrace();
        }
        return false;
    }
}
