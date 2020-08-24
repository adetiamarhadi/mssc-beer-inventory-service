package com.github.adetiamarhadi.sfg.beer.inventory.service.services;

import com.github.adetiamarhadi.sfg.brewery.model.BeerOrderDto;

public interface AllocationService {
    Boolean allocateOrder(BeerOrderDto beerOrderDto);

    void deallocateOrder(BeerOrderDto beerOrderDto);
}
