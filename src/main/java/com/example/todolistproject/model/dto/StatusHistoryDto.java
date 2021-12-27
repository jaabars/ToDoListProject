package com.example.todolistproject.model.dto;

import com.example.todolistproject.model.entity.Task;
import com.example.todolistproject.model.enums.Status;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StatusHistoryDto {

    Long id;
    TaskDto task;
    LocalDateTime startDate;
    LocalDateTime endDate;
    Status status;
}
