package com.github.adetiamarhadi.sfg.beer.common.events;

import com.github.adetiamarhadi.sfg.beer.common.events.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

    static final Long serialVersionUID = 1L;

    private BeerDto beerDto;
}
