package com.microservice.orderservice.mapper;

import com.microservice.orderservice.dto.OrderLineItemsDto;
import com.microservice.orderservice.model.OrderLineItems;
import org.springframework.stereotype.Component;

@Component
public class OrderMapperImpl implements IOrderMapper {

    @Override
    public OrderLineItems toEntity(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItems.getQuantity());
        return orderLineItems;
    }
}
