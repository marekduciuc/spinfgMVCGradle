package com.duciuc.smallcrm.domain;

import org.joda.time.DateTime;

public class WorkOrder {
    private String descrition;
    private Person customer;
    private OrderType orderType;
    private DateTime enterDate;
    private DateTime finishDate;

    public WorkOrder(){}

    public WorkOrder(String descrition, Person customer, OrderType orderType, DateTime enterDate) {
        this.descrition = descrition;
        this.customer = customer;
        this.orderType = orderType;
        this.enterDate = enterDate;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public DateTime getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(DateTime enterDate) {
        this.enterDate = enterDate;
    }

    public DateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(DateTime finishDate) {
        this.finishDate = finishDate;
    }
}
