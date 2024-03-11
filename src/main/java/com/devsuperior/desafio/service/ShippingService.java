package com.devsuperior.desafio.service;

import com.devsuperior.desafio.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){

        double value = order.getBasic().doubleValue();

        if (value < 100.0 )
            return 20.00;
        if(value >= 100 && 200 > value)
            return 12.00;

        return 0.0;
    }
}
