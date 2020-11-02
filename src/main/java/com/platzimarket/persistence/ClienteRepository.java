package com.platzimarket.persistence;

import com.platzimarket.domain.Client;
import com.platzimarket.domain.Purchase;
import com.platzimarket.domain.repository.ClientRepository;
import com.platzimarket.persistence.crud.ClienteCrudRepository;
import com.platzimarket.persistence.entity.Cliente;
import com.platzimarket.persistence.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {
/*
    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    @Autowired
    private ClientMapper mapper;


    @Override
    public List<Client> getAll() {
        return  mapper.toClients((List<Cliente>) clienteCrudRepository.findAll());
    }

    @Override
    public Optional<List<Client>> getByName(String name) {
        return clienteCrudRepository.findByNombre(name);
    }

    @Override
    public Purchase save(Client client) {
        return null;
    }

    @Override
    public Purchase save(Client client) {
        Cliente cliente = mapper.toClient(client);
        return mapper.toClient(clienteCrudRepository.save(cliente));
    }*/
}
