package com.CK.repository;

import com.CK.entity.Address;

public class AddressRepository extends RepositoryManager<Address,Long> {
    public AddressRepository() {
        super(new Address());
    }
}
