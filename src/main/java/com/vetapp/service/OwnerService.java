package com.vetapp.service;

import com.vetapp.model.Owner;
import org.springframework.security.core.Authentication;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    List<Owner> findAll();

    List<Owner> findOwnersByOwnerName(String ownerName);

    boolean existEmail(String email);

    Optional<Owner> findById(Long id);

    Long totalOwners();

    void save(Owner owner);

    Owner update(Owner owner);

    void delete(Long id);
}
