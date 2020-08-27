package com.github.adetiamarhadi.beer.inventory.service.services;

import com.github.adetiamarhadi.brewery.model.events.DeallocateOrderRequest;
import com.github.adetiamarhadi.beer.inventory.service.config.JmsConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class DeallocationListener {

    private final AllocationService allocationService;

    @JmsListener(destination = JmsConfig.DEALLOCATE_ORDER_QUEUE)
    public void listen(DeallocateOrderRequest request) {
        this.allocationService.deallocateOrder(request.getBeerOrderDto());
    }
}
