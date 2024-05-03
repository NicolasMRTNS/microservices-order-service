package com.microservice.orderservice.service;

import com.microservice.orderservice.dto.OrderRequest;
import com.microservice.orderservice.mapper.OrderMapperImpl;
import com.microservice.orderservice.model.Order;
import com.microservice.orderservice.model.OrderLineItems;
import com.microservice.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
    private final OrderMapperImpl orderMapper;
    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(orderMapper::toEntity)
                .toList();
        order.setOrderLineItemList(orderLineItems);
        orderRepository.save(order);
    }
}
