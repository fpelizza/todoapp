package com.fpelizza.todoapp.mapper;

import com.fpelizza.todoapp.persistence.entities.Task;
import com.fpelizza.todoapp.persistence.entities.TaskStatus;
import com.fpelizza.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO,Task>{
    @Override
    public Task map(TaskInDTO in) {
        Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setEta(in.getEta());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        task.setArchived(false);
        return task;
    }
}
