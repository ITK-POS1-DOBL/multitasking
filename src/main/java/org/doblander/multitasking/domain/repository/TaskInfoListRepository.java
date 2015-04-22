/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.multitasking.domain.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;
import javax.enterprise.context.ApplicationScoped;
import org.doblander.multitasking.domain.TaskInfo;

/**
 *
 * @author intruder
 */
@ApplicationScoped
public class TaskInfoListRepository implements TaskInfoRepository {

    private List<TaskInfo> taskInfoList;
    private int count = 0;
    
    public TaskInfoListRepository() {
        taskInfoList = new ArrayList<>();
    }
    
    @Override
    public List<TaskInfo> getTaskInfoList() {
        return taskInfoList;
    }

    public void setTaskInfoList(List<TaskInfo> taskInfoList) {
        this.taskInfoList = taskInfoList;
    }

    @Override
    public void addTaskInfo(String taskCategory, long startTime, Future future) {
        TaskInfo taskInfo = new TaskInfo();
        taskInfo.setId(getNextId());
        taskInfo.setTaskCategory(taskCategory);
        taskInfo.setStartTime(startTime);
        taskInfo.setEndTime(0);
        taskInfo.setFuture(future);
        taskInfoList.add(taskInfo);
    }

    private int getNextId() {
        return count++;
    }

    
}
