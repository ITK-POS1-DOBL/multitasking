/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.multitasking.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.doblander.multitasking.service.TaskManager;

/**
 * Managed Bean for JSF page index.xhtml.
 *
 * @author intruder
 */
@Named(value = "indexBean")
@RequestScoped
public class IndexBean {

    private boolean showThreadList = true;
    private List<ThreadInfoItem> threadList = new ArrayList<>();
    private List<String> taskList
            = new ArrayList<>(Arrays.asList("low complexity",
                            "medium complexity", "high complexity"));
    private String taskListItem;

    @EJB
    private TaskManager taskMgr;

    /**
     * Creates a new instance of IndexBean
     */
    public IndexBean() {
        
    }

    public void startTask() {

        taskMgr.createThreadWithTask(getTaskListItem());
    }

    /**
     * Get the value of taskListItem
     *
     * @return the value of taskListItem
     */
    public String getTaskListItem() {
        return taskListItem;
    }

    /**
     * Set the value of taskListItem
     *
     * @param taskListItem new value of taskListItem
     */
    public void setTaskListItem(String taskListItem) {
        this.taskListItem = taskListItem;
    }

    /**
     * Get the value of taskList
     *
     * @return the value of taskList
     */
    public List<String> getTaskList() {
        return taskList;
    }

    /**
     * Set the value of taskList
     *
     * @param taskList new value of taskList
     */
    public void setTaskList(List<String> taskList) {
        this.taskList = taskList;
    }

    /**
     * Get the value of threadList
     *
     * @return the value of threadList
     */
    public List<ThreadInfoItem> getThreadList() {
        return threadList;
    }

    /**
     * Set the value of threadList
     *
     * @param threadList new value of threadList
     */
    public void setThreadList(List<ThreadInfoItem> threadList) {
        this.threadList = threadList;
    }

    /**
     * Get the value of showThreadList
     *
     * @return the value of showThreadList
     */
    public boolean isShowThreadList() {
        return showThreadList;
    }

    /**
     * Set the value of showThreadList
     *
     * @param showThreadList new value of showThreadList
     */
    public void setShowThreadList(boolean showThreadList) {
        this.showThreadList = showThreadList;
    }

}
