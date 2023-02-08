package com.gmail.alexejkrawez.mapper;

import com.gmail.alexejkrawez.dto.UserDto;
import com.gmail.alexejkrawez.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    @Mapping(target="telegramUserId", source="telegramUserId")
    UserDto toUserDto(User user);
}
