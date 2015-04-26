/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.multitasking.domain.repository;

import java.util.List;
import java.util.concurrent.Future;
import org.doblander.multitasking.domain.TaskInfo;

/**
 * Repository for TaskInfo objects.
 *
 * @author intruder
 */
public interface TaskInfoRepository {

    /**
     * Returns the whole list of tasks in the repository.
     *
     * @return Complete list of all stored task info objects.
     */
    public List<TaskInfo> getTaskInfoList();

    /**
     * Stores a new task info object in the repository.
     *
     * @param taskCategory Type of task to be stored.
     * @param startTime Time the task was started.
     * @param endTime the value of endTime
     * @param status the value of status
     * @param future The future object representing the result object of the
 task.
     */
    public void addTaskInfo(String taskCategory, long startTime, long endTime, 
                            String status, Future future);
}
