package com.manuel.store.mappers;

import com.manuel.store.dtos.UserDto;
import com.manuel.store.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
