package org.joshualine.productservice.controller;

import org.joshualine.productservice.model.Task;
import org.joshualine.productservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/v2")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping("")
    public List<Task> getAllTask(){
        return taskService.getAllTasks();
    }
}
