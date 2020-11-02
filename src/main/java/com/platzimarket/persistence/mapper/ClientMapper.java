package com.platzimarket.persistence.mapper;


import com.platzimarket.domain.Client;
import com.platzimarket.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseMapper.class})
public interface ClientMapper {
/*
    @Mappings({

            @Mapping(source = "id",target = "ClientId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "apellidos",target = "subname"),
            @Mapping(source = "celular",target = "phone"),
            @Mapping(source = "direccion",target = "adress"),
            @Mapping(source = "correoElectronico",target = "email"),
            @Mapping(source = "compras",target = "purchases"),
    })
    Client toClient(Client client);
    List<Client> toClients(List<Cliente> clients);

    @InheritInverseConfiguration
    Client toCliente(Client client);*/
}

