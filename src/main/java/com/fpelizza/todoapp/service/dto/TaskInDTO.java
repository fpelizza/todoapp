package com.fpelizza.todoapp.service.dto;

import com.fpelizza.todoapp.persistence.entities.TaskStatus;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TaskInDTO {
    private String title;
    private String description;
    private LocalDateTime eta;

}
