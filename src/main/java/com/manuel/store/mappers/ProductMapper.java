package com.manuel.store.mappers;

import com.manuel.store.dtos.ProductDto;
import com.manuel.store.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);
}
