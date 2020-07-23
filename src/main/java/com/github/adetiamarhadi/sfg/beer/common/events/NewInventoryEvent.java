package com.github.adetiamarhadi.sfg.beer.common.events;

import com.github.adetiamarhadi.sfg.beer.common.events.BeerDto;
import com.github.adetiamarhadi.sfg.beer.common.events.BeerEvent;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
