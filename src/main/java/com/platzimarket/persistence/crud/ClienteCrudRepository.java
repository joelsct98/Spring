package com.platzimarket.persistence.crud;

import com.platzimarket.domain.Client;
import com.platzimarket.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
//esto es para hacer querys
public interface ClienteCrudRepository extends CrudRepository<Cliente,String> {

    Optional<List<Client>> findByNombre(String nombre);
}
