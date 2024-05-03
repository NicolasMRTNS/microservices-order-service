package com.microservice.orderservice.mapper;

import com.microservice.orderservice.dto.IAppDto;
import com.microservice.orderservice.model.IAppEntity;

public interface IMapper<E extends IAppEntity, D extends IAppDto> {
    E toEntity(D dto);
}
