package com.duciuc.smallcrm.service;

import com.duciuc.smallcrm.domain.OrderType;
import com.duciuc.smallcrm.domain.Person;
import com.duciuc.smallcrm.domain.WorkOrder;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WorkOrderServiceImpl implements WorkOrderService {

    public static final OrderType GAS_NEW = new OrderType(1,"Novy Plyn");
    public static final OrderType GAS_REPAIR = new OrderType(1,"Oprava Plynu");
    public static final OrderType GAS_REVISION = new OrderType(1,"Revyze Plynu");

    private List<WorkOrder> workOrders;

    public WorkOrderServiceImpl() {
        workOrders = new ArrayList<WorkOrder>();

        workOrders.add(new WorkOrder("Revize duciuc",
                new Person("Marek","Duciuc","marek.duciuc@gmail.com","608556401"),
                GAS_REVISION, DateTime.now()));
        workOrders.add(new WorkOrder("Korel novak",
                new Person("Petr","Novak","petr.novak@gmail.com","608556401"),
                GAS_NEW, DateTime.now()));
    }

    @Override
    public List<WorkOrder> getOrdersForCustomer(String name) {
        return workOrders.stream().filter(a-> a.getCustomer().getName().equals(name)).collect(Collectors.toList());
    }
}
