package com.duciuc.smallcrm.service;

import com.duciuc.smallcrm.domain.WorkOrder;

import java.util.List;

public interface WorkOrderService {

    List<WorkOrder> getOrdersForCustomer(String name);

}
