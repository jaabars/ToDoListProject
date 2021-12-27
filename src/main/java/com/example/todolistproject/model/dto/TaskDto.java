package com.example.todolistproject.model.dto;

import com.example.todolistproject.model.enums.Status;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import javax.validation.constraints.NotBlank;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskDto {

    Long id;

    @NotBlank
    String taskName;

    @NotBlank
    String description;

    Status status;

    @NotBlank
    String userName;

    public TaskDto() {
    }

    public TaskDto(Long id) {
        this.id = id;
    }
}
