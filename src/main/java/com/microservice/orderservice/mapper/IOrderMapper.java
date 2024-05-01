package com.microservice.orderservice.mapper;

import com.microservice.orderservice.dto.OrderLineItemsDto;
import com.microservice.orderservice.model.OrderLineItems;

public interface IOrderMapper {
    OrderLineItems toEntity(OrderLineItemsDto orderLineItemsDto);
}
