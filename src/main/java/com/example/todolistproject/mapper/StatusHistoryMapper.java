package com.example.todolistproject.mapper;

import com.example.todolistproject.model.dto.StatusHistoryDto;
import com.example.todolistproject.model.entity.StatusHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StatusHistoryMapper {

    StatusHistoryMapper INSTANCE = Mappers.getMapper(StatusHistoryMapper.class);

    StatusHistory mapToStatusHistory(StatusHistoryDto statusHistoryDto);

    StatusHistoryDto mapToStatusHistoryDto(StatusHistory statusHistory);
}
