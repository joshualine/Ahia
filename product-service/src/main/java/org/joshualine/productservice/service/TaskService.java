package org.joshualine.productservice.service;

import org.joshualine.productservice.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskService {
    private final List<Task> task = new ArrayList<>();

    public TaskService() {
    }

    public List<Task> getAllTasks(){
        return task;
    }
}
