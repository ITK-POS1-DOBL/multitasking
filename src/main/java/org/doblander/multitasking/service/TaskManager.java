/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.multitasking.service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.inject.Inject;
import org.doblander.multitasking.domain.TaskHigh;
import org.doblander.multitasking.domain.repository.TaskInfoRepository;
import org.doblander.multitasking.domain.TaskLow;
import org.doblander.multitasking.domain.TaskMedium;

/**
 *
 * @author intruder
 */
@Stateless
public class TaskManager {

    @Resource
    ManagedExecutorService executor;

    @Inject
    TaskInfoRepository taskInfoRepo;
    
    /**
     *
     * @param taskCategory the value of taskCategory
     */
    public void createThreadWithTask(String taskCategory) {
        
        Future future = executor.submit(createTaskByType(taskCategory));
        taskInfoRepo.addTaskInfo(taskCategory, new Date().getTime(), future);
        
    }

    /**
     * Create Task of given complexity.
     * @param taskType
     * @return A Callable that can directly be used with Executor
     */
    public Callable createTaskByType(String taskType) {
        Callable myCallable;
        
        switch (taskType) {
            case "low complexity": 
                myCallable = new TaskLow();
                break;
            case "medium complexity":
                myCallable = new TaskMedium();
                break;
            case "high complexity":
                myCallable = new TaskHigh();
                break;
            default: 
                myCallable = null;
                break;
        }
        
        return myCallable;
    }

    public List getTaskList() {
        return taskInfoRepo.getTaskInfoList();
    }

    
}
