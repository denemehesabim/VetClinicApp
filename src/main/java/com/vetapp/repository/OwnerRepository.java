package com.vetapp.repository;

import com.vetapp.model.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository {

    List<Owner> findAll();

    Optional<Owner> findById(Long id);

    boolean existEmail(String email);

    List<Owner> findOwnersByOwnerName(String ownerName);

    Long totalOwners();

    void save(Owner owner);

    Owner update(Owner owner);

    void delete(Long id);

}
