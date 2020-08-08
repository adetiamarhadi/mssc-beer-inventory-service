package com.github.adetiamarhadi.sfg.beer.inventory.service.web.mappers;

import com.github.adetiamarhadi.sfg.beer.inventory.service.domain.BeerInventory;
import com.github.adetiamarhadi.sfg.brewery.model.BeerInventoryDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-31.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
