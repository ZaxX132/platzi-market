package com.zaxx.market.persistence.mapper;

import com.zaxx.market.domain.Purchase;
import com.zaxx.market.domain.PurchaseItem;
import com.zaxx.market.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses={PurchaseItemMapper.class})
public interface PurchaseMapper {
    @Mappings({
            @Mapping(source = "idCompra",target = "purcharseId"),
            @Mapping(source = "idCliente",target = "clientId"),
            @Mapping(source = "fecha",target = "date"),
            @Mapping(source = "medioPago",target = "paymentMethod"),
            @Mapping(source = "comentario",target = "comment"),
            @Mapping(source = "estado",target = "state"),
            @Mapping(source = "productos",target = "item")
    })
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "cliente",ignore = true)
    })
    Compra toCompra(Purchase purchase);
    List<Compra> toCompras(List<Purchase> purchases);
}
