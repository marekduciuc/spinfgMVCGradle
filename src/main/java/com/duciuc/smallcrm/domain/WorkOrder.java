package com.duciuc.smallcrm.domain;

import org.joda.time.DateTime;

public class WorkOrder {
    private String description;
    private Person customer;
    private OrderType orderType;
    private DateTime enterDate;
    private DateTime finishDate;

    public WorkOrder() {
    }

    public WorkOrder(String description, Person customer, OrderType orderType, DateTime enterDate) {
        this.description = description;
        this.customer = customer;
        this.orderType = orderType;
        this.enterDate = enterDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
