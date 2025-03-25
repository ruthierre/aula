package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.entities.Order;

@Service
public class OrderService  {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discountAmount = order.getBasic() * order.getDiscount() / 100.0;
        return order.getBasic() - discountAmount + shippingService.shipment(order.getBasic());
    }

}

