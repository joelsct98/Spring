package com.platzimarket.domain.repository;

import com.platzimarket.domain.Client;
import com.platzimarket.domain.Purchase;
import com.platzimarket.persistence.crud.ClienteCrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {

    List<Client> getAll();
    Optional<List<Client>> getByName(String name);
    Purchase save(Client client);

}
