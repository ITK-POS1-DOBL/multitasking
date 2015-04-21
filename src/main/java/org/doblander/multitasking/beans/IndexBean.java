/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.multitasking.beans;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

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

    /**
     * Creates a new instance of IndexBean
     */
    public IndexBean() {
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
