package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;



@Service
public class ShippingService {

    public double shipment(double order){
        if(order < 100.0){
            return order + 20.0;
        }
        if (order < 200.0 && order >= 100.0){
            return order + 12.0;
        }
        if (order >= 200.0){
            return order;
        }
        return 0.0;
    }
}
