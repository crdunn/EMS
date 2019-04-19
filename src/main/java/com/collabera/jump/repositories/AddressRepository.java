package com.collabera.jump.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.collabera.jump.models.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{

}
