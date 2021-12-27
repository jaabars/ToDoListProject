package com.example.todolistproject.mapper;

import com.example.todolistproject.model.dto.TaskDto;
import com.example.todolistproject.model.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TaskMapper {

    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    Task mapToTask(TaskDto taskDto);

    TaskDto mapToTaskDto(Task task);

    List<TaskDto> mapToTaskDtoList(List<Task> taskList);
}
