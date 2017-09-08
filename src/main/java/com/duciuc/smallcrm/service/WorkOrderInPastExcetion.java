package com.duciuc.smallcrm.service;

import com.duciuc.CRMException;
import org.joda.time.DateTime;

public class WorkOrderInPastExcetion extends CRMException {

    public static final long serialVersionUID = 1L;
    private String descrition;
    private DateTime date;


    public WorkOrderInPastExcetion(String descrition, DateTime date) {
        this.descrition = descrition;
        this.date = date;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }
}



