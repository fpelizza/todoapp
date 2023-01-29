package com.fpelizza.todoapp.persistence.repositories;

import com.fpelizza.todoapp.persistence.entities.Task;
import com.fpelizza.todoapp.persistence.entities.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    public List<Task> findAllByTaskStatus(TaskStatus status);

    @Query(value = "SELECT t.* FROM TASK t WHERE t.archived=true", nativeQuery = true)
    public List<Task> findAllArchivedTasks();

    @Modifying
    @Query(value = "UPDATE TASK SET FINISHED=true WHERE ID=:id", nativeQuery = true)
    public void markTaskAsFinished(@Param("id") Long id);

    @Modifying
    @Query(value = "UPDATE TASK SET ARCHIVED=:archived WHERE ID=:id", nativeQuery = true)
    public void markTaskAsArchived(@Param("id") Long id, @Param("archived") Boolean archived);

}
