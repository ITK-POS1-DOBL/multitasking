/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.multitasking.beans;

import org.doblander.multitasking.domain.TaskInfo;

/**
 *
 * @author intruder
 */
public class TaskInfoItem {

    private String taskId;
    private String task;
    private String startTime;
    private String endTime;
    private String status;

    public TaskInfoItem() {

    }

    public TaskInfoItem(String threadId, String task, String startTime, String endTime, String status) {
        this.taskId = threadId;
        this.task = task;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public TaskInfoItem(TaskInfo taskInfo) {
        this.taskId = String.valueOf(taskInfo.getId());
        this.task = taskInfo.getTaskCategory();
        this.startTime = String.valueOf(taskInfo.getStartTime());
        this.endTime = String.valueOf(taskInfo.getEndTime());
        this.status = taskInfo.getStatus();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
