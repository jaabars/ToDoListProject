package com.example.todolistproject.mapper;

import com.example.todolistproject.model.dto.UserDto;
import com.example.todolistproject.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapToUser(UserDto userDto);

    UserDto mapToUserDto(User user);

    List<User> mapToUserList(List<UserDto> userDtoList);

    List<UserDto> mapToUserDtoList(List<User> userList);

}
