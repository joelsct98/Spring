package com.platzimarket.persistence;

import com.platzimarket.domain.Purchase;
import com.platzimarket.domain.repository.PurchaseRepository;
import com.platzimarket.persistence.crud.ComprasCrudRepository;
import com.platzimarket.persistence.entity.Compra;
import com.platzimarket.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ComprasRepository implements PurchaseRepository {

    @Autowired
    private ComprasCrudRepository comprasCrudRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) comprasCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return comprasCrudRepository.findByIdCliente(clientId)
                .map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra= mapper.toCompra(purchase);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));

        return mapper.toPurchase(comprasCrudRepository.save(compra));
    }
}
