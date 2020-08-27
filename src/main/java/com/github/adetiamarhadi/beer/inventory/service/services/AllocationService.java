package com.github.adetiamarhadi.beer.inventory.service.services;

import com.github.adetiamarhadi.brewery.model.BeerOrderDto;

public interface AllocationService {
    Boolean allocateOrder(BeerOrderDto beerOrderDto);

    void deallocateOrder(BeerOrderDto beerOrderDto);
}
